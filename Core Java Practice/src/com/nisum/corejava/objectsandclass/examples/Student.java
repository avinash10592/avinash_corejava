/**
 * 
 */
package com.nisum.corejava.objectsandclass.examples;

/**
 * @author Nisum
 *
 */
// Defining a Student class.
class Student {

	// defining fields
	int id;
	String name;

	// creating main method inside the Student class
	public static void main(String args[]) {
		// Creating an object or instance
		// creating an object of Student
		Student std1 = new Student();
		// Printing values of the object
		// accessing member through reference variable
		System.out.println(std1.id);
		System.out.println(std1.name);
	}
}
