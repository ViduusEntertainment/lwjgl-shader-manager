/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jun 25, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.parsers;

/**
 * @author ethan
 *
 */
class Variable {

	public VariableUseFlag usage_flag = VariableUseFlag.GLOBAL;
	public String name;
	public int type = -1;
	public int location = -1;
	public Object value = null;
	
	@Override
	public String toString() {
		return String.format("%s(type:%d, value:%s, location:%d, usage:%s)", name, type, value, location, usage_flag);
	}
	
}
