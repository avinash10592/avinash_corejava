package com.corejava.strings.examples;

public class OperatorMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "avinash";
		String s2 = "avinash";
		String s3 = new String("Avinash");
		System.out.println(s1 == s2);//true (because both refer to same instance)  
		System.out.println(s1 == s3);//false(because s3 refers to instance created in nonpool)

	}

}
