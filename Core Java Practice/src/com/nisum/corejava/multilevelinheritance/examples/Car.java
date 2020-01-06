/**
 * 
 */
package com.nisum.corejava.multilevelinheritance.examples;

/**
 * @author Nisum
 *
 */
//Parent claa
class Car {
	public Car() {
		System.out.println("Class Car");
	}

	public void vehicleType() {
		System.out.println("Vehicle Type: Car");
	}
}

//Inherits feature of Car class
class Maruti extends Car {
	public Maruti() {
		System.out.println("Class Maruti");
	}

	public void brand() {
		System.out.println("Brand: Maruti");
	}

	public void speed() {
		System.out.println("Max: 90Kmph");
	}
}

//Inherits feature of Maruthi class
class Maruti800 extends Maruti {

	public Maruti800() {
		System.out.println("Maruti Model: 800");
	}

	public void speed() {
		System.out.println("Max: 80Kmph");
	}

	public static void main(String args[]) {
		// Creating reference variable.
		Maruti800 obj = new Maruti800();
		obj.vehicleType();
		obj.brand();
		obj.speed();
	}
}
