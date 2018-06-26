/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jun 25, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.parsers;

/**
 * @author ethan
 *
 */
public class ParserException extends RuntimeException {

	ParserException(String text, Object ... objs) {
		super(String.format(text, objs));
	}
	
}
