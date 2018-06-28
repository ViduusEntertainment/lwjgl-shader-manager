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

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @author ethan
 *
 */
public abstract class ShaderVariableInterface {
	
	private static final Map<Class<?>, BiConsumer<ShaderVariable, Object[]>> variable_handlers = new HashMap<>();
	
	public ShaderVariableInterface() {
		bindVariableHandlers(variable_handlers);
	}
	
	/**
	 * @param variableHandlers
	 */
	protected abstract void bindVariableHandlers(Map<Class<?>, BiConsumer<ShaderVariable, Object[]>> variableHandlers);

	public int getTypeIdentifier(Class<?> type) {
		return type.getName().hashCode();
	}
	
	public abstract void bindAttribute(ShaderProgram program, ShaderVariable variable);
	
	public abstract void bindUniform(ShaderProgram program, ShaderVariable variable);

	public void setUniform(ShaderProgram program, ShaderVariable variable, Object value) {
		Class<?> type = value.getClass();
		Object[] objs = null;
		if (type.isArray()) {
			objs = (Object[]) value;
			type = objs[0].getClass();
		} else {
			objs = new Object[1];
			objs[0] = value;
		}
		
		if (!variable_handlers.containsKey(type)) {
			throw new ShaderException("Data type '%s' not supported.", type.getName());
		}
		
		variable_handlers.get(type).accept(variable, objs);
		
		// if root call
		if (program != null)
			program.errorCheck("setUniform");
	}
	
}
