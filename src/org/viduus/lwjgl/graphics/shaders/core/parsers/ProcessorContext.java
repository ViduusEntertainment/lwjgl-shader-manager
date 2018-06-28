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
 * Created on Jun 25, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.core.parsers;

import java.lang.reflect.Type;
import java.util.Stack;

import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * @author ethan
 *
 */
public class ProcessorContext {

	// historical state data
	Stack<ProcessorMode> mode_stack = new Stack<>();
	
	// raw state data
	public ProcessorMode mode;
	public int type = -1;
	public String text = null;
	
	// computed data
	public Type curr_type = null;
	public Object curr_obj = null;
	
	public ProcessorContext() {
		pushMode(ProcessorMode.WAITING);
	}
	
	public void pushMode(ProcessorMode mode) {
		this.mode = mode;
		mode_stack.push(mode);
	}
	
	public void popMode() {
		mode_stack.pop();
		mode = mode_stack.peek();
	}
	
	public void isBoolean() {
		curr_type = Boolean.TYPE;
		curr_obj = Boolean.parseBoolean(text);
	}
	
	public void isInteger() {
		curr_type = Integer.TYPE;
		curr_obj = Integer.parseInt(text);
	}
	
	public void isUnsignedInteger() {
		curr_type = Integer.TYPE;
		curr_obj = Integer.parseUnsignedInt(text);
	}
	
	public void isFloat() {
		curr_type = Float.TYPE;
		curr_obj = Float.parseFloat(text);
	}
	
	public void isDouble() {
		curr_type = Double.TYPE;
		curr_obj = Double.parseDouble(text);
	}

	/**
	 * @param node
	 */
	public void update(TerminalNode node) {
		type = node.getSymbol().getType();
		text = node.getText();
	}
	
}
