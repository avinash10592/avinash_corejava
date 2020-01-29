package com.corejava.inheritance.examples;



public class HierarchicalAnimal {
    void eat() {
        System.out.println("eating...");
    }
}

//Inherits feature of Animal class.
class Dog1 extends HierarchicalAnimal {
    void bark() {
        System.out.println("barking...");
    }
}

//Inherits feature of Animal class.
class Cat1 extends HierarchicalAnimal {
    void meow() {
        System.out.println("meowing...");
    }
}

//Main method
class TestInheritance3 {
    public static void main(String args[]) {

        // Referance variable for Cat class.
        Cat1 cat = new Cat1();
        System.out.println("Cat1 activities:");
        cat.meow();
        cat.eat();
        // Referance variable for dog class.
        Dog1 dog = new Dog1();
        System.out.println("\nDog1 activities:");
        dog.bark();
        dog.eat();

    }
}
