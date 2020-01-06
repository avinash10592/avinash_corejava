/**
 * 
 */
package com.nisum.corejava.hybrideinheritance.example;

/**
 * @author Nisum
 *
 */

//Parent class

class GradFater {

	public void land() {
		System.out.println("GradFater's land");
	}

}

//Inherits feature of Grand father
class Father extends GradFater {

	public void home() {
		System.out.println("Father's home");
	}

	public void Car() {
		System.out.println("Father's Car");
	}
}

//Inherits feature of Father
class Son extends Father {

	public void mobile() {
		System.out.println("Son's mobile");
	}
}

//Inherits feature of Father
class Daughter extends Father {

	public void purse() {
		System.out.println("Daughter's purse");
	}
}

//Main class
class TestHybridInheritance {

	public static void main(String[] args) {

		// Son object
		System.out.println("Son's properties:\n");
		Son s = new Son();
		s.land();// Grand father method
		s.Car(); // Father method
		s.home();// Father method
		s.mobile();// son method

		// Daughter object
		System.out.println("\nDaughter's Properties:\n");
		Daughter d = new Daughter();
		d.land();// Grand father method
		d.Car(); // Father method
		d.home();// Father method
		d.purse();// son method

	}

}
