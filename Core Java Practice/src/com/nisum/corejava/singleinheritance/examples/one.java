/**
 * 
 */
package com.nisum.corejava.singleinheritance.examples;

/**
 * @author Nisum
 *
 */
class one {
	public void print_geek() {
		System.out.println("Geeks");
	}
}

//Inherits feature of one.
class two extends one {
	public void print_for() {
		System.out.println("for");
	}
}

// Driver class 
class Main {
	public static void main(String[] args) {
		two obj = new two();
		obj.print_geek();
		obj.print_for();
		obj.print_geek();
	}
}