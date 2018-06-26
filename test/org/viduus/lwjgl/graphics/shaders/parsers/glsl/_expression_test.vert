/*
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 */

#version 330

#define name 10

uniform mat4 projection_matrix, view_matrix, model_matrix;

layout(location = 0) in vec3 in_position;
layout(location = 0 + 1) in float in_tex_index;
layout(location = 0 + 2) in vec2 in_tex_coord;

flat out int pass_tex_index;
out vec2 pass_tex_loc;

float arr[] = {0, 1, 2};
float num = 5 + (arr[0] * 3);

void main() {
	// do nothing
}
