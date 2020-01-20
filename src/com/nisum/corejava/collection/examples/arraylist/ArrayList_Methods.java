package com.nisum.corejava.collection.examples.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Nisum
 */
class ArrayList_Methods {
    public static void main(String args[]) {
        // Creating arraylist
        ArrayList<Integer> value = new ArrayList<Integer>();
        // Adding object in arraylist
        value.add(2);
        value.add(66);
        value.add(88);
        value.add(99);
        value.add(10);
        value.add(50);
        value.add(90);
        value.add(99);
        // Removing objects in arraylist
        value.remove(2);
        value.remove(5);
        Collections.sort(value);
        // get() method
        System.out.println("get value: " + value.get(0));
        System.out.println("get value: " + value.get(3));
        //size() method
        System.out.println("Size of collection: " + value.size());
        //contains() method
        System.out.println("Contains the value: " + value.contains(99));
        // indexof() method
        System.out.println("Index value: " + value.indexOf(66));
        //lastindexof() method
        System.out.println("Lastindex value: "+value.lastIndexOf(99));
        // Stream API...Lamda Expression forEach
        // value.forEach(System.out::println);
        // Traversing list through for-each loop
        for (int obj : value)
            System.out.println(obj);
    }
}
