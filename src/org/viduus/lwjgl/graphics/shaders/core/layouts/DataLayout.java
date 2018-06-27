/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jan 17, 2017 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.core.layouts;

import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.BOOL;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.BVEC2;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.BVEC3;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.BVEC4;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.DMAT2;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.DMAT2X3;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.DMAT2X4;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.DMAT3;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.DMAT3X2;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.DMAT3X4;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.DMAT4;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.DMAT4X2;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.DMAT4X3;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.DOUBLE;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.DVEC2;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.DVEC3;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.DVEC4;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.FLOAT;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.INT;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.IVEC2;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.IVEC3;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.IVEC4;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.MAT2;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.MAT2X3;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.MAT2X4;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.MAT3;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.MAT3X2;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.MAT3X4;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.MAT4;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.MAT4X2;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.MAT4X3;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.VEC2;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.VEC3;
import static org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser.VEC4;

/**
 * This is a simple class that is intended to allow a user to implement all of
 * the necessary functions to create a data layout for glsl.
 *
 * @author Ethan Toney
 */
public abstract class DataLayout {

	public static DataLayout getLayoutWithName(String name){
		if (name.equalsIgnoreCase("std140")) {
			return new Std140();
		}
		return null;
	}
	
	public int getTypeSize(int type) {
		switch (type) {
		case BOOL: // boolean
		case DOUBLE: // double
		case FLOAT: // float
		case INT: // int
			return 1;
		case BVEC2: // vec2
		case DVEC2: // vec2
		case IVEC2: // vec2
		case VEC2: // vec2
			return 2;
		case BVEC3: // vec3
		case DVEC3: // vec3
		case IVEC3: // vec3
		case VEC3: // vec3
			return 3;
		case BVEC4: // vec4
		case DVEC4: // vec4
		case IVEC4: // vec4
		case VEC4: // vec4
		case MAT2: // mat2
		case DMAT2: // dmat2
			return 4;
		case MAT2X3: // mat2x3
		case MAT3X2: // mat3x2
		case DMAT2X3: // dmat2x3
		case DMAT3X2: // dmat3x2
			return 6;
		case MAT2X4: // mat2x4
		case MAT4X2: // mat4x2
		case DMAT2X4: // dmat2x4
		case DMAT4X2: // dmat4x2
			return 8;
		case MAT3: // mat3
		case DMAT3: // dmat3
			return 9;
		case MAT3X4: // mat3x4
		case MAT4X3: // mat4x3
		case DMAT3X4: // dmat3x4
		case DMAT4X3: // dmat4x3
			return 12;
		case MAT4: // mat4
		case DMAT4: // dmat4
			return 16;
		}
		
		return 0;
	}
	
