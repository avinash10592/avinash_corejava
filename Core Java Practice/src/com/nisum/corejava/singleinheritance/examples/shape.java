/**
 * 
 */
package com.nisum.corejava.singleinheritance.examples;

/**
 * @author Nisum
 *
 */
class Shape {
	int length;
	int breadth;

}

//Inherits feature of Shape class
class Rectangle extends Shape {
	int area;

	public void calcualteArea() {
		area = length * breadth;
	}

	public static void main(String args[]) {
		Rectangle rect = new Rectangle();
		// Assigning values to Shape class attributes
		rect.length = 10;
		rect.breadth = 20;
		// Calculate the area
		rect.calcualteArea();
		System.out.println("The Area of rectangle of length \"" + rect.length + "\" and breadth \"" + rect.breadth
				+ "\" is \"" + rect.area + "\"");
	}
}
