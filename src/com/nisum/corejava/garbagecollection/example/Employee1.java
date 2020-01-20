package com.nisum.corejava.garbagecollection.example;

class Employee1 {


    private int ID;
    private String name;
    private int age;
    private static int nextId = 1;

    //it is made static because it
    // is keeping common among all and
    // shared by all objects
    public Employee1(String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }

    public void show() {
        System.out.println
                ("Id=" + ID + "\nName=" + name + "\nAge=" + age);
    }

    public void showNextId() {
        System.out.println
                ("Next employee id will be=" + nextId);
    }

    protected void finalize() {
        --nextId;
        //In this case,
        //gc will call finalize()
        //for 2 times for 2 objects.
    }
}

// it is closing brace of Employee class
class UseEmployee {
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1("Avinash", 27);
        Employee1 emp2 = new Employee1("Rohit", 24);
        Employee1 emp3 = new Employee1("Riyaz", 25);
        emp1.show();
        emp2.show();
        emp3.show();
        emp1.showNextId();
        emp2.showNextId();
        emp3.showNextId();

        {
            //It is sub block to keep
            // all those interns.
            Employee1 emp4 = new Employee1("Sundar", 43);
            Employee1 emp5 = new Employee1("Srinivas", 41);
            emp4.show();
            emp5.show();
            emp4.showNextId();
            emp5.showNextId();
            emp4 = emp5 = null;
            System.gc();
            System.runFinalization();
        }
        emp1.showNextId();
    }
}

