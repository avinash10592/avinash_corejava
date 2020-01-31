package com.corejava.java8.Date_API;

import com.corejava.util.MyLogger;

import java.time.LocalDate;
import java.time.LocalTime;

public class PrintToday_Date_Time {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        MyLogger.consoleLogger.info(date);

        LocalTime time = LocalTime.now();
        MyLogger.consoleLogger.info(time);
    }
}
