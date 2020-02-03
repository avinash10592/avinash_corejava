package com.corejava.mysql.examples;

import com.corejava.util.MyLogger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student_Table {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/database1";
        String uname = "root";
        String password = "Lakshmi@2";
        String query = "SELECT * FROM database1.employee_table where emp_id=103";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        rs.next();
        String name = rs.getString("first name");
        int age = rs.getInt("age");
        String department = rs.getString("emp_department");
        MyLogger.consoleLogger.info(name);
        MyLogger.consoleLogger.info(age);
        MyLogger.consoleLogger.info(department);
    }
}
