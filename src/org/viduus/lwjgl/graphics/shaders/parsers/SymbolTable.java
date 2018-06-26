/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jun 25, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.parsers;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ethan
 *
 */
public class SymbolTable {

	private Map<String, Variable> symbols = new HashMap<>();
	
	void set(Variable var) {
		symbols.put(var.name, var);
	}
	
	Variable get(String symbol) {
		if (symbols.containsKey(symbol))
			throw new ParserException("Unexpected symbol '%s'", symbol);
		return symbols.get(symbol);
	}
	
	@Override
	public String toString() {
		return symbols.toString();
	}
	
}
