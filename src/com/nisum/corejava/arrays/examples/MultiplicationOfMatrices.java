/**
 * 
 */
package com.nisum.corejava.arrays.examples;

/**
 * @author Nisum
 *
 */
public class MultiplicationOfMatrices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating two matrices
		int myarray1[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int myarray2[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

		// creating another matrix to store the multiplication of two matrices
		int myarray3[][] = new int[3][3]; // 3 rows and 3 columns

		// multiplying and printing multiplication of 2 matrices
		for (int in1 = 0; in1 < 3; in1++) {
			for (int in2 = 0; in2 < 3; in2++) {
				myarray3[in1][in2] = 0;
				for (int in3 = 0; in3 < 3; in3++) {
					myarray3[in1][in2] += myarray1[in1][in3] * myarray2[in3][in2];
				} // end of in3 loop
				System.out.print(myarray3[in1][in2] + " "); // printing matrix element
			} // end of in2 loop
			System.out.println();// new line

		}

	}
}
