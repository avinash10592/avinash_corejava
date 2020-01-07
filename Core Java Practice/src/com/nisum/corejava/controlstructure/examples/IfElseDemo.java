/**
 * 
 */
package com.nisum.corejava.controlstructure.examples;

/**
 * @author Nisum
 *
 */
public class IfElseDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int testscore = 76;
		char grade;
        // Using IfElse condition
		if (testscore >= 90) {
			grade = 'A';
		} else if (testscore >= 80) {
			grade = 'B';
		} else if (testscore >= 70) {
			grade = 'C';
		} else if (testscore >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Grade = " + grade);
	}

}
