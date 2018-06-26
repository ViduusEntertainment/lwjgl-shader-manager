/*
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 */

#version 330

uniform sampler2D tex_buffer[10];

flat in int pass_tex_index;
in vec2 pass_tex_loc;

out vec4 out_color;

void main() {
	out_color = texture(tex_buffer[pass_tex_index], pass_tex_loc);
}
