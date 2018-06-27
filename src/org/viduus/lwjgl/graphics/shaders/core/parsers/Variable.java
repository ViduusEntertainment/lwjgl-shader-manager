/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jun 25, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.core.parsers;

/**
 * @author ethan
 *
 */
public class Variable {

	public String name;
	public VariableUseFlag usage_flag = VariableUseFlag.GLOBAL;
	public int type, location;
	public Object value;
	
	/**
	 * Default constructor.
	 */
	public Variable() {
		name = null;
		usage_flag = VariableUseFlag.GLOBAL;
		type = -1;
		location = -1;
		value = null;
	}
	
	/**
	 * Copy constructor.
	 * @param other
	 */
	public Variable(Variable other) {
		name = null;
		usage_flag = other.usage_flag;
		type = other.type;
		location = other.location;
		value = null;
	}
	
	@Override
	public String toString() {
		return String.format("%s(type:%d, value:%s, location:%d, usage:%s)", name, type, value, location, usage_flag);
	}
	
}
