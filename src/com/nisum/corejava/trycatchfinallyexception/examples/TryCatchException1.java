/**
 * 
 */
package com.nisum.corejava.trycatchfinallyexception.examples;

/**
 * @author Nisum
 *
 */
public class TryCatchException1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int data = 50 / 0;// may throw exception
		} catch (Exception e)// handling the exception
		{

			System.out.println(e);

		}
		System.out.println("rest of the code");
	}

}
