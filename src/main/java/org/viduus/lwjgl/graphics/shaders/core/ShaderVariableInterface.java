/*
 * Copyright 2019 Viduus Entertainment LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.viduus.lwjgl.graphics.shaders.core;

import org.viduus.lwjgl.graphics.shaders.core.layouts.VariableType;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * A variable interface handles implementations for various api specific variable operations. They
 * also handle exchanging variables between Java and the shader. This allows for custom types to be
 * supported.
 */
public abstract class ShaderVariableInterface {

	private final Map<Class<?>, BiConsumer<ShaderVariable, Object[]>> variable_handlers = new HashMap<>();
	private final Map<VariableType, Consumer<ShaderVariable>> type_handlers = new HashMap<>();

	/**
	 * Creates a new shader variable instance. This is when all variable and type handlers are
	 * bound.
	 */
	public ShaderVariableInterface() {
		bindVariableHandlers(variable_handlers);
		bindTypeHandlers(type_handlers);
	}

	/**
	 * Finds and returns the type of an object. This function supports type resolution on generic
	 * arrays as well.
	 *
	 * @param obj The object to get the type of.
	 * @return The type of the object, or the type of an element if the object is an array
	 * @throws RuntimeException If passed an array and the array does not have a consistent type.
	 */
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

	/**
	 * Binds custom variable handlers to this variable interface. New variable handlers should be
	 * added to the passed map.
	 *
	 * @param variable_handlers The variable handler map to modify.
	 */
	protected abstract void bindVariableHandlers(Map<Class<?>, BiConsumer<ShaderVariable, Object[]>> variable_handlers);

	/**
	 * Binds custom type handlers to this variable interface. New type handlers should be added to
	 * the passed map.
	 *
	 * @param type_handlers The type handler map to modify.
	 */
	protected abstract void bindTypeHandlers(Map<VariableType, Consumer<ShaderVariable>> type_handlers);

	public int getTypeIdentifier(Class<?> type) {
		return type.getName().hashCode();
	}

	/**
	 * Binds attributes to the gpu.
	 *
	 * @param program  The program containing the attribute
	 * @param variable The attribute
	 */
	public abstract void bindAttribute(ShaderProgram program, ShaderVariable variable);

	/**
	 * Binds uniforms to the gpu.
	 *
	 * @param program  The program containing the uniform
	 * @param variable The uniform
	 */
	public abstract void bindUniform(ShaderProgram program, ShaderVariable variable);

	/**
	 * Loads the value of a uniform variable from the shader. Effectively pulling the value from
	 * the gpu into Java. The value can be accessed through the shader variable reference.
	 *
	 * @param program  The program containing the variable
	 * @param variable The variable reference
	 * @throws ShaderException If an error occurred while retrieving the variable
	 */
	void loadUniform(ShaderProgram program, ShaderVariable variable) throws ShaderException {
		// Ignore types that behave as write only
		if (!type_handlers.containsKey(variable.type))
			return;

		type_handlers.get(variable.type).accept(variable);

		// if root call
		if (program != null)
			program.errorCheck("getUniform");
	}

	/**
	 * This function handles setting the value of a shader variable.
	 *
	 * @param program  The program containing the variable
	 * @param variable The variable reference
	 * @param value    The new value for the variable
	 * @throws ShaderException If no handler is bound for the type of the passed value
	 */
	protected final void setUniform(ShaderProgram program, ShaderVariable variable, Object value) {
		// convert into object array
		Class<?> type = value.getClass();
		Object[] objs;
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

		// only not null if this was the root call
		if (program != null)
			program.errorCheck("setUniform");
	}

}
