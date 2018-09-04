/**
 * Copyright 2018 Viduus Entertainment LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Created on Jun 24, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.core;

import java.io.IOException;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.viduus.lwjgl.graphics.shaders.core.layouts.DataLayout;

/**
 * @author ethan
 *
 */
public abstract class ShaderProgram {

	private final ShaderManager manager;
	private final DataLayout layout;
	private final SymbolTable<ShaderVariable> variables;
	private final Map<ShaderType, ShaderSource> shaders;
	private final String name;
	
	final ShaderVariableInterface var_interface;
	
	private int gpu_id;
	
	public ShaderProgram(String absolute_path, ShaderManager manager, DataLayout layout, ShaderVariableInterface var_interface) throws IOException {
		this.name = absolute_path;
		this.manager = manager;
		this.layout = layout;
		this.var_interface = var_interface;
		createProgram();
		
		// load, compile, and attach shader sources
		shaders = new EnumMap<>(ShaderType.class);
		for (ShaderType type : ShaderType.values()) {
			shaders.put(type, loadSource(absolute_path, type));
		}
		
		if (!shaders.get(ShaderType.VERTEX).exists() || !shaders.get(ShaderType.FRAGMENT).exists()) {
			throw new ShaderException("Shader '%s' must have a vertex and fragment shader specified.", absolute_path);
		}
		errorCheck("load, compile, and attach");
		
		// finish setting up program
		link();
		validate();
		
		// collect symbol tables from shaders
		variables = new SymbolTable<>();
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
	
	protected abstract void loadShaderVariables(SymbolTable<ShaderVariable> variables);

	public abstract void errorCheck(String info);
	
	public String name() {
		return name;
	}
	
	ShaderManager manager() {
		return manager;
	}
	
	public void id(int id) {
		gpu_id = id;
	}
	
	public int id() {
		return gpu_id;
	}
	
	public DataLayout dataLayout() {
		return layout;
	}
	
	public boolean uniformExists(String name) {
		return variables.has(name) && variables.get(name).usage == UsageFlag.UNIFORM;
	}
	
	public ShaderVariable uniform(String name) {
		ShaderVariable var = variables.get(name);
		var.usageCheck(UsageFlag.UNIFORM);
		return var;
	}
	
	public List<ShaderVariable> uniforms() {
		return variables.uniforms().collect(Collectors.toList());
	}
	
	public boolean attributeExists(String name) {
		return variables.has(name) && variables.get(name).usage == UsageFlag.ATTRIBUTE;
	}
	
	public ShaderVariable attribute(String name) {
		ShaderVariable var = variables.get(name);
		var.usageCheck(UsageFlag.ATTRIBUTE);
		return var;
	}
	
	public List<ShaderVariable> attributes() {
		return variables.attributes().collect(Collectors.toList());
	}
	
	/**
	 * Creates a new shader program in the GPU
	 */
	protected abstract void createProgram();
	
	protected abstract ShaderSource loadSource(String absolute_path, ShaderType type) throws IOException;
	
	protected abstract void validate();
	
	protected abstract void link();
	
	public abstract void unbind();

	public abstract void bind();
	
	public abstract void bindAttributes(int byte_offset, ShaderVariable ... attributes);
	
	public void bindAttributes(ShaderVariable ... attributes) {
		bindAttributes(0, attributes);
	}
	
	public abstract void unbindAttributes(ShaderVariable ... attributes);
	
	public abstract void delete();
	
}
