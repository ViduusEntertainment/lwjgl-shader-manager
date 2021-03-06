/*
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
 */

#version 330

uniform sampler2D tex_buffer[10];

flat in int pass_tex_index;
in vec2 pass_tex_loc;

out vec4 out_color;

void main() {
	out_color = texture(tex_buffer[pass_tex_index], pass_tex_loc);
}
