package com.nisum.corejava.controlstructure.examples;

public class NestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=6;
		// i for loop
		for (int i = 1; i <= x; i++) {
			// j for loop
			for (int j = x; j >= i; j--) {
				System.out.print("* ");

			}
			System.out.println();
		}

	}

}
