/**
 * 
 */
package com.nisum.corejava.trycatchfinallyexception.examples;

/**
 * @author Nisum
 *
 */
public class TryCatchException2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data = 50 / 0; // may throw exception
								// if exception occurs, the remaining statement will not exceute
			System.out.println("rest of the code");
		}
		// handling the exception
		catch (ArithmeticException e) {
			System.out.println(e);
		}

	}

}
