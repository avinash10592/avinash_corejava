package com.corejava.java8.Date_API;

import com.corejava.util.MyLogger;

import java.time.LocalDate;
import java.time.Period;

public class Print_AgeByUsingPeriod {
    public static void main(String[] args) {
        LocalDate bithday=LocalDate.of(1992,05,10);
        LocalDate today=LocalDate.of(2020,01,31);
        Period age=Period.between(bithday,today);
        System.out.printf("your age is %d years %d months %d days",age.getYears(),age.getMonths(),age.getDays());
    }
}
