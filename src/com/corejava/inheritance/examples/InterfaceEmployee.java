package com.corejava.inheritance.examples;

interface Employee1 {
    // Abstract methods of Employee1.
    void Employee1Doj();

    void Employee1Proj();

}

//Interface of employee2.
interface Employee2 {
    // Abstract methods of Employee2.
    void Employee2Doj();

    void Employee2Proj();

}

//Implementing Employee1 & Employee2 methods in Office class.
class Office implements Employee1, Employee2 {
    public void Employee1Doj() {
        System.out.println("Date of joining:November 14th 2019");
    }

    public void Employee1Proj() {
        System.out.println("Project:GAP");
    }

    public void Employee2Doj() {
        System.out.println("Date of joining:December 14th 2019");
    }

    public void Employee2Proj() {
        System.out.println("Project:SAFEWAY");
    }

}

//Main class.
class InterfaceOffice {
    public static void main(String args[]) {
        Office emp = new Office();
        System.out.println("Detailes of Employee1:");
        emp.Employee1Doj();
        emp.Employee1Proj();
        System.out.println("\nDetails of Employee2:");
        emp.Employee2Doj();
        emp.Employee2Proj();

    }
}
