package com.nisum.corejava.inheritance;

public class MultiLevelShape {
    public void display() {
        System.out.println("Inside shape display");
    }
}

//Inherits feature of Shape class.
class Rectangles extends MultiLevelShape {
    public void area() {
        System.out.println("Inside area");
    }
}

//Inherits feature of Rectangle class.
class Cube extends Rectangles {
    public void volume() {
        System.out.println("Inside volume");
    }
}

//Main method
class Tester {
    public static void main(String[] arguments) {
        // Creating Referance variable cube.
        Cube cube = new Cube();
        cube.display();
        cube.area();
        cube.volume();
    }
}
