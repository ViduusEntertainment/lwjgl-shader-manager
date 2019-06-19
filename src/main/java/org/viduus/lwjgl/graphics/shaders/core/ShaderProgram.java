/*
 * Copyright 2019 Viduus Entertainment LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.viduus.lwjgl.graphics.shaders.core;

import org.viduus.lwjgl.graphics.shaders.core.layouts.DataLayout;

import java.io.IOException;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * This class provides the developer with a simple interface for accessing shader variables. It is
 * also responsible for creating the shader program in the gpu.
 */
public abstract class ShaderProgram {

	final ShaderVariableInterface var_interface;

	private final ShaderManager manager;
	private final DataLayout layout;
	private final SymbolTable variables;
	private final Map<ShaderType, ShaderSource> sources;
	private final String name;

	private int gpu_id;

	/**
	 * Creates, compiles, attaches, and links a shader program. When looking for the shader files
	 * it looks for files with the same name but different extensions.
	 *
	 * @param shader_name   The name of the shader
	 * @param manager       The shader manager responsible for this shader
	 * @param layout        The layout to use for this shader
	 * @param var_interface The variable interface to use for this shader
	 * @throws IOException     If a shader file could not be read for any reason
	 * @throws ShaderException If a shader failed to compile
	 * @throws ShaderException If the program does not have at least a vertex and fragment shader
	 * @throws ShaderException If the program fails to link
	 * @throws ShaderException If the program fails it's validation check
	 */
	public ShaderProgram(String shader_name, ShaderManager manager, DataLayout layout, ShaderVariableInterface var_interface) throws IOException, ShaderException {
		this.name = shader_name;
		this.manager = manager;
		this.layout = layout;
		this.var_interface = var_interface;
		createProgram();

		// load, compile, and attach shader sources
		sources = new EnumMap<>(ShaderType.class);
		for (ShaderType type : ShaderType.values()) {
			sources.put(type, loadSource(shader_name, type));
		}

		if (!sources.get(ShaderType.VERTEX).exists() || !sources.get(ShaderType.FRAGMENT).exists()) {
			throw new ShaderException("Shader '%s' must have a vertex and fragment shader specified.", shader_name);
		}
		errorCheck("load, compile, and attach");

		// finish setting up program
		link();
		validate();

		// collect symbol tables from shaders
		variables = new SymbolTable();
		loadShaderVariables(variables);

		// deal with attributes
		variables.attributes().forEach(var -> var_interface.bindAttribute(this, var));
		errorCheck("attributes");

		// deal with uniforms
		variables.uniforms().forEach(var -> {
			var_interface.bindUniform(this, var);
			var_interface.loadUniform(this, var);
		});
		errorCheck("uniforms");
	}

	/**
	 * This function is responsible for loading all shader variables and adding them to the passed
	 * symbol table. Any variables not added to this symbol table will not be accessible through
	 * the getter functions.
	 *
	 * @param variables The symbol table to build
	 */
	protected abstract void loadShaderVariables(SymbolTable variables);

	/**
	 * Does api specific error checking
	 *
	 * @param info A message that should be reported with the error
	 */
	public abstract void errorCheck(String info);

	/**
	 * @return The name of the shader
	 */
	public String name() {
		return name;
	}

	/**
	 * @return The manager in charge of this shader program
	 */
	ShaderManager manager() {
		return manager;
	}

	/**
	 * Sets the id assigned bu the gpu
	 *
	 * @param id The new id
	 */
	protected void id(int id) {
		gpu_id = id;
	}

	/**
	 * @return The id which was assigned by the gpu
	 */
	public int id() {
		return gpu_id;
	}

	/**
	 * @return The data layout that this shader uses
	 * @see DataLayout
	 */
	public DataLayout dataLayout() {
		return layout;
	}

	/**
	 * Checks if a uniform exists
	 *
	 * @param uniform_name The name of the uniform
	 * @return True if the uniform exists, false otherwise
	 */
	public boolean uniformExists(String uniform_name) {
		return variables.has(uniform_name) && variables.get(uniform_name).usage == UsageFlag.UNIFORM;
	}

	/**
	 * Looks for, returns, and validates a uniform
	 *
	 * @param uniform_name The name of the uniform
	 * @return The found uniform
	 * @throws ShaderException If the variable does not exist
	 * @throws ShaderException If the variable is not a uniform
	 */
	public ShaderVariable uniform(String uniform_name) throws ShaderException {
		ShaderVariable var = variables.get(uniform_name);
		var.usageCheck(UsageFlag.UNIFORM);
		return var;
	}

	/**
	 * @return A list of all uniforms
	 */
	public List<ShaderVariable> uniforms() {
		return variables.uniforms().collect(Collectors.toList());
	}

	/**
	 * Checks if a uniform exists
	 *
	 * @param attribute_name The name of the uniform
	 * @return True if the attribute exists, false otherwise
	 */
	public boolean attributeExists(String attribute_name) {
		return variables.has(attribute_name) && variables.get(attribute_name).usage == UsageFlag.ATTRIBUTE;
	}

	/**
	 * Looks for, returns, and validates an attribute
	 *
	 * @param variable_name The name of the attribute
	 * @return The found attribute
	 * @throws ShaderException If the variable does not exist
	 * @throws ShaderException If the variable is not a uniform
	 */
	public ShaderVariable attribute(String variable_name) throws ShaderException {
		ShaderVariable var = variables.get(variable_name);
		var.usageCheck(UsageFlag.ATTRIBUTE);
		return var;
	}

	/**
	 * @return A list of all attributes
	 */
	public List<ShaderVariable> attributes() {
		return variables.attributes().collect(Collectors.toList());
	}

	/**
	 * Creates a new shader program in the GPU
	 */
	protected abstract void createProgram();

	/**
	 * Loads and creates a new shader source.
	 *
	 * @param shader_name The name of the shader to load
	 * @param type        The type of shader to load
	 * @return The new shader
	 * @throws IOException If shader file could not be read
	 */
	protected abstract ShaderSource loadSource(String shader_name, ShaderType type) throws IOException;

	/**
	 * Validates that the shader program linked correctly
	 */
	protected abstract void validate();

	/**
	 * Links all of the shader sources together
	 */
	protected abstract void link();

	/**
	 * Unbinds the shader from the GPU
	 */
	public abstract void unbind();

	/**
	 * Binds the shader to the GPU
	 */
	public abstract void bind();

	/**
	 * Binds the specified attributes to the GPU
	 *
	 * @param byte_offset The offset between subsequent data packets in the vbo
	 * @param attributes  The attributes, in order, that occur in each data packet
	 */
	public abstract void bindAttributes(int byte_offset, ShaderVariable... attributes);

	/**
	 * Shorthand for {@link #bindAttributes(int, ShaderVariable...)}. Assuming that data packets
	 * are tightly packed (byte offset of zero).
	 *
	 * @param attributes The attributes, in_order, that occur in each data packet
	 */
	public void bindAttributes(ShaderVariable... attributes) {
		bindAttributes(0, attributes);
	}

	/**
	 * Unbinds already bound attributes from the GPU.
	 *
	 * @param attributes The attributes to unbind from the GPU
	 */
	public abstract void unbindAttributes(ShaderVariable... attributes);

	/**
	 * Deletes this shader from the GPU. It will no longer be usable after this point.
	 */
	public abstract void delete();

	/**
	 * @param type The type of the shader source
	 * @return The shader source if found, null otherwise
	 */
	public ShaderSource source(ShaderType type) {
		return sources.get(type);
	}

}
