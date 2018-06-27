/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jun 26, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.opengl;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL32;
import org.viduus.lwjgl.graphics.shaders.core.ShaderException;
import org.viduus.lwjgl.graphics.shaders.core.ShaderProgram;
import org.viduus.lwjgl.graphics.shaders.core.ShaderSource;
import org.viduus.lwjgl.graphics.shaders.core.ShaderType;
import org.viduus.lwjgl.graphics.shaders.core.parsers.Processor;
import org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslProcessor;

/**
 * @author ethan
 *
 */
public class GLShaderSource extends ShaderSource {

	/**
	 * @param absolute_path
	 * @param type
	 */
	public GLShaderSource(ShaderProgram program, String absolute_path, ShaderType type) {
		super(program, absolute_path, type);
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderSource#process()
	 */
	@Override
	protected Processor process() {
		return GlslProcessor.process(file());
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderSource#create()
	 */
	@Override
	protected void create() {
		switch (type()) {
		case VERTEX:
			id(GL20.glCreateShader(GL20.GL_VERTEX_SHADER));
			break;
		case FRAGMENT:
			id(GL20.glCreateShader(GL20.GL_FRAGMENT_SHADER));
			break;
		case GEOMETRY:
			id(GL20.glCreateShader(GL32.GL_GEOMETRY_SHADER));
			break;
		default:
			throw new ShaderException("Can not create shader of type '%s'", type());
		}
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderSource#compile()
	 */
	@Override
	protected void compile() {
		GL20.glShaderSource(id(), source());
		GL20.glCompileShader(id());

        if (GL20.glGetProgrami(id(), GL20.GL_COMPILE_STATUS) == GL11.GL_FALSE) {
        		delete();
            throw new ShaderException("Failed to link shader program, '%s'.%nOpenGL Info Log:%s", name(), GL20.glGetProgramInfoLog(id()));
        }
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderSource#attach()
	 */
	@Override
	protected void attach(ShaderProgram prog) {
		GL20.glAttachShader(prog.id(), id());
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderSource#delete()
	 */
	@Override
	public void delete() {
		GL20.glDeleteShader(id());
	}

}
