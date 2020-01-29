package com.corejava.userdefinedexception.examples;

import java.util.Scanner;

public class Doctor {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Available doctors.  \n 1. Dentist \n 2. ENT doctor \n Please enter the option to get the available timings:");
        int userInput = sc.nextInt();
        if (userInput == 1) {
            System.out.println("Dentist is avaliable from 18-21 to book an appointment.");
        } else if (userInput == 2) {
            System.out.println("ENT Doctor is avaliable from 9-14 to book an appointment.");
        } else {
            throw new Exception("please Enter the valid option.");
        }

        System.out.println("Enter the time in 24 hours:");

        int time = sc.nextInt();

        if (time >= 18 && time <= 21) {
            System.out.println("Your appointment has been confirmed with Dentist.");
        } else if (time >= 9 && time <= 14) {
            System.out.println("Your appointment has been conformed with ENT Doctor.");
        } else {
            throw new Exception("Dentist and ENT Doctor is not available to book an appointment at this time.");
        }
    }
}
