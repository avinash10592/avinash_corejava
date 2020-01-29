package com.corejava.comparable_comparator.examples;

import com.corejava.util.MyLogger;

import java.util.*;

class Student_Comparable implements Comparable<Student_Comparable> {
    int rollno;
    String name;
    int age;

    Student_Comparable(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student_Comparable stu) {
        if (age == stu.age)
            return 0;
        else if (age > stu.age)
            return 1;
        else
            return -1;
    }
}

class Demo {
    public static void main(String args[]) {
        ArrayList<Student_Comparable> arrlst = new ArrayList<Student_Comparable>();
        arrlst.add(new Student_Comparable(101, "Vijay", 23));
        arrlst.add(new Student_Comparable(106, "Ajay", 27));
        arrlst.add(new Student_Comparable(105, "Jai", 21));

        Collections.sort(arrlst);
        for (Student_Comparable stu : arrlst) {
            MyLogger.consoleLogger.info(stu.rollno + " " + stu.name + " " + stu.age);
        }
    }
}