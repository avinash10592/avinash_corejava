package com.corejava.characterstream.example;


import java.io.FileReader;

public class File_Reader {
    public static void main(String args[]) throws Exception {
        FileReader f1 = new FileReader("C:\\Filehandling\\a.txt");
        int data;
        // Read until the end of a file
        while ((data = f1.read()) != -1) {
            System.out.print((char) data);
        }
    }
}
