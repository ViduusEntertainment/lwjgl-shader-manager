/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jun 24, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.parsers.glsl;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

/**
 * @author ethan
 *
 */
public class GLSLParserTest {

	@Test
	public void parsingTest() throws IOException {
		InputStream file_stream = GLSLParserTest.class.getResourceAsStream("test.vert");
		GlslLexer lexer = new GlslLexer(new ANTLRInputStream(file_stream));
		GlslParser parser = new GlslParser(new CommonTokenStream(lexer));
		parser.glsl();
	}
	
}
