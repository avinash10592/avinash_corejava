/**
 * 
 */
package com.nosum.corejava.nestedtry.example;

/**
 * @author Nisum
 *
 */
public class NestedTryExp2 {
	public static void main(String args[]) {

		try {

			try {

				try {
					int arr[] = { 1, 2, 3, 4 };

					System.out.println(arr[10]);
				} catch (ArithmeticException e) {
					System.out.println("Arithmetic Exception");
					System.out.println(" handled in try-block3");
				}
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic Exception");
				System.out.println(" handled in try-block2");
			}
		} catch (ArithmeticException e3) {
			System.out.println("Arithmetic Exception");
			System.out.println(" handled in main try-block");
		} catch (ArrayIndexOutOfBoundsException e4) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println(" handled in main try-block");
		} catch (Exception e5) {
			System.out.println("Exception");
			System.out.println(" handled in main try-block");
		}
	}

}
