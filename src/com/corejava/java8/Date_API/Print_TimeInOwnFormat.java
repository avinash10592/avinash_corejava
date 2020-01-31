package com.corejava.java8.Date_API;

import com.corejava.util.MyLogger;

import java.time.LocalTime;

public class Print_TimeInOwnFormat {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        MyLogger.consoleLogger.info(time);

        int hour=time.getHour();
        int min=time.getMinute();
        int sec=time.getSecond();
        int nsec=time.getNano();

        MyLogger.consoleLogger.info("Printing time in our own format: "+nsec+":"+sec+":"+min+":"+hour);
    }
}
