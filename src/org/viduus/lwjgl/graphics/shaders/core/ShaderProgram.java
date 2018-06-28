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

import java.util.EnumMap;
import java.util.Map;

import org.viduus.lwjgl.graphics.shaders.core.layouts.DataLayout;
import org.viduus.lwjgl.graphics.shaders.core.parsers.SymbolTable;
import org.viduus.lwjgl.graphics.shaders.core.parsers.VariableUseFlag;
import org.viduus.lwjgl.graphics.shaders.opengl.GlVariableInterface;

/**
 * @author ethan
 *
 */
public abstract class ShaderProgram {

	private final DataLayout layout;
	private final SymbolTable<ShaderVariable> variables;
	private final Map<ShaderType, ShaderSource> shaders;
	private final String name;
	
	final ShaderVariableInterface var_interface;
	
	private int gpu_id;
	
	public ShaderProgram(String absolute_path, DataLayout layout, GlVariableInterface var_interface) {
		this.layout = layout;
		this.var_interface = var_interface;
		this.name = absolute_path;
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
		
		// collect symbol tables from shaders
		variables = new SymbolTable<>();
		shaders.values().forEach(shader -> {
			if (shader.exists())
				variables.merge(shader.variables(), var -> new ShaderVariable(this, var));
		});
		
		// deal with attributes
		variables.attributes().forEach(var -> var_interface.bindAttribute(this, var));
		errorCheck("attributes");
		
		// finish setting up program
		link();
		errorCheck("link");
		validate();
		errorCheck("validate");
		
		// deal with uniforms
		variables.uniforms().forEach(var -> var_interface.bindUniform(this, var));
		errorCheck("uniforms");
	}
	
	public abstract void errorCheck(String info);
	
	public String name() {
		return name;
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
	
	public ShaderVariable uniform(String name) {
		ShaderVariable var = variables.get(name);
		if (var.usage_flag == VariableUseFlag.UNIFORM)
			return var;
		throw new ShaderException("Variable '%s' is not a uniform variable.", name);
	}
	
	/**
	 * Creates a new shader program in the GPU
	 */
	protected abstract void createProgram();
	
	protected abstract ShaderSource loadSource(String absolute_path, ShaderType type);
	
	protected abstract void validate();
	
	protected abstract void link();
	
	public abstract void unbind();

	public abstract void bind();
	
	public abstract void delete();
	
}
