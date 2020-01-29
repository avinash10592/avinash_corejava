/**
 * 
 */
package com.corejava.defaultconstructor.examples;

/**
 * @author Nisum
 *
 */
class Student {
	int id;
	String name;

//method to display the value of id and name  
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
//creating objects  
		Student student1 = new Student();
		Student student2 = new Student();
//displaying values of the object  
		student1.display();
		student2.display();
	}
}
