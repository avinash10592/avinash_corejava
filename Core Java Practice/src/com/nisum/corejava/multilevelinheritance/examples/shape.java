/**
 * 
 */
package com.nisum.corejava.multilevelinheritance.examples;

/**
 * @author Nisum
 *
 */
//Parent class
class Shape {
	public void display() {
		System.out.println("Inside display");
	}
}

//Inherits feature of Shape class.
class Rectangle extends Shape {
	public void area() {
		System.out.println("Inside area");
	}
}

//Inherits feature of Rectangle class.
class Cube extends Rectangle {
	public void volume() {
		System.out.println("Inside volume");
	}
}

//Main method
class Tester {
	public static void main(String[] arguments) {
		// Creating Referance variable cube.
		Cube cube = new Cube();
		cube.display();
		cube.area();
		cube.volume();
	}
}