/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jan 17, 2017 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.core.layouts;

import org.viduus.lwjgl.graphics.shaders.core.ShaderException;

/**
 * This class's intended purpose is to know how much space a data type takes
 * when padded in a UBO that is using the layout std140. The rules for std140
 * are listed below and were copied verbatim from the <u>OpenGL 4.3 (Core
 * Profile) February 13, 2013</u>
 * 
 * <ol>
 *  <li>If the member is a scalar consuming N basic machine units, the base
 *  alignment is N.</li>
 *  <li>If the member is a two- or four-component vector with components
 *  consuming N basic machine units, the base alignment is 2N or 4N,
 *  respectively.</li>
 *  <li>If the member is a three-component vector with components consuming N
 *  basic machine units, the base alignment is 4N.</li>
 *  <li>If the member is an array of scalars or vectors, the base alignment and
 *  array stride are set to match the base alignment of a single array element,
 *  according to rules (1), (2), and (3), and rounded up to the base alignment
 *  of a vec4. The array may have padding at the end; the base offset of the
 *  member following the array is rounded up to the next multiple of the base
 *  alignment.</li>
 *  <li>If the member is a column-major matrix with C columns and R rows, the
 *  matrix is stored identically to an array of C column vectors with R
 *  components each, according to rule (4).</li>
 *  <li>If the member is an array of S column-major matrices with C columns and
 *  R rows, the matrix is stored identically to a row of S × C column vectors
 *  with R components each, according to rule (4).</li>
 *  <li>If the member is a row-major matrix with C columns and R rows, the
 *  matrix is stored identically to an array of R row vectors with C components
 *  each, according to rule (4).</li>
 *  <li>If the member is an array of S row-major matrices with C columns and R
 *  rows, the matrix is stored identically to a row of S × R row vectors with C
 *  components each, according to rule (4).</li>
 *  <li>If the member is a structure, the base alignment of the structure is N,
 *  where N is the largest base alignment value of any of its members, and
 *  rounded up to the base alignment of a vec4. The individual members of this
 *  substructure are then assigned offsets by applying this set of rules
 *  recursively, where the base offset of the first member of the sub-structure
 *  is equal to the aligned offset of the structure. The structure may have
 *  padding at the end; the base offset of the member following the
 *  sub-structure is rounded up to the next multiple of the base alignment of
 *  the structure.</li>
 *  <li>If the member is an array of S structures, the S elements of the array
 *  are laid out in order, according to rule (9).</li>
 * </ol>
 * 
 * @author Ethan Toney
 */
public class Std140 extends DataLayout {

	public static final int BOOLEAN_SIZE_IN_BYTES = 4;
	public static final int DOUBLE_SIZE_IN_BYTES = 8;
	public static final int FLOAT_SIZE_IN_BYTES = 4;
	public static final int INT_SIZE_IN_BYTES = 4;
	public static final int ALIGNMENT_IN_BYTES = 16;
	
