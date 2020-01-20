package com.nisum.corejava.inheritance;

class MultiLevelAnimal {
    void eat() {
        System.out.println("eating..");
    }
}

// Inherits feature of Animal class
class Dogs extends MultiLevelAnimal {
    void bark() {
        System.out.println("barking...");
    }
}

// Inherits feature of Dog class
class Babydog extends Dogs {
    void weep() {
        System.out.println("weeping...");
    }
}

class Testinheratance2 {
    public static void main(String args[]) {
        // Creating a reference variable to Babydog.
        Babydog bd = new Babydog();
        bd.weep();
        bd.bark();
        bd.eat();

    }
}
