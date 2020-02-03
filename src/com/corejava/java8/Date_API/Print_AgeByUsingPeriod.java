package com.corejava.java8.Date_API;

import com.corejava.util.MyLogger;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Print_AgeByUsingPeriod {
    public static void main(String[] args) {
        LocalDate birthday=LocalDate.of(1992,05,10);
        LocalDate today=LocalDate.of(2020,01,31);
        Period age=Period.between(birthday,today);
        System.out.printf("your age is %d years %d months %d days",age.getYears(),age.getMonths(),age.getDays());

//      Duration class
        LocalTime time1 = LocalTime.now();
        Duration fiveHours =Duration.ofHours(5);
        LocalTime time2 = time1.plus(fiveHours);
        Duration timeGap = Duration.between(time1,time2);
        MyLogger.consoleLogger.info("Time Gap " +timeGap);

    }
}
