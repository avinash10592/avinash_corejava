/**
 *
 */
package com.corejava.constructor.examples;

/**
 * @author Nisum
 *
 */
class Student1 {
    int id;
    String name;

    // creating a parameterized constructor
    Student1(int id, String name) {

    }

    // method to display the values
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        // creating objects and passing values
        Student1 stu1 = new Student1(111, "Karan");
        Student1 stu2 = new Student1(222, "Aryan");
        // calling method to display the values of object
        stu1.display();
        stu2.display();
    }
}
