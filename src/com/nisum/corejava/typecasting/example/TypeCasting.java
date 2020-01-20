/**
 * 
 */
package com.nisum.corejava.typecasting.example;

/**
 * @author Nisum
 *
 */
public class TypeCasting {
	public static void main(String arg[]) {
		byte byt;
		int in = 81;
		double dbl = 323.142;
		float flt = 72.38f;
		char car = 'A';

		car = (char) in;
		System.out.println("integer = " + in + " character = " + car);

		in = (int) dbl; 
		System.out.println("double = " + dbl + " integer = " + in); // LINE B

		in = (int) flt; 
		System.out.println("float = " + flt + " integer = " + in); // LINE D

		byt = (byte) dbl;
		System.out.println("double = " + dbl + " byte = " + byt);

	}
}
