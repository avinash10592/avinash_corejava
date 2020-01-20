package com.nisum.corejava.arrays.examples;

public class MultidimensionalJavaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arr[][] = { { 1.2, 2.3, 3.4 }, { 2.4, 4.3, 5.2 }, { 4.2, 4.2, 5.2 } };
		for (int in1 = 0; in1 < 3; in1++) {
			for (int in2 = 0; in2 < 3; in2++) {
				System.out.print(arr[in1][in2] + " ");
			}
              System.out.println();
		}
	}
}
