package com.corejava.mysql.examples;

import com.corejava.util.MyLogger;
//Step 1: importing the package (java.sql.*)
import java.sql.*;

public class Student_Table {
    public static void main(String[] args)  throws Exception{

        String url = "jdbc:mysql://localhost:3306/database1";
        String uname = "root";
        String password = "Lakshmi@2";
        String query = "SELECT * FROM database1.employee_table where emp_id=103";

        //Step 2: loading and registering the driver
        //registering the driver with forName method
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Step 3: establishing the connection with interface "Connection"


        try {
            Connection con = DriverManager.getConnection(url, uname, password);

            //Step 4: creating the statement
            Statement st = con.createStatement();

            //Step 5: execute the query
            ResultSet rs = st.executeQuery(query);

            //Step 6:processing the results
            rs.next();
            String name = rs.getString("first name");
            int age = rs.getInt("age");
            String department = rs.getString("emp_department");
            MyLogger.consoleLogger.info(name);
            MyLogger.consoleLogger.info(age);
            MyLogger.consoleLogger.info(department);

            st.close();
            con.close();
        } catch (SQLException e) {
            MyLogger.consoleLogger.info(e);
        }
        //Step 7: close

    }
}
