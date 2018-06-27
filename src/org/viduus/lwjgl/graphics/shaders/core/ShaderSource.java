/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jun 26, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.core;

import java.io.File;

import org.viduus.lwjgl.graphics.shaders.core.parsers.Processor;
import org.viduus.lwjgl.graphics.shaders.core.parsers.SymbolTable;
import org.viduus.lwjgl.graphics.shaders.core.parsers.Variable;

/**
 * @author ethan
 *
 */
public abstract class ShaderSource {
	
	private int gpu_id;
	
	private final Processor processor;
	private final ShaderType type;
	private final File source_file;
	private final String name;

	/**
	 * Constructs a new shader source. The shader will also be compiled and attached to the GPU.
	 * 
	 * @param absolute_path
	 * @param type
	 */
	public ShaderSource(ShaderProgram program, String absolute_path, ShaderType type) {
		this.type = type;
		
		switch (type) {
		case VERTEX:
			absolute_path += ".vert";
			break;
		case FRAGMENT:
			absolute_path += ".frag";
			break;
		case GEOMETRY:
			absolute_path += ".geom";
			break;
		}
		
		source_file = new File(absolute_path);
		name = source_file.getName();
		processor = process();
		
		// compile and attach to GPU
		if (exists()) {
			create();
			compile();
			attach(program);
		}
	}
	
	public String name() {
		return name;
	}
	
	protected void id(int id) {
		gpu_id = id;
	}
	
	protected int id() {
		return gpu_id;
	}
	
	protected String source() {
		return processor.source();
	}
	
	protected abstract void create();
	
	protected abstract void compile();
	
	protected abstract void attach(ShaderProgram program);
	
	public abstract void delete();
	
	public boolean exists() {
		return source_file.exists() && processor.exists();
	}
	
	public SymbolTable<Variable> variables() {
		return processor.symbolTable();
	}
	
	protected ShaderType type() {
		return type;
	}
	
	protected File file() {
		return source_file;
	}
	
	protected abstract Processor process();
	
}
