/**
 * 
 */
package com.nisum.corejava.hierarchicalinheritance.examples;

/**
 * @author Nisum
 *
 */

//Parent class
class Teacher {

	public void programming() {
		System.out.println("Java programming...");
	}

	void physics() {

		System.out.println("Physics...");
	}

	void chemistry() {

		System.out.println("Chemistry...");

	}
}

//Inherits feature of Teacher class
class ComputerDepartment extends Teacher {

	public void learn() {
		System.out.println("ComputerDepartment : Learn...");
	}

}

//Inherits feature of same Teacher class
class ScienceDepartment extends Teacher {

	public void learn() {
		System.out.println("\nScienceDepartment : Learn...");
	}
}

//Main class
class TestHierarchicalInheritance {

	public static void main(String[] args) {
		// creating referance variable for Computer departement
		ComputerDepartment cd = new ComputerDepartment();
		cd.learn();
		cd.programming();

		// creating referance variable for Science department
		ScienceDepartment sd = new ScienceDepartment();
		sd.learn();
		sd.physics();
		sd.chemistry();

	}

}
