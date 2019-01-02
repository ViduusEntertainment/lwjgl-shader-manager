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
 * Created on Jun 26, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.core;

import org.viduus.lwjgl.graphics.shaders.core.layouts.DataLayout;
import org.viduus.lwjgl.graphics.shaders.core.layouts.VariableType;

/**
 * @author ethan
 *
 */
public abstract class ShaderVariable {

	protected final ShaderProgram program;
	protected final String name;
	protected final UsageFlag usage;
	protected final VariableType type;
	protected final int length;
	protected final Object value;
	
	protected int id;
	
	private static String filterName(String name) {
		int idx = name.indexOf('[');
		if (idx == -1)
			idx = name.length();
		return name.substring(0, idx);
	}
	
	/**
	 * @param program
	 * @param name
	 * @param usage
	 * @param length
	 * @param gl_type
	 */
	public ShaderVariable(ShaderProgram program, String name, UsageFlag usage, int length, int gl_type) {
		this.program = program;
		this.name = filterName(name);
		this.usage = usage;
		this.type = convertGpuType(gl_type);
		this.length = length;
		this.value = new Object[length];
	}
	
	protected abstract VariableType convertGpuType(int gpu_type);

	public void id(int id) {
		this.id = id;
	}
	
	public int id() {
		return id;
	}
	
	/**
	 * @return the encompassing shader program for this shader variable.
	 */
	public ShaderProgram program() {
		return program;
	}
	
	/**
	 * @return the name of this shader variable.
	 */
	public String name() {
		return name;
	}
	
	/**
	 * @return the type of this shader variable.
	 */
	public VariableType type() {
		return type;
	}
	
	public UsageFlag usage() {
		return usage;
	}
	
	public int byteSize(DataLayout layout) {
		return layout.getByteSize(type, length);
	}
	
	public int byteSize() {
		return byteSize(program.dataLayout());
	}
	
	/**
	 * 
	 * @param layout
	 * @return
	 */
	public int typeSize(DataLayout layout) {
		return layout.getTypeSize(type);
	}
	
	/**
	 * The encompassing shader program for this varaible's data layout is used.
	 * 
	 * @return the size, in bytes, of this varaible's type.
	 */
	public int typeSize() {
		return typeSize(program.dataLayout());
	}

	/**
	 * @return The current value of this shader variable.
	 */
	public Object value() {
		return length() == 1 ? ((Object[])value)[0] : value;
	}
	
	/**
	 * The length of this shader variable. This will be one for all non array variables. For array
	 * variables it will be the maximum size used in the shader.
	 * 
	 * @return
	 */
	public int length() {
		return length;
	}
	
	public void rawValue(int i, Object obj) {
		// if non array
		if (i >= length())
			throw new IndexOutOfBoundsException();
			
		((Object[])value)[i] = obj;
	}

	/**
	 * Sets the raw value of this shader variable. Does not push the value to the GPU.
	 * 
	 * @param obj
	 */
	public void rawValue(Object obj) {
		rawValue(0, obj);
	}
	
	/**
	 * Sets and pushes the value of this shader variable to the GPU. If it is not a uniform
	 * variable nothing happens.
	 * 
	 * @param obj
	 */
	public void value(int i, Object obj) {
		rawValue(i, obj);
		push();
	}
	
	public void value(Object obj) {
		value(0, obj);
	}
	
	/**
	 * Pushes the value of this shader variable to the GPU. If it is not a uniform variable nothing
	 * happens.
	 */
	public void push() {
		if (usage == UsageFlag.UNIFORM)
			program.var_interface.setUniform(program, this, value);
	}
	
	public void usageCheck(UsageFlag flag) {
		if (usage != flag)
			throw new ShaderException("Variable '%s' is not a %s variable.", name, flag);
	}
	
	@Override
	public String toString() {
		return String.format("variable[name:%s, id:%d, usage:%s, type:%s, length:%d, value:%s]", name(), id(), usage(), type(), length(), value());
	}
	
}
