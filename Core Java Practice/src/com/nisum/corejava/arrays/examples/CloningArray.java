/**
 * 
 */
package com.nisum.corejava.arrays.examples;

/**
 * @author Nisum
 *
 */
public class CloningArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 33, 3, 4, 5 };
		System.out.println("Printing original array:");
		for (int in : arr)
			System.out.println(in);

		System.out.println("Printing clone of the array:");
		int carr[] = arr.clone();
		for (int in1 : carr)
			System.out.println(in1);

		System.out.println("Are both equal?");
		System.out.println(arr == carr);

	}

}
