package com.nisum.corejava.collection.examples.hashmap;

import java.util.*;

import com.nisum.corejava.util.MyLogger;

public class Hashmap_Methods {
    public static void main(String args[]) {
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        hashmap.put(100, "Amit");
        hashmap.put(101, "Vijay");
        hashmap.put(102, "Rahul");
        MyLogger.consoleLogger.info("Initial list of elements: "+hashmap.entrySet());

        hashmap.putIfAbsent(103, "Gaurav");
        MyLogger.consoleLogger.info("After invoking putIfAbsent() method "+hashmap.entrySet());

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(104, "Ravi");
        map.put(105, "Rohit");
        map.put(106, "Riyaz");
        map.put(107, "Avinash");
        map.replace(104,"Sundar");
        map.putAll(hashmap);
        MyLogger.consoleLogger.info("After invoking putAll() method "+map.entrySet());


        MyLogger.consoleLogger.info("Getting the value by key using get() method: "+map.get(107));


    }
}