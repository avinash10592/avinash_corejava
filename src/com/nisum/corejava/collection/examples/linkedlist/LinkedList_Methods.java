package com.nisum.corejava.collection.examples.linkedlist;
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
        System.out.println("Clone of the Collection: "+name.clone());

        //getFirst() method
        System.out.println("Get first name of the collection: "+name.getFirst());

        //getLast() method
        System.out.println("Get last name of the Collection: "+name.getLast());

        //peekFirst() method
        System.out.println("Peek first String of the collection: "+name.peekFirst());

        //peekLast() method
        System.out.println("Peek last String of the collection: "+name.peekLast());
        //indexOf() method
        System.out.println("Index number of Anuj: "+name.indexOf("Anuj"));
        //size() method
        System.out.println("Size of the list: "+name.size());

        for(String obj:name)
            System.out.println(obj);
    }
}
