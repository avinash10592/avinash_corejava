package com.nisum.corejava.controlstructure.examples;

public class NestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		// in1 for loop
		for (int in1 = 1; in1 <= num; in1++) {
			// in2 for loop
			for (int in2 = num; in2 >= in1; in2--) {
				System.out.print("* ");

			}
			System.out.println();
		}

	}

}
