/*
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 */

#version 330

#define name 10

uniform mat4 projection_matrix;
uniform mat4 view_matrix;
uniform mat4 model_matrix;

in vec3 in_position;
in float in_tex_index;
in vec2 in_tex_coord;

flat out int pass_tex_index;
out vec2 pass_tex_loc;

void main(){
	gl_Position = projection_matrix * view_matrix * model_matrix * vec4(in_position, 1);
	
	pass_tex_index = int(in_tex_index);
	pass_tex_loc = in_tex_coord;
}
