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

import org.viduus.lwjgl.graphics.shaders.core.parsers.Variable;
import org.viduus.lwjgl.graphics.shaders.core.parsers.VariableUseFlag;

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
	
	public void id(int id) {
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
	
	@Override
	public void value(Object obj) {
		super.value(obj);
		
		if (usage_flag == VariableUseFlag.UNIFORM)
			program.var_interface.setUniform(program, this, obj);
	}
	
}
