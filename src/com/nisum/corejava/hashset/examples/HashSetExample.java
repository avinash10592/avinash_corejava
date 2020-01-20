/**
 * 
 */
package com.nisum.corejava.hashset.examples;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		hs.add("Five");
		hs.add("Six");
		hs.add("Seven");
		hs.add("Eight");
		hs.add("Nine");
		// duplicates are not allowed
		hs.add("One");
		// Remove() Method
		hs.remove("Three");
		// clone() Method
		System.out.println("Clone() Method: " + hs.clone());
		System.out.println("contains() Method: " + hs.contains("Nine"));
		// System.out.println("removeAll() Method: "+hs.removeAll(hs));
		System.out.println("hashCode() Method: " + hs.hashCode());
		System.out.println("size() Method: " + hs.size());
		System.out.println("retainAll() Method: " + hs.retainAll(hs));
		// output shows that there is no insertion order preserved
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
