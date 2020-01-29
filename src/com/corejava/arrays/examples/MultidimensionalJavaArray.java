package com.corejava.arrays.examples;

public class MultidimensionalJavaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };
		for (int in1 = 0; in1 < 3; in1++) {
			for (int in2 = 0; in2 < 3; in2++) {
				System.out.print(arr[in1][in2] + " ");
			}
			System.out.println();

		}
	}
}
