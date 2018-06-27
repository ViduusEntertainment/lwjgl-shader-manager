/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jun 25, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.core.parsers;

/**
 * @author ethan
 *
 */
public class ParserException extends RuntimeException {

	private static final long serialVersionUID = 3290950168311430874L;

	public ParserException(Exception err) {
		super(err);
	}
	
	public ParserException(String text, Object ... objs) {
		super(String.format(text, objs));
	}
	
}
