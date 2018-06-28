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

uniform int number;

uniform mat4 projection_matrix;
uniform mat4 view_matrix;
uniform mat4 model_matrix;

in vec3 in_position;
in float in_tex_index;
in vec2 in_tex_coord;

flat out int pass_tex_index;
out vec2 pass_tex_loc;

void main() {
	gl_Position = projection_matrix * view_matrix * model_matrix * vec4(in_position, 1);

	pass_tex_index = int(in_tex_index);
	pass_tex_loc = in_tex_coord;
}
