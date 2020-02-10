package com.corejava.Test;

import com.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test_Demo2 {

    public static void main(String[] args) {
        List<Integer> value = Arrays.asList(22, 33, 55, 44, 66, 77, 88, 99);
        List<Integer> decending = value.stream()
                .sorted((num1, num2) -> -num1.compareTo(num2)).collect(Collectors.toList());
         MyLogger.consoleLogger.info(decending);
    }
}