	public int getByteSize(int type, int num_elements) {
		switch (type) {
		// scalars
		case BOOL: // boolean
			return (num_elements == 0) ?
					getSizeOfBoolean():
					getSizeOfBooleanArray(num_elements);
		case DOUBLE: // double
			return (num_elements == 0) ?
					getSizeOfDouble():
					getSizeOfDoubleArray(num_elements);
		case FLOAT: // float
			return (num_elements == 0) ?
					getSizeOfFloat():
					getSizeOfFloatArray(num_elements);
		case INT: // int
			return (num_elements == 0) ?
					getSizeOfInt():
					getSizeOfIntArray(num_elements);
		
		// boolean vectors
		case BVEC2: // vec2
			return (num_elements == 0) ?
					getSizeOfBooleanVec(2):
					getSizeOfBooleanVecArray(num_elements, 2);
		case BVEC3: // vec3
			return (num_elements == 0) ?
					getSizeOfBooleanVec(3):
					getSizeOfBooleanVecArray(num_elements, 3);
		case BVEC4: // vec4
			return (num_elements == 0) ?
					getSizeOfBooleanVec(4):
					getSizeOfBooleanVecArray(num_elements, 4);
		
		// double vectors
		case DVEC2: // vec2
			return (num_elements == 0) ?
					getSizeOfDoubleVec(2):
					getSizeOfDoubleVecArray(num_elements, 2);
		case DVEC3: // vec3
			return (num_elements == 0) ?
					getSizeOfDoubleVec(3):
					getSizeOfDoubleVecArray(num_elements, 3);
		case DVEC4: // vec4
			return (num_elements == 0) ?
					getSizeOfDoubleVec(4):
					getSizeOfDoubleVecArray(num_elements, 4);
					
		// float vectors
		case IVEC2: // vec2
			return (num_elements == 0) ?
					getSizeOfFloatVec(2):
					getSizeOfFloatVecArray(num_elements, 2);
		case IVEC3: // vec3
			return (num_elements == 0) ?
					getSizeOfFloatVec(3):
					getSizeOfFloatVecArray(num_elements, 3);
		case IVEC4: // vec4
			return (num_elements == 0) ?
					getSizeOfFloatVec(4):
					getSizeOfFloatVecArray(num_elements, 4);
								
		// float vectors
		case VEC2: // vec2
			return (num_elements == 0) ?
					getSizeOfIntVec(2):
					getSizeOfIntVecArray(num_elements, 2);
		case VEC3: // vec3
			return (num_elements == 0) ?
					getSizeOfIntVec(3):
					getSizeOfIntVecArray(num_elements, 3);
		case VEC4: // vec4
			return (num_elements == 0) ?
					getSizeOfIntVec(4):
					getSizeOfIntVecArray(num_elements, 4);
		
		// float column major matrices
		case MAT2: // mat2
			return (num_elements == 0) ?
					getSizeOfColumnMajorFloatMatrix(2, 2):
					getSizeOfColumnMajorFloatMatrixArray(num_elements, 2, 2);
		case MAT2X3: // mat2x3
			return (num_elements == 0) ?
					getSizeOfColumnMajorFloatMatrix(2, 3):
					getSizeOfColumnMajorFloatMatrixArray(num_elements, 2, 3);
		case MAT2X4: // mat2x4
			return (num_elements == 0) ?
					getSizeOfColumnMajorFloatMatrix(2, 4):
					getSizeOfColumnMajorFloatMatrixArray(num_elements, 2, 4);
		case MAT3X2: // mat3x2
			return (num_elements == 0) ?
					getSizeOfColumnMajorFloatMatrix(3, 2):
					getSizeOfColumnMajorFloatMatrixArray(num_elements, 3, 2);
		case MAT3: // mat3
			return (num_elements == 0) ?
					getSizeOfColumnMajorFloatMatrix(3, 3):
					getSizeOfColumnMajorFloatMatrixArray(num_elements, 3, 3);
		case MAT3X4: // mat3x4
			return (num_elements == 0) ?
					getSizeOfColumnMajorFloatMatrix(3, 4):
					getSizeOfColumnMajorFloatMatrixArray(num_elements, 3, 4);
		case MAT4X2: // mat4x2
			return (num_elements == 0) ?
					getSizeOfColumnMajorFloatMatrix(4, 2):
					getSizeOfColumnMajorFloatMatrixArray(num_elements, 4, 2);
		case MAT4X3: // mat4x3
			return (num_elements == 0) ?
					getSizeOfColumnMajorFloatMatrix(4, 3):
					getSizeOfColumnMajorFloatMatrixArray(num_elements, 4, 3);
		case MAT4: // mat4
			return (num_elements == 0) ?
					getSizeOfColumnMajorFloatMatrix(4, 4):
					getSizeOfColumnMajorFloatMatrixArray(num_elements, 4, 4);
			
		// double row major matrices
		case DMAT2: // dmat2
			return (num_elements == 0) ?
					getSizeOfColumnMajorDoubleMatrix(2, 2):
					getSizeOfColumnMajorDoubleMatrixArray(num_elements, 2, 2);
		case DMAT2X3: // dmat2x3
			return (num_elements == 0) ?
					getSizeOfColumnMajorDoubleMatrix(2, 3):
					getSizeOfColumnMajorDoubleMatrixArray(num_elements, 2, 3);
		case DMAT2X4: // dmat2x4
			return (num_elements == 0) ?
					getSizeOfColumnMajorDoubleMatrix(2, 4):
					getSizeOfColumnMajorDoubleMatrixArray(num_elements, 2, 4);
		case DMAT3X2: // dmat3x2
			return (num_elements == 0) ?
					getSizeOfColumnMajorDoubleMatrix(3, 2):
					getSizeOfColumnMajorDoubleMatrixArray(num_elements, 3, 2);
		case DMAT3: // dmat3
			return (num_elements == 0) ?
					getSizeOfColumnMajorDoubleMatrix(3, 3):
					getSizeOfColumnMajorDoubleMatrixArray(num_elements, 3, 3);
		case DMAT3X4: // dmat3x4
			return (num_elements == 0) ?
					getSizeOfColumnMajorDoubleMatrix(3, 4):
					getSizeOfColumnMajorDoubleMatrixArray(num_elements, 3, 4);
		case DMAT4X2: // dmat4x2
			return (num_elements == 0) ?
					getSizeOfColumnMajorDoubleMatrix(4, 2):
					getSizeOfColumnMajorDoubleMatrixArray(num_elements, 4, 2);
		case DMAT4X3: // dmat4x3
			return (num_elements == 0) ?
					getSizeOfColumnMajorDoubleMatrix(4, 3):
					getSizeOfColumnMajorDoubleMatrixArray(num_elements, 4, 3);
		case DMAT4: // dmat4
			return (num_elements == 0) ?
					getSizeOfColumnMajorDoubleMatrix(4, 4):
					getSizeOfColumnMajorDoubleMatrixArray(num_elements, 4, 4);
		}
		
		return 0;
	}
	
