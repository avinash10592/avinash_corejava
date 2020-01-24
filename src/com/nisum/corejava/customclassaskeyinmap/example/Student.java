package com.nisum.corejava.customclassaskeyinmap.example;

public class Student {
    private int stu_rollNumber;
    private String stu_name;
    private String stu_branch;

    public Student(int rollNumber, String name,String branch) {
        this.stu_rollNumber = rollNumber;
        this.stu_name = name;
        this.stu_branch = branch;
    }

    public int getRollNumber() {
        return stu_rollNumber;
    }

    public String getStu_branch() {
        return stu_branch;
    }

    public void setRollNumber(int rollNumber) {
        this.stu_rollNumber = rollNumber;
    }

    public String getName() {
        return stu_name;
    }

    public void setStu_section(String stu_branch) {
        this.stu_branch = stu_branch;
    }

    public void setName(String name) {
        this.stu_name = name;
    }
    public void display(){
        System.out.println("Rollnumber: "+getRollNumber()+" Name: "+getName()+" Branch: " + getStu_branch());
    }
}
