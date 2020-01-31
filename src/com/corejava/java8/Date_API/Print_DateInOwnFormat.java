package com.corejava.java8.Date_API;

import com.corejava.util.MyLogger;

import java.time.LocalDate;

public class Print_DateInOwnFormat {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        MyLogger.consoleLogger.info(date);

        int day=date.getDayOfMonth();
        int month=date.getMonthValue();
        int year=date.getYear();

        MyLogger.consoleLogger.info("Printing date in our own format: "+month+"-"+day+"-"+year);

    }
}