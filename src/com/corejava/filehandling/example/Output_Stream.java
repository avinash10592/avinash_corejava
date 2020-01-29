package com.corejava.filehandling.example;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Output_Stream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Filehandling\\testout1.txt");
        fos.write(97);
        System.out.println("data is saved");
    }
}
