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
 * Created on Feb 21, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.core.layouts;

/**
 * @author ethan
 *
 */
public class JavaLayout extends DataLayout {

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfBoolean()
	 */
	@Override
	public int getSizeOfBoolean() {
		return 4;
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfDouble()
	 */
	@Override
	public int getSizeOfDouble() {
		return Double.BYTES;
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfFloat()
	 */
	@Override
	public int getSizeOfFloat() {
		return Float.BYTES;
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfInt()
	 */
	@Override
	public int getSizeOfInt() {
		return Integer.BYTES;
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfBooleanVec(int)
	 */
	@Override
	public int getSizeOfBooleanVec(int size) {
		return size * getSizeOfBoolean();
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfDoubleVec(int)
	 */
	@Override
	public int getSizeOfDoubleVec(int size) {
		return size * getSizeOfDouble();
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfFloatVec(int)
	 */
	@Override
	public int getSizeOfFloatVec(int size) {
		return size * getSizeOfFloat();
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfIntVec(int)
	 */
	@Override
	public int getSizeOfIntVec(int size) {
		return size * getSizeOfInt();
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfColumnMajorDoubleMatrix(int, int)
	 */
	@Override
	public int getSizeOfColumnMajorDoubleMatrix(int rows, int cols) {
		return rows * cols * getSizeOfDouble();
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfRowMajorDoubleMatrix(int, int)
	 */
	@Override
	public int getSizeOfRowMajorDoubleMatrix(int rows, int cols) {
		return rows * cols * getSizeOfDouble();
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfColumnMajorFloatMatrix(int, int)
	 */
	@Override
	public int getSizeOfColumnMajorFloatMatrix(int rows, int cols) {
		return rows * cols * getSizeOfFloat();
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfRowMajorFloatMatrix(int, int)
	 */
	@Override
	public int getSizeOfRowMajorFloatMatrix(int rows, int cols) {
		return rows * cols * getSizeOfFloat();
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfBooleanArray(int)
	 */
	@Override
	public int getSizeOfBooleanArray(int length) {
		return length * getSizeOfBoolean();
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfDoubleArray(int)
	 */
	@Override
	public int getSizeOfDoubleArray(int length) {
		return length * getSizeOfDouble();
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfFloatArray(int)
	 */
	@Override
	public int getSizeOfFloatArray(int length) {
		return length * getSizeOfFloat();
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfIntArray(int)
	 */
	@Override
	public int getSizeOfIntArray(int length) {
		return length * getSizeOfInt();
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfBooleanVecArray(int, int)
	 */
	@Override
	public int getSizeOfBooleanVecArray(int length, int size) {
		return length * getSizeOfBooleanVec(size);
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfDoubleVecArray(int, int)
	 */
	@Override
	public int getSizeOfDoubleVecArray(int length, int size) {
		return length * getSizeOfDoubleVec(size);
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfFloatVecArray(int, int)
	 */
	@Override
	public int getSizeOfFloatVecArray(int length, int size) {
		return length * getSizeOfFloatVec(size);
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfIntVecArray(int, int)
	 */
	@Override
	public int getSizeOfIntVecArray(int length, int size) {
		return length * getSizeOfIntVec(size);
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfColumnMajorDoubleMatrixArray(int, int, int)
	 */
	@Override
	public int getSizeOfColumnMajorDoubleMatrixArray(int length, int rows, int cols) {
		return length * getSizeOfColumnMajorDoubleMatrix(rows, cols);
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfRowMajorDoubleMatrixArray(int, int, int)
	 */
	@Override
	public int getSizeOfRowMajorDoubleMatrixArray(int length, int rows, int cols) {
		return length * getSizeOfRowMajorDoubleMatrix(rows, cols);
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfColumnMajorFloatMatrixArray(int, int, int)
	 */
	@Override
	public int getSizeOfColumnMajorFloatMatrixArray(int length, int rows, int cols) {
		return length * getSizeOfColumnMajorFloatMatrix(rows, cols);
	}

	/* (non-Javadoc)
	 * @see org.viduus.charon.global.graphics.core.shaders.layouts.DataLayout#getSizeOfRowMajorFloatMatrixArray(int, int, int)
	 */
	@Override
	public int getSizeOfRowMajorFloatMatrixArray(int length, int rows, int cols) {
		return length * getSizeOfRowMajorFloatMatrix(rows, cols);
	}

}
