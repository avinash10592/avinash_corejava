/**
 * 
 */
package com.nisum.corejava.trycatchfinallyexception.examples;

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
		int data1 = 50;
		int data2 = 0;
		int ans;
		try {
			ans = data1 / data2; // may throw exception
		}
		// handling the exception
		catch (Exception e) {
			// resolving the exception in catch block
			System.out.println(data1 / (data2 + 2));
		}
	}

}
