/**
 * 
 */
package com.nisum.corejava.multilevelinheritance.examples;

/**
 * @author Nisum
 *
 */
// Parent class
class Animals {
	void eat() {
		System.out.println("eating..");
	}
}

// Inherits feature of Animal class
class Dog extends Animals {
	void bark() {
		System.out.println("barking...");
	}
}

// Inherits feature of Dog class
class Babydog extends Dog {
	void weep() {
		System.out.println("weeping...");
	}
}

class Testinheratance2 {
	public static void main(String args[]) {
		// Creating a reference variable to Babydog.
		Babydog bd = new Babydog();
		bd.weep();
		bd.bark();
		bd.eat();

	}
}
