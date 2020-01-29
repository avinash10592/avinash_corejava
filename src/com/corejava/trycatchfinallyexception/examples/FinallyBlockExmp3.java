package com.corejava.trycatchfinallyexception.examples;

public class FinallyBlockExmp3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            int data = 30 / 0;
            System.out.println(data);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally Block is always Executed");
        }
        System.out.println("Rest of the code");

    }
}
