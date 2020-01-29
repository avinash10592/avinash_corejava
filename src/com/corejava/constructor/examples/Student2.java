/**
 *
 */
package com.corejava.constructor.examples;

/**
 * @author Nisum
 *
 */

class Student2 {
    int id;
    String name;
    int age;

    // creating two arg constructor
    Student2(int sid, String sname) {
        id = sid;
        name = sname;
    }

    // creating three arg constructor
    Student2(int sid1, String sname1, int sage1) {
        id = sid1;
        name = sname1;
        age = sage1;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Student2 stu1 = new Student2(111, "Karan");
        Student2 stu2 = new Student2(222, "Aryan", 25);
        stu1.display();
        stu2.display();
    }
}
