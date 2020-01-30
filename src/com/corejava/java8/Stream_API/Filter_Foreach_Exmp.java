package com.corejava.java8.Stream_API;

import com.corejava.util.MyLogger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Filter_Foreach_Exmp {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        for (int loop = 0; loop <= 40; loop++) {
            list1.add(loop);
        }
        //Stream<Integer> stream = list1.stream();
        List<Integer> evenNumberlist = list1.stream()
                .filter(num -> num % 2 == 0).collect(Collectors.toList());
        evenNumberlist.forEach(numbers -> MyLogger.consoleLogger.info(numbers));
    }
}
