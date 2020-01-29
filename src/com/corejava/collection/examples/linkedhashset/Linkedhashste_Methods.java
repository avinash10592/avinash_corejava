package com.corejava.collection.examples.linkedhashset;

import com.corejava.util.MyLogger;

import java.util.LinkedHashSet;

public class Linkedhashste_Methods {

    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();

        for(int number=0;number<=9;number++) {
            lhs.add(number);
        }
        LinkedHashSet<Integer> lhs1 = new LinkedHashSet<Integer>();
        lhs1.add(1);
        lhs1.add(2);
        lhs1.add(3);
        lhs1.add(4);
        lhs1.add(5);
        // duplicates are not allowed
        lhs.add(1);
        // Remove() Method
        lhs.remove(3);
        // clone() Method
        MyLogger.consoleLogger.info("Clone() Method: " + lhs.clone());
        MyLogger.consoleLogger.info("contains() Method: " + lhs.contains(9));
        // System.out.println("removeAll() Method: "+lhs.removeAll(lhs));
        MyLogger.consoleLogger.info("hashCode() Method: " + lhs.hashCode());
        MyLogger.consoleLogger.info("size() Method: " + lhs.size());
        MyLogger.consoleLogger.info("retainAll() Method for lhs1: " + lhs.retainAll(lhs1));
        for (Integer object : lhs) {
            MyLogger.consoleLogger.info(object);
        }

    }
}