	/* ------------------------------------------------------------------------
	 * Scalars
	 */
	
	/**
	 * @return The size in bytes of a boolean.
	 */
	public abstract int getSizeOfBoolean();

	/**
	 * @return The size in bytes of a double.
	 */
	public abstract int getSizeOfDouble();

	/**
	 * @return The size in bytes of a float.
	 */
	public abstract int getSizeOfFloat();

	/**
	 * @return The size in bytes of a int.
	 */
	public abstract int getSizeOfInt();
	
	/* ------------------------------------------------------------------------
	 * Vectors
	 */
	
	/**
	 * @param size - (int) Size of vector. Must be between 2 and 4 inclusive.
	 * @return The size in bytes of a bvec[2-4].
	 */
	public abstract int getSizeOfBooleanVec(int size);

	/**
	 * @param size - (int) Size of vector. Must be between 2 and 4 inclusive.
	 * @return The size in bytes of a dvec[2-4].
	 */
	public abstract int getSizeOfDoubleVec(int size);
	
	/**
	 * @param size - (int) Size of vector. Must be between 2 and 4 inclusive.
	 * @return The size in bytes of a vec[2-4].
	 */
	public abstract int getSizeOfFloatVec(int size);
	
	/**
	 * @param size - (int) Size of vector. Must be between 2 and 4 inclusive.
	 * @return The size in bytes of a ivec[2-4].
	 */
	public abstract int getSizeOfIntVec(int size);
	
	/* ------------------------------------------------------------------------
	 * Matrices
	 */
	
	/**
	 * @param rows - (int) Number of rows in matrix.
	 * @param cols - (int) Number of columns in matrix.
	 * @return The size in bytes of a mat#.
	 */
	public abstract int getSizeOfColumnMajorDoubleMatrix(int rows, int cols);
	
	/**
	 * @param rows - (int) Number of rows in matrix.
	 * @param cols - (int) Number of columns in matrix.
	 * @return The size in bytes of a mat#.
	 */
	public abstract int getSizeOfRowMajorDoubleMatrix(int rows, int cols);
	
