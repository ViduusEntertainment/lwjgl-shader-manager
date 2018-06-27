/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jun 26, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.core;

/**
 * @author ethan
 *
 */
public class ShaderException extends RuntimeException {

	private static final long serialVersionUID = -4324426805264293422L;

	public ShaderException(String text, Object ... objects) {
		super(String.format(text, objects));
	}
	
}
