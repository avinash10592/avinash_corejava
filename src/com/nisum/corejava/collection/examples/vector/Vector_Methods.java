package com.nisum.corejava.collection.examples.vector;

import com.nisum.corejava.util.MyLogger;

import java.util.*;

public class Vector_Methods {


    public static void main(String args[]) {
        /* Vector of initial capacity(size) of 2 */
        Vector<String> vec = new Vector<String>(2);

        /* Adding elements to a vector*/
        vec.addElement("Apple");
        vec.addElement("Orange");
        vec.addElement("Mango");
        vec.addElement("Fig");

        /* check size and capacityIncrement*/
        MyLogger.consoleLogger.info("Size is: " + vec.size());
        MyLogger.consoleLogger.info("Default capacity increment is: " + vec.capacity());

        vec.addElement("fruit1");
        vec.addElement("fruit2");
        vec.addElement("fruit3");

        /*size and capacityIncrement after two insertions*/
        MyLogger.consoleLogger.info("Size after addition: " + vec.size());
        MyLogger.consoleLogger.info("Capacity after increment is: " + vec.capacity());

        /*Display Vector elements*/
        Enumeration en = vec.elements();
        MyLogger.consoleLogger.info("\nElements are:");
        while (en.hasMoreElements())
            MyLogger.consoleLogger.info(en.nextElement() + " ");
    }
}

