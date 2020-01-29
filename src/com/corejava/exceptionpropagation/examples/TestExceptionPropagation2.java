/**
 * 
 */
package com.corejava.exceptionpropagation.examples;

/**
 * @author Nisum
 *
 */
public class TestExceptionPropagation2 {
	void run1() {
		@SuppressWarnings("unused")
		int data = 50 / 0;
	}

	void run2() {
		run1();
	}

	void run3() {
		try {
			run2();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		TestExceptionPropagation1 obj = new TestExceptionPropagation1();
		obj.run3();
		System.out.println("normal flow...");
	}

}
