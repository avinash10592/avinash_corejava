/**
 * 
 */
package com.nisum.corejava.variableanddatatypes.examples;

/**
 * @author Nisum
 *
 */
public class DataTypes {
	public static void main(String args[]) {
		// declaring character.
		char chr = 'G';

		// Integer data type is generally used for numeric values.
		int in = 89;

		// use byte and short if memory is a constraint

		// this will give error as number is larger than byte range
		// byte by1 = 7888888955;
		byte by = 78;

		// this will give error as number is larger than short range
		// short sh1 = 87878787878;
		short sh = 87;
		// this will give error as number is larger than long range
		// long lg1 = 0101010101010;
		long lg = 1010101010;

		// by default fraction value
		// is double or float in java
		double dub = 4.355453532;

		// for float use 'f' as suffix
		float flt = 4.7333434f;

		System.out.println("char: " + chr);
		System.out.println("integer: " + in);
		System.out.println("byte: " + by);
		System.out.println("short: " + sh);
		System.out.println("long: " + lg);
		System.out.println("float: " + flt);
		System.out.println("double: " + dub);
	}
}
