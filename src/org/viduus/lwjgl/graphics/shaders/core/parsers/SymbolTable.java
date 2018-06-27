/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jun 25, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.core.parsers;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author ethan
 *
 */
public class SymbolTable<T extends Variable> {

	private Map<String, T> symbols = new HashMap<>();
	
	public void set(T var) {
		symbols.put(var.name, var);
	}
	
	public T get(String symbol) {
		if (symbols.containsKey(symbol))
			throw new ParserException("Unexpected symbol '%s'", symbol);
		return symbols.get(symbol);
	}
	
	@Override
	public String toString() {
		return symbols.toString();
	}

	/**
	 * @param variables
	 */
	@SuppressWarnings("unchecked")
	public <V extends Variable> void merge(SymbolTable<V> variables, Function<V, T> converter) {
		variables.symbols.entrySet().forEach(entry -> {
			T var = (converter == null) ? (T) entry.getValue() : converter.apply(entry.getValue());
			switch (var.usage_flag) {
			case UNIFORM:
			case ATTRIBUTE:
				// we will rely on driver to make sure that there are no overlapping uniform variables
				set(var);
				break;
			}
		});
	}
	
	public void merge(SymbolTable<T> variables) {
		merge(variables, null);
	}
	
	public Stream<T> attributes() {
		return symbols.values().stream().filter(var -> var.usage_flag.equals(VariableUseFlag.ATTRIBUTE));
	}
	
	public Stream<T> uniforms() {
		return symbols.values().stream().filter(var -> var.usage_flag.equals(VariableUseFlag.UNIFORM));
	}
	
}
