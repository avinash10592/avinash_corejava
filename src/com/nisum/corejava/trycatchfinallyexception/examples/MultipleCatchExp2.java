/**
 * 
 */
package com.nisum.corejava.trycatchfinallyexception.examples;

/**
 * @author Nisum
 *
 */
public class MultipleCatchExp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[] = new int[5];

			System.out.println(arr[10]);
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");

	}

}