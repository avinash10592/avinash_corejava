package com.nisum.corejava.customclassaskeyinmap.example;
import java.io.*;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hashmapusing_CustomclassDemo  {
    public static void main(String[] args) {
        Map<Integer, Student> map = new LinkedHashMap<Integer, Student>(10, 0.75f);
        Student stu1 = new Student(10, "Avinash","CSE");
        Student stu2 = new Student(20, "Manju","EIE");
        Student stu3 = new Student(30, "Rohit","ECE");
        Student stu4 = new Student(40, "Sankeerth","Civil");
        Student stu5 = new Student(50, "Akash","Mech");
        Student stu6 = new Student(60, "Riyaz","CSE");
        Student stu7 = new Student(70, "Sundar","EIE");
        Student stu8 = new Student(80, "Sairam","ECE");
        Student stu9 = new Student(90, "Kalyan","Civil");

        map.put(stu1.getRollNumber(), stu1);
        map.put(stu2.getRollNumber(), stu2);
        map.put(stu3.getRollNumber(), stu3);
        map.put(stu4.getRollNumber(), stu4);
        map.put(stu5.getRollNumber(), stu5);
        map.put(stu6.getRollNumber(), stu6);
        map.put(stu7.getRollNumber(), stu7);
        map.put(stu8.getRollNumber(), stu8);
        map.put(stu9.getRollNumber(), stu9);

        Iterator<Integer> iterator=map.keySet().iterator();
        while(iterator.hasNext()){
            Student stu = map.get(iterator.next());
           stu.display();
        }
    }
}
