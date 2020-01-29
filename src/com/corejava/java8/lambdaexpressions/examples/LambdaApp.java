package com.corejava.java8.lambdaexpressions.examples;

import com.corejava.util.MyLogger;

@FunctionalInterface
interface Cab { // when an Interface will have only one Abstract method we can say it as Functional Interface
    //void bookCab();//By Abstract method
    //void bookCab(String source, String destination);//By Abstract method
    double bookCab(String source, String destination);//By Abstract method
}
//class Uber_X implements Cab {
//    public void bookCab(){
//       System.out.println("Uber_X Booked!!Arriving Soon!!");
//    }
//}

public class LambdaApp {

    //Static variable
    static int staticvar =120;

    public static void main(String[] args) {

        // 1.
        // Polymorphic Statement.
        //Cab cab =new Uber_X();
        //cab.bookCab();

        // 2.
        // Anonymous class Implementation.
        /*Cab cab =new Cab(){
            @Override
            public void bookCab() {
                System.out.println("Uber_X Booked!!Arriving Soon!!");
            }
        };
        cab.bookCab();*/

        // 3.
        // Using Lambda Expression.
        Cab cab =(source,destination)->{
            int localVar=1000;
           MyLogger.consoleLogger.info("Uber_X Booked from "+source+" to "+destination+" !!Arriving Soon!!");
            MyLogger.consoleLogger.info("Static variable is: "+LambdaApp.staticvar);
            MyLogger.consoleLogger.info("local variable is: "+localVar);
            return 400.54;
        };
        double fare=cab.bookCab("Hyderabad","Nizambad");
        MyLogger.consoleLogger.info("Fare shall be: "+fare);

    }
}
