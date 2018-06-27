/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jun 26, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.core;

import org.viduus.lwjgl.graphics.shaders.core.parsers.Variable;

/**
 * @author ethan
 *
 */
public class ShaderVariable extends Variable {

	protected final ShaderProgram program;
	protected int id;
	
	public ShaderVariable(ShaderProgram program, Variable var) {
		super(var);
		this.program = program;
	}
	
	protected void id(int id) {
		this.id = id;
	}
	
	public int id() {
		return id;
	}
	
	public int byteSize() {
		return program.dataLayout().getByteSize(type, typeSize());
	}
	
	public int typeSize() {
		return program.dataLayout().getTypeSize(type);
	}
	
}
