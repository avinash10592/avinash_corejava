/**
 * 
 */
package com.corejava.trycatchfinallyexception.examples;

/**
 * @author Nisum
 *
 */
public class NestedTryExp1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				System.out.println("going to divide");
				int data = 39 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}

			try {
				int num[] = new int[5];
				num[5] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

			System.out.println("other statement");
		} catch (Exception e) {
			System.out.println("handeled");
		}

		System.out.println("normal flow..");

	}

}
