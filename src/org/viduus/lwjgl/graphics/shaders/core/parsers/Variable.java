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
		name = other.name;
		usage_flag = other.usage_flag;
		type = other.type;
		location = other.location;
		value = null;
	}
	
	public String name() {
		return name;
	}

	public Object value() {
		return value;
	}
	
	public void value(Object obj) {
		value = obj;
	}
	
	@Override
	public String toString() {
		return String.format("%s(type:%d, value:%s, location:%d, usage:%s)", name, type, value, location, usage_flag);
	}
	
}
