package com.nisum.corejava.collection.examples.arraylist;

import com.nisum.corejava.util.MyLogger;

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
        value.add(101);
        // Removing objects in arraylist
        value.remove(2);
        value.remove(5);
        Collections.sort(value);
        // get() method
        MyLogger.consoleLogger.info("get value: " + value.get(0));
        MyLogger.consoleLogger.info("get value: " + value.get(3));
        //size() method
        MyLogger.consoleLogger.info("Size of collection: " + value.size());
        //contains() method
        MyLogger.consoleLogger.info("Contains the value: " + value.contains(99));
        // indexof() method
        MyLogger.consoleLogger.info("Index value: " + value.indexOf(66));
        //lastindexof() method
        MyLogger.consoleLogger.info("Lastindex value: "+value.lastIndexOf(99));
        // Stream API...Lamda Expression forEach
        // value.forEach(System.out::println);
        // Traversing list through for-each loop
        for (int obj : value)
            //System.out.println(obj);

        MyLogger.consoleLogger.info(obj);
        MyLogger.consoleLogger.info("Checking loggers config...");


    }
}
