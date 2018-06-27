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
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;
import org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslLexer;
import org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser;
import org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslProcessor;
import org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.GlslContext;

/**
 * @author ethan
 *
 */
public class GLSLParserTest {

	@Test
	public void parsingTest() throws IOException {
		try (InputStream file_stream = GLSLParserTest.class.getResourceAsStream("_core_test.vert")) {
			GlslLexer lexer = new GlslLexer(new ANTLRInputStream(file_stream));
			GlslParser parser = new GlslParser(new CommonTokenStream(lexer));
			
			GlslContext context = parser.glsl();
			
			ParseTreeWalker walker = new ParseTreeWalker();
			GlslProcessor processor = new GlslProcessor();
			walker.walk(processor, context);
			
			System.out.println(processor.symbol_table);
		}
	}
	
}
