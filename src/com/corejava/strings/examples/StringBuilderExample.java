/**
 * 
 */
package com.corejava.strings.examples;

/**
 * @author Nisum
 *
 */
public class StringBuilderExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello ");
		// now original string is changed
		// Append() Method
		sb.append("Java");
		System.out.println(sb);
		// Insert() Method
		sb.insert(1, "Java");
		System.out.println(sb);
		// Replace() Method
		sb.replace(1, 3, "Java");
		System.out.println(sb);
		// Delete() Method
		sb.delete(1, 3);
		System.out.println(sb);
		// Reverse() Method
		sb.reverse();
		System.out.println(sb);
	}

}
