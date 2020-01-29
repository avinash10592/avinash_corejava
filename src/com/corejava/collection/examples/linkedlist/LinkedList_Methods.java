package com.corejava.collection.examples.linkedlist;
import com.corejava.util.MyLogger;

import java.util.*;
public class LinkedList_Methods {
    public static void main(String args[]){
        // Creating Linkedlist
        LinkedList<String> name=new LinkedList<String>();
        name.add("Ravi");
        name.add("Vijay");
        name.add("Ajay");
        name.add("Anuj");
        name.add("Gaurav");
        name.add("Harsh");
        //Adding Second list elements to the first list
        LinkedList<String>name2=new LinkedList<String>();
        name2.add("John");
        name2.add("Rahul");
        name.addAll(name2);

        LinkedList<String> name3=new LinkedList<String>();
        name3.add("Rakesh");
        name3.add("Dhruva");
        //Adding third list elements to the first list at specific position
        name.addAll(1, name3);

        //addFirst() method
        name.addFirst("Avinash");

        //addLast() method
        name.addLast("Rohit");

        //add with specific index number
        name.add(4,"Riyaz");

        //clone() method
        MyLogger.consoleLogger.info("Clone of the Collection: "+name.clone());

        //getFirst() method
        MyLogger.consoleLogger.info("Get first name of the collection: "+name.getFirst());

        //getLast() method
        MyLogger.consoleLogger.info("Get last name of the Collection: "+name.getLast());

        //peekFirst() method
        MyLogger.consoleLogger.info("Peek first String of the collection: "+name.peekFirst());

        //peekLast() method
        MyLogger.consoleLogger.info("Peek last String of the collection: "+name.peekLast());
        //indexOf() method
        MyLogger.consoleLogger.info("Index number of Anuj: "+name.indexOf("Anuj"));
        //size() method
        MyLogger.consoleLogger.info("Size of the list: "+name.size());

        for(String obj:name)
            MyLogger.consoleLogger.info(obj);
    }
}
