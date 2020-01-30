package com.corejava.collection.examples.hashset;

import com.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset_Methods {

    public static void main(String[] args) {

        String []myArray = {"One", "Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        HashSet<String> hashset = new HashSet<String>(Arrays.asList(myArray));

       MyLogger.consoleLogger.info(hashset);

//        hashset.add("Two");
//        hashset.add("Three");
//        hashset.add("Four");
//        hashset.add("Five");
//        hashset.add("Six");
//        hashset.add("Seven");
//        hashset.add("Eight");
//        hashset.add("Nine");

        // duplicates are not allowed
        hashset.add("One");
        // Remove() Method
        hashset.remove("Three");
         //clone() Method
        MyLogger.consoleLogger.info("Clone() Method: " + hashset.clone());
        MyLogger.consoleLogger.info("contains() Method: " + hashset.contains("Nine"));
        // System.out.println("removeAll() Method: "+hashset.removeAll(hashset));
        MyLogger.consoleLogger.info("hashCode() Method: " + hashset.hashCode());
        MyLogger.consoleLogger.info("size() Method: " + hashset.size());
        MyLogger.consoleLogger.info("retainAll() Method: " + hashset.retainAll(hashset));
        // output shows that there is no insertion order preserved
        Iterator<String> itr = hashset.iterator();
        while (itr.hasNext()) {
            MyLogger.consoleLogger.info(itr.next());
        }
    }
}

