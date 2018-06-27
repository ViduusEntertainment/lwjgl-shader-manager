/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jun 26, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.core.parsers;

/**
 * @author ethan
 *
 */
public abstract class Processor {

	protected boolean exists = false;
	protected SymbolTable<Variable> symbol_table = new SymbolTable<>();
	protected String source;
	
	public boolean exists() {
		return exists;
	}
	
	public SymbolTable<Variable> symbolTable() {
		return symbol_table;
	}

	/**
	 * @return
	 */
	public String source() {
		return source.toString();
	}
	
}