	private int align(int bytes){
		return (bytes % ALIGNMENT_IN_BYTES == 0) ?
				bytes:
				bytes + ALIGNMENT_IN_BYTES - bytes % ALIGNMENT_IN_BYTES; //Rounded up to next vec4 (16 bytes)
	}
	
	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfBoolean()
	 */
	@Override
	public int getSizeOfBoolean() {
		return BOOLEAN_SIZE_IN_BYTES;
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfBooleanArray(int)
	 */
	@Override
	public int getSizeOfBooleanArray(int i) {
		return align(i * getSizeOfBoolean());
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfBooleanVec(int)
	 */
	@Override
	public int getSizeOfBooleanVec(int i) {
		switch(i) {
		case 2:
			return 2*getSizeOfBoolean();
		case 3:
		case 4:
			return 4*getSizeOfBoolean();
		}
		throw new ShaderException("%d is not a valid size for a vector in glsl.", i);
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfBooleanVecArray(int, int)
	 */
	@Override
	public int getSizeOfBooleanVecArray(int i, int j) {
		return align(i * getSizeOfBooleanVec(j));
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfColumnMajorDoubleMatrix(int, int)
	 */
	@Override
	public int getSizeOfColumnMajorDoubleMatrix(int rows, int cols) {
		return getSizeOfDoubleVecArray(cols, rows);
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfColumnMajorDoubleMatrixArray(int, int, int)
	 */
	@Override
	public int getSizeOfColumnMajorDoubleMatrixArray(int i, int rows, int cols) {
		return i * getSizeOfDoubleVecArray(cols, rows);
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfColumnMajorFloatMatrix(int, int)
	 */
	@Override
	public int getSizeOfColumnMajorFloatMatrix(int rows, int cols) {
		return getSizeOfFloatVecArray(cols, rows);
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfColumnMajorFloatMatrixArray(int, int, int)
	 */
	@Override
	public int getSizeOfColumnMajorFloatMatrixArray(int i, int rows, int cols) {
		return i * getSizeOfFloatVecArray(cols, rows);
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfDouble()
	 */
	@Override
	public int getSizeOfDouble() {
		return DOUBLE_SIZE_IN_BYTES;
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfDoubleArray(int)
	 */
	@Override
	public int getSizeOfDoubleArray(int i) {
		return align(i * getSizeOfDouble());
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfDoubleVec(int)
	 */
	@Override
	public int getSizeOfDoubleVec(int i) {
		switch(i) {
		case 2:
			return 2*getSizeOfDouble();
		case 3:
		case 4:
			return 4*getSizeOfDouble();
		}
		throw new ShaderException("%d is not a valid size for a vector in glsl.", i);
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfDoubleVecArray(int, int)
	 */
	@Override
	public int getSizeOfDoubleVecArray(int i, int j) {
		return align(i * getSizeOfDoubleVec(j));
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfFloat()
	 */
	@Override
	public int getSizeOfFloat() {
		return FLOAT_SIZE_IN_BYTES;
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfFloatArray(int)
	 */
	@Override
	public int getSizeOfFloatArray(int i) {
		return align(i * getSizeOfFloat());
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfFloatVec(int)
	 */
	@Override
	public int getSizeOfFloatVec(int i) {
		switch(i) {
		case 2:
			return 2*getSizeOfFloat();
		case 3:
		case 4:
			return 4*getSizeOfFloat();
		}
		throw new ShaderException("%d is not a valid size for a vector in glsl.", i);
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfFloatVecArray(int, int)
	 */
	@Override
	public int getSizeOfFloatVecArray(int i, int j) {
		return align(i * getSizeOfFloatVec(j));
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfInt()
	 */
	@Override
	public int getSizeOfInt() {
		return INT_SIZE_IN_BYTES;
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfIntArray(int)
	 */
	@Override
	public int getSizeOfIntArray(int i) {
		return align(i * getSizeOfInt());
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfIntVec(int)
	 */
	@Override
	public int getSizeOfIntVec(int i) {
		switch(i) {
		case 2:
			return 2*getSizeOfInt();
		case 3:
		case 4:
			return 4*getSizeOfInt();
		}
		throw new ShaderException("%d is not a valid size for a vector in glsl.", i);
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfIntVecArray(int, int)
	 */
	@Override
	public int getSizeOfIntVecArray(int i, int j) {
		return align(i * getSizeOfIntVec(j));
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfRowMajorDoubleMatrix(int, int)
	 */
	@Override
	public int getSizeOfRowMajorDoubleMatrix(int rows, int cols) {
		return getSizeOfDoubleVecArray(rows, cols);
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfRowMajorDoubleMatrixArray(int, int, int)
	 */
	@Override
	public int getSizeOfRowMajorDoubleMatrixArray(int i, int rows, int cols) {
		return i * getSizeOfDoubleVecArray(rows, cols);
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfRowMajorFloatMatrix(int, int)
	 */
	@Override
	public int getSizeOfRowMajorFloatMatrix(int rows, int cols) {
		return getSizeOfFloatVecArray(rows, cols);
	}

	/* (non-Javadoc)
	 * @see com.viduus.charon.global.graphics.opengl.shaders.layouts.DataLayout#getSizeOfRowMajorFloatMatrixArray(int, int, int)
	 */
	@Override
	public int getSizeOfRowMajorFloatMatrixArray(int i, int rows, int cols) {
		return i * getSizeOfFloatVecArray(rows, cols);
	}
	
}
