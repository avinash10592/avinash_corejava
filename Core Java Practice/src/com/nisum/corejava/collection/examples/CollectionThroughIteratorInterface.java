/**
 * 
 */
package com.nisum.corejava.collection.examples;

import java.util.*;

/**
 * @author Nisum
 *
 */

class ArrayList2 {
	public static void main(String args[]) {
		// Creating arraylist
		ArrayList<String> list = new ArrayList<String>();
		// Adding object in arraylist
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		// Traversing list through Iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
