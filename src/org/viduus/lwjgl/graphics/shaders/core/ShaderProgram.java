/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jun 24, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.core;

import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;

import org.viduus.lwjgl.graphics.shaders.core.layouts.DataLayout;
import org.viduus.lwjgl.graphics.shaders.core.parsers.SymbolTable;
import org.viduus.lwjgl.graphics.shaders.core.parsers.Variable;
import org.viduus.lwjgl.graphics.shaders.opengl.GlVariableInterface;

/**
 * @author ethan
 *
 */
public abstract class ShaderProgram {

	private final DataLayout layout;
	private final ShaderVariableInterface var_interface;
	private final SymbolTable<ShaderVariable> variables;
	private final Map<ShaderType, ShaderSource> shaders;
	private final String name;
	
	private int gpu_id;
	
	public ShaderProgram(String absolute_path, DataLayout layout, GlVariableInterface var_interface) throws IOException {
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
		
		// collect symbol tables from shaders
		variables = new SymbolTable<>();
		shaders.values().forEach(shader -> {
			if (shader.exists())
				variables.merge(shader.variables(), var -> new ShaderVariable(this, var));
		});
		
		// deal with attributes
		variables.attributes().forEach(var -> var_interface.bindAttribute(this, var));
		
		// finish setting up program
		link();
		validate();
		
		// deal with uniforms
		variables.uniforms().forEach(var -> var_interface.bindUniform(this, var));
	}
	
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
	
	/**
	 * Creates a new shader program in the GPU
	 */
	protected abstract void createProgram();
	
	/**
	 * Binds an attribute in the GPU
	 * 
	 * @param attribute - The attribute variable
	 */
	protected abstract void bindAttribute(Variable attribute);
	
	/**
	 * Binds a uniform in the GPU
	 * 
	 * @param uniform
	 */
	protected abstract void bindUniform(Variable uniform);
	
	protected abstract ShaderSource loadSource(String absolute_path, ShaderType type);
	
	protected abstract void validate();
	
	protected abstract void link();
	
	public abstract void close();

	public abstract void use();
	
	public abstract void delete();
	
}
