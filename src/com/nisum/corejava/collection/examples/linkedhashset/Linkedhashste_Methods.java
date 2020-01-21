package com.nisum.corejava.collection.examples.linkedhashset;

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
        System.out.println("Clone() Method: " + lhs.clone());
        System.out.println("contains() Method: " + lhs.contains(9));
        // System.out.println("removeAll() Method: "+lhs.removeAll(lhs));
        System.out.println("hashCode() Method: " + lhs.hashCode());
        System.out.println("size() Method: " + lhs.size());
        System.out.println("retainAll() Method for lhs1: " + lhs.retainAll(lhs1));
        for (Integer object : lhs) {
            System.out.println(object);
        }

    }
}


