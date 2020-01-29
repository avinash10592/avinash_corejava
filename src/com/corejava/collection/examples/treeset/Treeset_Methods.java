package com.corejava.collection.examples.treeset;

import com.corejava.util.MyLogger;

import java.util.*;

public class Treeset_Methods {
    public static void main(String args[]) {
        TreeSet<Integer> set1 = new TreeSet<Integer>();
        set1.add(24);
        set1.add(66);
        set1.add(12);
        set1.add(55);
        set1.add(43);
        set1.add(15);
        TreeSet<Integer> set2 = new TreeSet<Integer>();
        set2.add(23);
        set2.add(57);
        set2.add(99);
        set2.add(121);
        set2.add(124);
        set2.add(224);
        set1.addAll(set2);
        MyLogger.consoleLogger.info("poolFirst number from the set:  " + set1.pollFirst());
        MyLogger.consoleLogger.info("poolLast number from the set:  " + set1.pollLast());
        MyLogger.consoleLogger.info("headSet from the number 57 :  " + set1.headSet(57));
        MyLogger.consoleLogger.info("tailSet from the number 99:  " + set1.tailSet(99));
        MyLogger.consoleLogger.info("subSet fro the numbers 43&99:  " + set1.subSet(43, 99));
        MyLogger.consoleLogger.info("first number from the set:  " + set1.first());
        MyLogger.consoleLogger.info("last number from the set:  " + set1.last());
        Iterator obj = set1.iterator();
        while (obj.hasNext()) {
            MyLogger.consoleLogger.info(obj.next());
        }

    }
}