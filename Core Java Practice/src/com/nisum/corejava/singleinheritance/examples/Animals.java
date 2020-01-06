/**
 * 
 */
package com.nisum.corejava.singleinheritance.examples;

/**
 * @author Nisum
 *
 */
//Parent class
class Animals {

	void eat() {
		System.out.println("eating...");
	}
}

//Inherits feature of Animal.
class Dog extends Animals {
	void bark() {
		System.out.println("Barking");
	}
}

//Main method
class Testinheritance {
	public static void main(String args[]) {
		// Creating Referance variable
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.eat();
	}
}
