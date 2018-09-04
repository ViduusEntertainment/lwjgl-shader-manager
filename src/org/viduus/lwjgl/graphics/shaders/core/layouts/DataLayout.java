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
 * Created on Jan 17, 2017 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.core.layouts;

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
	
	public int getTypeSize(VariableType type) {
		switch (type) {
		case BOOL: // boolean
		case DOUBLE: // double
		case FLOAT: // float
		case INT: // int
			return 1;
		case BOOL_VEC2: // vec2
		case FLOAT_VEC2: // vec2
		case INT_VEC2: // vec2
		case DOUBLE_VEC2: // vec2
			return 2;
		case BOOL_VEC3: // vec3
		case DOUBLE_VEC3: // vec3
		case INT_VEC3: // vec3
		case FLOAT_VEC3: // vec3
			return 3;
		case BOOL_VEC4: // vec4
		case DOUBLE_VEC4: // vec4
		case INT_VEC4: // vec4
		case FLOAT_VEC4: // vec4
		case FLOAT_MAT2: // mat2
		case DOUBLE_MAT2: // dmat2
			return 4;
		case FLOAT_MAT2x3: // mat2x3
		case FLOAT_MAT3x2: // mat3x2
		case DOUBLE_MAT2x3: // dmat2x3
		case DOUBLE_MAT3x2: // dmat3x2
			return 6;
		case FLOAT_MAT2x4: // mat2x4
		case FLOAT_MAT4x2: // mat4x2
		case DOUBLE_MAT2x4: // dmat2x4
		case DOUBLE_MAT4x2: // dmat4x2
			return 8;
		case FLOAT_MAT3: // mat3
		case DOUBLE_MAT3: // dmat3
			return 9;
		case FLOAT_MAT3x4: // mat3x4
		case FLOAT_MAT4x3: // mat4x3
		case DOUBLE_MAT3x4: // dmat3x4
		case DOUBLE_MAT4x3: // dmat4x3
			return 12;
		case FLOAT_MAT4: // mat4
		case DOUBLE_MAT4: // dmat4
			return 16;
		default:
			return 0;
		}
	}
	
	public int getByteSize(VariableType type, int num_elements) {
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
		case BOOL_VEC2: // vec2
			return (num_elements == 0) ?
					getSizeOfBooleanVec(2):
					getSizeOfBooleanVecArray(num_elements, 2);
		case BOOL_VEC3: // vec3
			return (num_elements == 0) ?
					getSizeOfBooleanVec(3):
					getSizeOfBooleanVecArray(num_elements, 3);
		case BOOL_VEC4: // vec4
			return (num_elements == 0) ?
					getSizeOfBooleanVec(4):
					getSizeOfBooleanVecArray(num_elements, 4);
		
		// double vectors
		case DOUBLE_VEC2: // vec2
			return (num_elements == 0) ?
					getSizeOfDoubleVec(2):
					getSizeOfDoubleVecArray(num_elements, 2);
		case DOUBLE_VEC3: // vec3
			return (num_elements == 0) ?
					getSizeOfDoubleVec(3):
					getSizeOfDoubleVecArray(num_elements, 3);
		case DOUBLE_VEC4: // vec4
			return (num_elements == 0) ?
					getSizeOfDoubleVec(4):
					getSizeOfDoubleVecArray(num_elements, 4);
					
		// float vectors
		case INT_VEC2: // vec2
			return (num_elements == 0) ?
					getSizeOfFloatVec(2):
					getSizeOfFloatVecArray(num_elements, 2);
		case INT_VEC3: // vec3
			return (num_elements == 0) ?
					getSizeOfFloatVec(3):
					getSizeOfFloatVecArray(num_elements, 3);
		case INT_VEC4: // vec4
			return (num_elements == 0) ?
					getSizeOfFloatVec(4):
					getSizeOfFloatVecArray(num_elements, 4);
								
		// float vectors
		case FLOAT_VEC2: // vec2
			return (num_elements == 0) ?
					getSizeOfIntVec(2):
					getSizeOfIntVecArray(num_elements, 2);
		case FLOAT_VEC3: // vec3
			return (num_elements == 0) ?
					getSizeOfIntVec(3):
					getSizeOfIntVecArray(num_elements, 3);
		case FLOAT_VEC4: // vec4
			return (num_elements == 0) ?
					getSizeOfIntVec(4):
					getSizeOfIntVecArray(num_elements, 4);
		
		// float column major matrices
		case FLOAT_MAT2: // mat2
			return (num_elements == 0) ?
					getSizeOfColumnMajorFloatMatrix(2, 2):
					getSizeOfColumnMajorFloatMatrixArray(num_elements, 2, 2);
		case FLOAT_MAT2x3: // mat2x3
			return (num_elements == 0) ?
					getSizeOfColumnMajorFloatMatrix(2, 3):
					getSizeOfColumnMajorFloatMatrixArray(num_elements, 2, 3);
		case FLOAT_MAT2x4: // mat2x4
			return (num_elements == 0) ?
					getSizeOfColumnMajorFloatMatrix(2, 4):
					getSizeOfColumnMajorFloatMatrixArray(num_elements, 2, 4);
		case FLOAT_MAT3x2: // mat3x2
			return (num_elements == 0) ?
					getSizeOfColumnMajorFloatMatrix(3, 2):
					getSizeOfColumnMajorFloatMatrixArray(num_elements, 3, 2);
		case FLOAT_MAT3: // mat3
			return (num_elements == 0) ?
					getSizeOfColumnMajorFloatMatrix(3, 3):
					getSizeOfColumnMajorFloatMatrixArray(num_elements, 3, 3);
		case FLOAT_MAT3x4: // mat3x4
			return (num_elements == 0) ?
					getSizeOfColumnMajorFloatMatrix(3, 4):
					getSizeOfColumnMajorFloatMatrixArray(num_elements, 3, 4);
		case FLOAT_MAT4x2: // mat4x2
			return (num_elements == 0) ?
					getSizeOfColumnMajorFloatMatrix(4, 2):
					getSizeOfColumnMajorFloatMatrixArray(num_elements, 4, 2);
		case FLOAT_MAT4x3: // mat4x3
			return (num_elements == 0) ?
					getSizeOfColumnMajorFloatMatrix(4, 3):
					getSizeOfColumnMajorFloatMatrixArray(num_elements, 4, 3);
		case FLOAT_MAT4: // mat4
			return (num_elements == 0) ?
					getSizeOfColumnMajorFloatMatrix(4, 4):
					getSizeOfColumnMajorFloatMatrixArray(num_elements, 4, 4);
			
		// double row major matrices
		case DOUBLE_MAT2: // dmat2
			return (num_elements == 0) ?
					getSizeOfColumnMajorDoubleMatrix(2, 2):
					getSizeOfColumnMajorDoubleMatrixArray(num_elements, 2, 2);
		case DOUBLE_MAT2x3: // dmat2x3
			return (num_elements == 0) ?
					getSizeOfColumnMajorDoubleMatrix(2, 3):
					getSizeOfColumnMajorDoubleMatrixArray(num_elements, 2, 3);
		case DOUBLE_MAT2x4: // dmat2x4
			return (num_elements == 0) ?
					getSizeOfColumnMajorDoubleMatrix(2, 4):
					getSizeOfColumnMajorDoubleMatrixArray(num_elements, 2, 4);
		case DOUBLE_MAT3x2: // dmat3x2
			return (num_elements == 0) ?
					getSizeOfColumnMajorDoubleMatrix(3, 2):
					getSizeOfColumnMajorDoubleMatrixArray(num_elements, 3, 2);
		case DOUBLE_MAT3: // dmat3
			return (num_elements == 0) ?
					getSizeOfColumnMajorDoubleMatrix(3, 3):
					getSizeOfColumnMajorDoubleMatrixArray(num_elements, 3, 3);
		case DOUBLE_MAT3x4: // dmat3x4
			return (num_elements == 0) ?
					getSizeOfColumnMajorDoubleMatrix(3, 4):
					getSizeOfColumnMajorDoubleMatrixArray(num_elements, 3, 4);
		case DOUBLE_MAT4x2: // dmat4x2
			return (num_elements == 0) ?
					getSizeOfColumnMajorDoubleMatrix(4, 2):
					getSizeOfColumnMajorDoubleMatrixArray(num_elements, 4, 2);
		case DOUBLE_MAT4x3: // dmat4x3
			return (num_elements == 0) ?
					getSizeOfColumnMajorDoubleMatrix(4, 3):
					getSizeOfColumnMajorDoubleMatrixArray(num_elements, 4, 3);
		case DOUBLE_MAT4: // dmat4
			return (num_elements == 0) ?
					getSizeOfColumnMajorDoubleMatrix(4, 4):
					getSizeOfColumnMajorDoubleMatrixArray(num_elements, 4, 4);
					
		default:
			return 0;
		}
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
