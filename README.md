# LWJGL Shader Manager

[![Javadocs](https://www.javadoc.io/badge/org.viduus/lwjgl-shader-manager.svg)](https://www.javadoc.io/doc/org.viduus/lwjgl-shader-manager)
[![Sonarcloud Status](https://sonarcloud.io/api/project_badges/measure?project=lwjgl-shader-manager&metric=coverage)](https://sonarcloud.io/dashboard?id=lwjgl-shader-manager)

This library simplifies the process of loading, binding, and using shaders in an LWJGL OpenGL application. It handles all of the OpenGL interactions and supports many GLSL data types by default using JOML. It has a great deal of customization allowing for new data types to be used instead of the defaults provided by this library.

## Usage

Gradle dependency:

```
compile group: 'org.viduus', name: 'lwjgl-shader-manager', version: '0.0.1'
```

## Capabilities

- [x] shader loading
- [x] load specified default value for uniform variables
- [x] attribute binding
- [x] custom type handlers (to and from GPU)
- [x] custom shader loader
- [ ] vulkan shader pipeline

## Limitations

This shader manager is only intended for opengl applications using buffered rendering.

## Example

```java
public class Example {
    public static void main(String[] args) {
        // tell opengl what shader we want to use
        ShaderProgram program = shader_manager.shader("simple");
        program.bind();
        
        // update model matrix
        ShaderVariable model_matrix = program.uniform("model_matrix");
        // since this is the first call, it returns the default value assigned in the shader
        Matrix4f mat = (Matrix4f) model_matrix.value();
        mat.rotate(0.1f, 0, 1, 0);
        // the value is automatically pushed to the GPU
        model_matrix.value(mat);
        
        // bind shader attributes
        ShaderVariable in_position = program.attribute("in_position");
        ShaderVariable in_color = program.attribute("in_color");
        // automatically binds the attributes and their offsets to the vbo buffer
        // it assumes that the data is tightly packed
        program.bindAttributes(in_position, in_color);
        
        // unbind attributes
        program.unbindAttributes(in_position, in_color);
    }
}
```

You can find a full working example [here](https://github.com/ViduusEntertainment/lwjgl-shader-manager/tree/master/src/test/java/org/viduus/lwjgl/graphics/shaders/opengl/GLRenderTest.java)

## Default Type Mappings

| glsl type | java type | read               | write              |
| :-------: | :-------: | :----------------: | :----------------: |
| boolean   | Boolean   |                    | :heavy_check_mark: |
| float     | Float     | :heavy_check_mark: | :heavy_check_mark: |
| vec2      | Vector2f  | :heavy_check_mark: | :heavy_check_mark: |
| vec3      | Vector3f  | :heavy_check_mark: | :heavy_check_mark: |
| vec4      | Vector4f  | :heavy_check_mark: | :heavy_check_mark: |
| mat3      | Matrix3f  | :heavy_check_mark: | :heavy_check_mark: |
| mat4      | Matrix4f  | :heavy_check_mark: | :heavy_check_mark: |
| int       | Int       | :heavy_check_mark: | :heavy_check_mark: |
| ivec2     | Vector2i  | :heavy_check_mark: | :heavy_check_mark: |
| ivec3     | Vector3i  | :heavy_check_mark: | :heavy_check_mark: |
| ivec4     | Vector4i  | :heavy_check_mark: | :heavy_check_mark: |