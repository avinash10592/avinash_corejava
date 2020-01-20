/**
 * 
 */
package com.nisum.corejava.trycatchfinallyexception.examples;

/**
 * @author Nisum
 *
 */
public class GeneratingtheExceptioninCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data1 = 50 / 0; // may throw exception

		}
		// handling the exception
		catch (Exception e) {
			// generating the exception in catch block
			int data2 = 50 / 0; // may throw exception

		}
		System.out.println("rest of the code");

	}

}
