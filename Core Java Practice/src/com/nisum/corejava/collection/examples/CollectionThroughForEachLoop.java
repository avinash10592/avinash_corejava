package com.nisum.corejava.collection.examples;

import java.util.*;

class ArrayList3 {
	public static void main(String args[]) {
		// Creating arraylist
		ArrayList<String> al = new ArrayList<String>();
		// Adding object in arraylist
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		// Traversing list through for-each loop
		for (String obj : al)
			System.out.println(obj);
	}
}
