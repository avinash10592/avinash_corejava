package com.corejava.serialization_deserialization.examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {
    public static void main(String[] args) {
        EmployeeDemo emp = null;
        try {
            FileInputStream fileIn = new FileInputStream("C:\\Filehandling\\Serialize Demo.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            emp = (EmployeeDemo) in.readObject();
            in.close();

        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + emp.emp_Name);
        System.out.println("Emp_ID: " + emp.emp_Id);
        System.out.println("Address: " + emp.Address);
        System.out.println("Adhar: " + emp.emp_Adhar);
        System.out.println("Number: " + emp.phone_num);
    }
}



