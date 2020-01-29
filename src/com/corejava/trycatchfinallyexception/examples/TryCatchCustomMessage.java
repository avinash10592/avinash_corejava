/**
 * 
 */
package com.corejava.trycatchfinallyexception.examples;

/**
 * @author Nisum
 *
 */
public class TryCatchCustomMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int data = 50 / 0;// may throw exception
		} catch (Exception e)// handling the exception
		{
			// displaying the custom message
			System.out.println("Can't divide by zero");

		}

	}

}
