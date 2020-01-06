/**
 * 
 */
package com.nisum.corejava.exceptionpropagation.examples;

/**
 * @author Nisum
 *
 */
public class TestExceptionPropagation2 {
	void m() {
		@SuppressWarnings("unused")
		int data = 50 / 0;
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		TestExceptionPropagation1 obj = new TestExceptionPropagation1();
		obj.p();
		System.out.println("normal flow...");
	}

}
