package com.nisum.corejava.comparable_comparator.examples;

import com.nisum.corejava.util.MyLogger;

import java.util.*;

public class Student_Comparator {
    int rollno;
    String name;
    int age;

    Student_Comparator(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

class AgeComparator implements Comparator<Student_Comparator> {
    public int compare(Student_Comparator s1, Student_Comparator s2) {
        if (s1.age == s2.age)
            return 0;
        else if (s1.age > s2.age)
            return 1;
        else
            return -1;
    }
}

class NameComparator implements Comparator<Student_Comparator> {
    public int compare(Student_Comparator s1, Student_Comparator s2) {
        return s1.name.compareTo(s2.name);
    }
}

class Simple {
    public static void main(String args[]) {

        ArrayList<Student_Comparator> al = new ArrayList<Student_Comparator>();
        al.add(new Student_Comparator(101, "Vijay", 23));
        al.add(new Student_Comparator(106, "Ajay", 27));
        al.add(new Student_Comparator(105, "Jai", 21));

        MyLogger.consoleLogger.info("Sorting by Name:");

        Collections.sort(al, new NameComparator());
        for (Student_Comparator st : al) {
            MyLogger.consoleLogger.info(st.rollno + " " + st.name + " " + st.age+"\n");
        }

        MyLogger.consoleLogger.info("Sorting by age:");

        Collections.sort(al, new AgeComparator());
        for (Student_Comparator st : al) {
            MyLogger.consoleLogger.info(st.rollno + " " + st.name + " " + st.age+"\n");
        }
    }
}