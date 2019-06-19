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

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 *
 */
public class SymbolTable {

	private Map<String, ShaderVariable> symbols = new HashMap<>();

	public void add(ShaderVariable var) {
		symbols.put(var.name, var);
	}

	public ShaderVariable get(String symbol) {
		if (!symbols.containsKey(symbol))
			throw new ShaderException("Variable '%s' does not exist", symbol);
		return symbols.get(symbol);
	}

	public boolean has(String symbol) {
		return symbols.containsKey(symbol);
	}

	@Override
	public String toString() {
		return symbols.toString();
	}

	public Stream<ShaderVariable> variables() {
		return symbols.values().stream();
	}

	public Stream<ShaderVariable> attributes() {
		return variables().filter(var -> var.usage.equals(UsageFlag.ATTRIBUTE));
	}

	public Stream<ShaderVariable> uniforms() {
		return variables().filter(var -> var.usage.equals(UsageFlag.UNIFORM));
	}

	public int size() {
		return symbols.size();
	}

}
