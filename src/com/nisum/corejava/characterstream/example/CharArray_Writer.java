package com.nisum.corejava.characterstream.example;


import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArray_Writer {
    public static void main(String args[]) throws Exception {
        CharArrayWriter out = new CharArrayWriter();
        out.write("Welcome to Nisum");
        FileWriter f1 = new FileWriter("C:\\Filehandling\\a.txt");
        out.writeTo(f1);
        f1.close();
        System.out.println("Success...");
    }
}

