/**
 * 
 */
package com.nisum.corejava.linkedhashset.examples;

import java.util.*;

/**
 * @author Nisum
 *
 */
public class LinkedHashSet1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(1);
		lhs.add(2);
		lhs.add(3);
		lhs.add(4);
		lhs.add(5);
		lhs.add(6);
		lhs.add(7);
		lhs.add(8);
		lhs.add(9);
		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<Integer>();
		lhs1.add(1);
		lhs1.add(2);
		lhs1.add(3);
		lhs1.add(4);
		lhs1.add(5);
		// duplicates are not allowed
		lhs.add(1);
		// Remove() Method
		lhs.remove(3);
		// clone() Method
		System.out.println("Clone() Method: " + lhs.clone());
		System.out.println("contains() Method: " + lhs.contains(9));
		// System.out.println("removeAll() Method: "+lhs.removeAll(lhs));
		System.out.println("hashCode() Method: " + lhs.hashCode());
		System.out.println("size() Method: " + lhs.size());
		System.out.println("retainAll() Method: " + lhs.retainAll(lhs1));
		for (Integer object : lhs) {
			System.out.println(object);
		}

	}
}
