package com.java.data;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Geek {

    // Function to check date and time
    // according to our requirement
    public static void checkingAdjusters() {

        LocalDate date = LocalDate.now();
        System.out.println("the current date is " + date);
        System.out.println("***************************************************************************************");


        // to get the first day of next month
        LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());

        System.out.println("firstDayOfNextMonth : " + dayOfNextMonth);
        System.out.println("***************************************************************************************");


        // get the next saturday
        LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));

        System.out.println("next saturday from now is " + nextSaturday);
        System.out.println("***************************************************************************************");


        // first day of current month
        LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());

        System.out.println("firstDayOfMonth : " + firstDay);
        System.out.println("***************************************************************************************");


        // last day of current month
        LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println("lastDayOfMonth : " + lastDay);
        System.out.println("***************************************************************************************");


    }


    public static void main(String[] args) {
        checkingAdjusters();
    }


}



