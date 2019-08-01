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

uniform mat4 model_matrix = mat4(1.0);

in vec3 in_position;
in vec3 in_color;

out vec3 pass_color;

void main() {
    gl_Position = model_matrix * vec4(in_position, 1);
    pass_color = in_color;
}
