/**
 * 
 */
package com.nisum.corejava.abstractclass.example;

/**
 * @author Nisum
 *
 */

//Abstract class
abstract class Animal {
// Abstract method (does not have a body)
	public abstract void animalSound();

	public abstract void tigersound();

	public void sleep() {
		System.out.println("Zzz");
	}
}

//Subclass (inherit from Animal)
class Pig extends Animal {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}

	public void tigersound() {
		System.out.println("The tiger says:roar");
	}
}

class MyMainClass {
	public static void main(String[] args) {
		Pig myPig = new Pig(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
		myPig.tigersound();
	}
}