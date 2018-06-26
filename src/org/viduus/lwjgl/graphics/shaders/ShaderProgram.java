/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jun 24, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.viduus.lwjgl.graphics.shaders.parsers.glsl.GlslLexer;
import org.viduus.lwjgl.graphics.shaders.parsers.glsl.GlslParser;
import org.viduus.lwjgl.graphics.shaders.parsers.glsl.GlslParser.GlslContext;

/**
 * @author ethan
 *
 */
public class ShaderProgram {

	public ShaderProgram(File file) throws IOException {
		InputStream file_stream = new FileInputStream(file);
		GlslLexer lexer = new GlslLexer(new ANTLRInputStream(file_stream));
		GlslParser parser = new GlslParser(new CommonTokenStream(lexer));
		GlslContext context = parser.glsl();
		
		
	}
	
}
