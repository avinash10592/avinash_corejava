package com.corejava.filehandling.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilecopyDemo {
    public static void main(String[] args)throws FileNotFoundException, IOException {
        FileInputStream fis=new FileInputStream("C:\\Filehandling\\file_A.txt");
        FileOutputStream fos=new FileOutputStream("C:\\Filehandling\\file_B.txt");
        int data=0;
        while ((data=fis.read())!=-1){
            fos.write(data);
        }
        System.out.println("File copied");
        fis.close();
        fos.close();
    }
}
