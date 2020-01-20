package com.nisum.corejava.exceptionpropagation.examples;

import java.io.IOException;

class TestExceptionPropagation1 {
	void run1() throws IOException {
		throw new java.io.IOException("device error");// checked exception
	}

	void run2() throws IOException {
		run1();
	}

	void run3() {
		try {
			run2();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[]) {
		TestExceptionPropagation1 obj = new TestExceptionPropagation1();
		obj.run3();
		System.out.println("normal flow");
	}
}