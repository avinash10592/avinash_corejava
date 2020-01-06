/**
 * 
 */
package com.nisum.corejava.collection.examples;

import java.util.*;

/**
 * @author Nisum
 *
 */
class ArrayList4 {
	public static void main(String args[]) {
		// Creating arraylist
		List<Integer> value = new ArrayList<Integer>();
		// Adding object in arraylist
		value.add(2);
		value.add(66);
		value.add(88);
		value.add(99);
		value.add(10);
		value.add(50);
		value.add(90);
		value.get(3);
		// Removing objects in arraylist
		value.remove(2);
		value.remove(5);

		Collections.sort(value);
		// Stream API...Lamda Expression forEach
		// value.forEach(System.out::println);
		// Traversing list through for-each loop
		for (int obj : value)
			System.out.println(obj);
	}
}