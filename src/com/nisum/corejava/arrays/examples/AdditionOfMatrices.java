/**
 * 
 */
package com.nisum.corejava.arrays.examples;

/**
 * @author Nisum
 *
 */
public class AdditionOfMatrices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating two matrices
		int myarray1[][] = { { 1, 3, 4 }, { 3, 4, 5 } };
		int myarray2[][] = { { 1, 3, 4 }, { 3, 4, 5 } };

		// creating another matrix to store the sum of two matrices
		int myarray3[][] = new int[2][3];

		// adding and printing addition of 2 matrices
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				myarray3[i][j] = myarray1[i][j] + myarray2[i][j];
				System.out.print(myarray3[i][j] + " ");
			}
			System.out.println();// new line
		}

	}

}
