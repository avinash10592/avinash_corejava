package com.nisum.corejava.serialization_deserialization.examples;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        EmployeeDemo emp = new EmployeeDemo();
        emp.emp_Name = "Avinash";
        emp.Address = "Nallakunta";
        emp.emp_Id = 17014;
        emp.phone_num = 630241295;
        emp.emp_Adhar = 456 - 567 - 321;
        try {
            FileOutputStream fileOut = new FileOutputStream("C:\\Filehandling\\Serialize Demo.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();

            fileOut.close();
            System.out.println("Serialized data is saved in C:\\Filehandling\\Serialize Demo.txt");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}



