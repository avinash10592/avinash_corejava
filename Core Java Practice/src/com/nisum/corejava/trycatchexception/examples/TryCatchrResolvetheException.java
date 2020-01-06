/**
 * 
 */
package com.nisum.corejava.trycatchexception.examples;

/**
 * @author Nisum
 *
 */
public class TryCatchrResolvetheException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 50;
		int j = 0;
		int data;
		try {
			data = i / j; // may throw exception
		}
		// handling the exception
		catch (Exception e) {
			// resolving the exception in catch block
			System.out.println(i / (j + 2));
		}
	}

}
