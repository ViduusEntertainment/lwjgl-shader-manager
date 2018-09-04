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
import java.util.function.Consumer;

import org.viduus.lwjgl.graphics.shaders.core.layouts.VariableType;

/**
 * @author ethan
 *
 */
public abstract class ShaderVariableInterface {
	
	private static final Map<Class<?>, BiConsumer<ShaderVariable, Object[]>> variable_handlers = new HashMap<>();
	private static final Map<VariableType, Consumer<ShaderVariable>> type_handlers = new HashMap<>();
	
	public ShaderVariableInterface() {
		bindVariableHandlers(variable_handlers);
		bindTypeHandlers(type_handlers);
	}
	
	/**
	 * @param variableHandlers
	 */
	protected abstract void bindVariableHandlers(Map<Class<?>, BiConsumer<ShaderVariable, Object[]>> variable_handlers);
	
	protected abstract void bindTypeHandlers(Map<VariableType, Consumer<ShaderVariable>> type_handlers);

	public int getTypeIdentifier(Class<?> type) {
		return type.getName().hashCode();
	}
	
	public abstract void bindAttribute(ShaderProgram program, ShaderVariable variable);
	
	public abstract void bindUniform(ShaderProgram program, ShaderVariable variable);

	public void loadUniform(ShaderProgram program, ShaderVariable variable) {
		// Ignore types that behave as write only
		if (!type_handlers.containsKey(variable.type))
			return;
		
		type_handlers.get(variable.type).accept(variable);
		
		// if root call
		if (program != null)
			program.errorCheck("getUniform");
	}
	
	private static Class<?> findType(Object obj) {
		Class<?> obj_type = obj.getClass();
		
		if (obj_type.isArray()) {
			Class<?> result_type = null;
			for (Object sub_obj : (Object[]) obj) {
				if (sub_obj != null) {
					Class<?> sub_type = findType(sub_obj);
					// skip null sub_type
					if (sub_type == null)
						continue;
					// keep track of found type
					if (result_type == null)
						result_type = sub_type;
					
					// sanity check for consistent type
					if (!sub_type.equals(result_type))
						throw new RuntimeException("Inconsistent type found in array");
				}
			}
			return result_type;
		}
		
		return obj_type;
	}
	
	public void setUniform(ShaderProgram program, ShaderVariable variable, Object value) {
		// convert into object array
		Class<?> type = value.getClass();
		Object[] objs = null;
		if (type.isArray()) {
			objs = (Object[]) value;
		} else {
			objs = new Object[1];
			objs[0] = value;
		}
		
		// get the type if the passed value was an array
		type = findType(objs);
		
		// nothing to set (since there is no value)
		if (type == null)
			return;
		
		// make sure we know how to handle the type
		if (!variable_handlers.containsKey(type))
			throw new ShaderException("No variable handler assigned for type '%s'.", type.getName());
		
		variable_handlers.get(type).accept(variable, objs);
		
		// if root call
		if (program != null)
			program.errorCheck("setUniform");
	}
	
}
