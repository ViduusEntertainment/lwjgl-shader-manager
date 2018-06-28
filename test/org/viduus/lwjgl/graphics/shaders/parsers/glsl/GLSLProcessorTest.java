/**
 * Copyright 2018 Viduus Entertainment LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Created on Jun 24, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.parsers.glsl;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.viduus.lwjgl.graphics.shaders.core.ShaderType;
import org.viduus.lwjgl.graphics.shaders.core.parsers.SymbolTable;
import org.viduus.lwjgl.graphics.shaders.core.parsers.Variable;
import org.viduus.lwjgl.graphics.shaders.core.parsers.VariableUseFlag;
import org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser;
import org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslProcessor;

/**
 * @author ethan
 *
 */
public class GLSLProcessorTest {

	private void checkVariable(Variable var, int type, VariableUseFlag uniform) {
		assertThat(var.type, is(type));
		assertThat(var.usage_flag, is(uniform));
	}
	
	@Test
	public void basicVertexShaderTest() throws IOException {
		GlslProcessor processor = new GlslProcessor(new File("./resources/shaders/glsl/core_test.vert"), ShaderType.VERTEX);
		
		SymbolTable<Variable> vars = processor.symbolTable();
		assertThat(vars.size(), is(9));
		checkVariable(vars.get("number"), GlslParser.INT, VariableUseFlag.UNIFORM);
		checkVariable(vars.get("projection_matrix"), GlslParser.MAT4, VariableUseFlag.UNIFORM);
		checkVariable(vars.get("view_matrix"), GlslParser.MAT4, VariableUseFlag.UNIFORM);
		checkVariable(vars.get("model_matrix"), GlslParser.MAT4, VariableUseFlag.UNIFORM);
		checkVariable(vars.get("in_position"), GlslParser.VEC3, VariableUseFlag.ATTRIBUTE);
		checkVariable(vars.get("in_tex_index"), GlslParser.FLOAT, VariableUseFlag.ATTRIBUTE);
		checkVariable(vars.get("in_tex_coord"), GlslParser.VEC2, VariableUseFlag.ATTRIBUTE);
		checkVariable(vars.get("pass_tex_index"), GlslParser.INT, VariableUseFlag.GLOBAL);
		checkVariable(vars.get("pass_tex_loc"), GlslParser.VEC2, VariableUseFlag.GLOBAL);
	}
	
	@Test
	public void basicFragmentShaderTest() throws IOException {
		GlslProcessor processor = new GlslProcessor(new File("./resources/shaders/glsl/core_test.frag"), ShaderType.FRAGMENT);
		
		SymbolTable<Variable> vars = processor.symbolTable();
		assertThat(vars.size(), is(4));
		checkVariable(vars.get("tex_buffer"), GlslParser.SAMPLER2D, VariableUseFlag.UNIFORM);
		checkVariable(vars.get("pass_tex_index"), GlslParser.INT, VariableUseFlag.GLOBAL);
		checkVariable(vars.get("pass_tex_loc"), GlslParser.VEC2, VariableUseFlag.GLOBAL);
		checkVariable(vars.get("out_color"), GlslParser.VEC4, VariableUseFlag.GLOBAL);
	}
	
}
