package com.corejava.java8.Date_API;

import com.corejava.util.MyLogger;

import java.time.LocalDateTime;
import java.time.Month;

public class print_CertainDateTime {
    public static void main(String[] args) {
        LocalDateTime dateTime=LocalDateTime.of(1992, Month.MAY,10,12,43,1);
        MyLogger.consoleLogger.info(dateTime);
        MyLogger.consoleLogger.info("After 10 months: "+dateTime.plusMonths(10));
        MyLogger.consoleLogger.info("before 10 months: "+dateTime.minusMonths(10));
    }
}
