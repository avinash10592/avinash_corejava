/**
 * 
 */
package com.nisum.corejava.hierarchicalinheritance.examples;

/**
 * @author Nisum
 *
 */
//Parent class
class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

//Inherits feature of Animal class.
class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}

//Inherits feature of Animal class.
class Cat extends Animal {
	void meow() {
		System.out.println("meowing...");
	}
}

//Main method
class TestInheritance3 {
	public static void main(String args[]) {

		// Referance variable for Cat class.
		Cat cat = new Cat();
		System.out.println("Cat activities:");
		cat.meow();
		cat.eat();
		// Referance variable for dog class.
		Dog dog = new Dog();
		System.out.println("\nDog activities:");
		dog.bark();
		dog.eat();

	}
}