/**
 * 
 */
package com.nisum.corejava.arrays.examples;

/**
 * @author Nisum
 *
 */
public class ExampleOfMultidimensional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaring and initializing 2D array
		int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };
		// printing 2D array
		for (int in1 = 0; in1 < 3; in1++) {
			for (int in2 = 0; in2 < 3; in2++) {
				System.out.print(arr[in1][in2] + " ");
			}
			System.out.println();
		}

	}
}
