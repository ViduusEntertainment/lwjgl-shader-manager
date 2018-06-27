/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jun 26, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.core;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ethan
 *
 */
public abstract class ShaderManager {

	private Map<String, ShaderProgram> programs;
	private ShaderProgram active_program;
	
	public ShaderManager(String base_path) {
		programs = new HashMap<>();
		active_program = null;
	}
	
	protected abstract ShaderProgram load(String name);
	
	/**
	 * Set the active shader.
	 * 
	 * @param name
	 */
	public void shader(String name) {
		if (!programs.containsKey(name)) {
			programs.put(name, load(name));
		}
		
		active_program = programs.get(name);
	}
	
	/**
	 * Get the active shader.
	 * 
	 * @return
	 */
	public ShaderProgram shader() {
		return active_program;
	}
	
}
