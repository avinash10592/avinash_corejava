package com.corejava.inheritance.examples;

public class HybrideGrandfather {
    public void land() {
        System.out.println("GradFater's land");
    }

}

//Inherits feature of Grand father
class Father extends HybrideGrandfather {

    public void home() {
        System.out.println("Father's home");
    }

    public void Car() {
        System.out.println("Father's Car");
    }
}

//Inherits feature of Father
class Son extends Father {

    public void mobile() {
        System.out.println("Son's mobile");
    }
}

//Inherits feature of Father
class Daughter extends Father {

    public void purse() {
        System.out.println("Daughter's purse");
    }
}

//Main class
class TestHybridInheritance {

    public static void main(String[] args) {

        // Son object
        System.out.println("Son's properties:\n");
        Son son = new Son();
        son.land();// Grand father method
        son.Car(); // Father method
        son.home();// Father method
        son.mobile();// son method

        // Daughter object
        System.out.println("\nDaughter's Properties:\n");
        Daughter daughter = new Daughter();
        daughter.land();// Grand father method
        daughter.Car(); // Father method
        daughter.home();// Father method
        daughter.purse();// son method

    }

}
