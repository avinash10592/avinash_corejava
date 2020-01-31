package com.corejava.java8.Date_API;

import com.corejava.util.MyLogger;

import java.time.LocalDateTime;

public class Print_DateTime {
    public static void main(String[] args) {
        LocalDateTime datetime = LocalDateTime.now();

        int day = datetime.getDayOfMonth();
        int month = datetime.getMonthValue();
        int year = datetime.getYear();
        MyLogger.consoleLogger.info("Date: " + month + "-" + day + "-" + year);

        int hours = datetime.getHour();
        int min = datetime.getMinute();
        int sec = datetime.getSecond();
        int nsec = datetime.getSecond();
        MyLogger.consoleLogger.info("Time: " + hours + ":" + min + ":" + sec + ":" + nsec);
    }
}
