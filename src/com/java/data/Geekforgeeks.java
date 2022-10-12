package com.java.data;

import java.time.*;

public class Geekforgeeks {

    public static void checkingPeriod() {

        LocalDate date1 = LocalDate.now();

        LocalDate date2 = LocalDate.of(2014, Month.DECEMBER, 12);

        Period gap = Period.between(date2, date1);
        System.out.println("gap between dates " + "is a period of " + gap);

        System.out.println("***************************************************************************************");
    }


    // Function to check duration

    public static void checkingDuration() {

        LocalTime time1 = LocalTime.now();
        System.out.println("the current time is " + time1);
        System.out.println("***************************************************************************************");

        Duration fiveHours = Duration.ofHours(5);

        // adding five hours to the current
        // time and storing it in time2
        LocalTime time2 = time1.plus(fiveHours);

        System.out.println("after adding five hours " + "of duration " + time2);
        System.out.println("***************************************************************************************");


        Duration gap = Duration.between(time2, time1);
        System.out.println("duration gap between time1" + " & time2 is " + gap);
        System.out.println("***************************************************************************************");


    }


    public static void main(String[] args) {
        checkingPeriod();
        checkingDuration();
    }
}