	/**
	 * @param rows - (int) Number of rows in matrix.
	 * @param cols - (int) Number of columns in matrix.
	 * @return The size in bytes of a mat#.
	 */
	public abstract int getSizeOfColumnMajorFloatMatrix(int rows, int cols);
	
	/**
	 * @param rows - (int) Number of rows in matrix.
	 * @param cols - (int) Number of columns in matrix.
	 * @return The size in bytes of a mat#.
	 */
	public abstract int getSizeOfRowMajorFloatMatrix(int rows, int cols);
	
	/* ------------------------------------------------------------------------
	 * Arrays - scalars
	 */
	
	/**
	 * @param length - (int) Length of array.
	 * @return The size in bytes of a boolean.
	 */
	public abstract int getSizeOfBooleanArray(int length);
	
	/**
	 * @param length - (int) Length of array.
	 * @return The size in bytes of a boolean.
	 */
	public abstract int getSizeOfDoubleArray(int length);
	
	/**
	 * @param length - (int) Length of array.
	 * @return The size in bytes of a boolean.
	 */
	public abstract int getSizeOfFloatArray(int length);
	
	/**
	 * @param length - (int) Length of array.
	 * @return The size in bytes of a boolean.
	 */
	public abstract int getSizeOfIntArray(int length);
	
	/* ------------------------------------------------------------------------
	 * Arrays - vectors
	 */
	
	/**
	 * @param length - (int) Length of array.
	 * @param size - (int) Size of vector. Must be between 2 and 4 inclusive.
	 * @return The size in bytes of a boolean.
	 */
	public abstract int getSizeOfBooleanVecArray(int length, int size);
	
	/**
	 * @param length - (int) Length of array.
	 * @param size - (int) Size of vector. Must be between 2 and 4 inclusive.
	 * @return The size in bytes of a boolean.
	 */
	public abstract int getSizeOfDoubleVecArray(int length, int size);
	
	/**
	 * @param length - (int) Length of array.
	 * @param size - (int) Size of vector. Must be between 2 and 4 inclusive.
	 * @return The size in bytes of a boolean.
	 */
	public abstract int getSizeOfFloatVecArray(int length, int size);
	
	/**
	 * @param length - (int) Length of array.
	 * @param size - (int) Size of vector. Must be between 2 and 4 inclusive.
	 * @return The size in bytes of a boolean.
	 */
	public abstract int getSizeOfIntVecArray(int length, int size);
	
	/* ------------------------------------------------------------------------
	 * Arrays - matrices
	 */
	
	/**
	 * @param length - (int) Length of array.
	 * @param rows - (int) Number of rows in matrix.
	 * @param cols - (int) Number of columns in matrix.
	 * @return The size in bytes of a boolean.
	 */
	public abstract int getSizeOfColumnMajorDoubleMatrixArray(int length, int rows, int cols);
	
	/**
	 * @param length - (int) Length of array.
	 * @param rows - (int) Number of rows in matrix.
	 * @param cols - (int) Number of columns in matrix.
	 * @return The size in bytes of a boolean.
	 */
	public abstract int getSizeOfRowMajorDoubleMatrixArray(int length, int rows, int cols);
	
	/**
	 * @param length - (int) Length of array.
	 * @param rows - (int) Number of rows in matrix.
	 * @param cols - (int) Number of columns in matrix.
	 * @return The size in bytes of a boolean.
	 */
	public abstract int getSizeOfColumnMajorFloatMatrixArray(int length, int rows, int cols);
	
	/**
	 * @param length - (int) Length of array.
	 * @param rows - (int) Number of rows in matrix.
	 * @param cols - (int) Number of columns in matrix.
	 * @return The size in bytes of a boolean.
	 */
	public abstract int getSizeOfRowMajorFloatMatrixArray(int length, int rows, int cols);
	
}
