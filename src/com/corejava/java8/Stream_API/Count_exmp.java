package com.corejava.java8.Stream_API;

import com.corejava.util.MyLogger;

import java.util.ArrayList;
import java.util.List;


public class Count_exmp {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        for (int loop = 0; loop <= 40; loop++) {
            list1.add(loop);
        }
        //Stream<Integer> stream = list1.stream();
        Long evenNumberlist = list1.stream()
                .filter(num -> num % 2 == 0).count();
        MyLogger.consoleLogger.info(evenNumberlist);
    }
}


