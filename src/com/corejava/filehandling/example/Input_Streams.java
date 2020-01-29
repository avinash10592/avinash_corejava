package com.corejava.filehandling.example;

import java.io.*;

public class Input_Streams {
    public static void main(String[] args) throws FileNotFoundException,IOException {
         FileInputStream fis = new FileInputStream("C:\\Filehandling\\testout.txt");
         int data=0;
         while((data=fis.read())!=-1){
             System.out.println("data: "+data+" "+(char)data);
         }

        }
    }
