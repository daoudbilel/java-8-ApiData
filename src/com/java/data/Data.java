package com.java.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Data {

    public static void LocalDataTimeApi() {

        //the current date
        LocalDate date = LocalDate.now();
        System.out.println("the current date is " + date);

        System.out.println("***************************************************************************************");
        // the current time
        LocalTime time = LocalTime.now();
        System.out.println("the current time is " + time);

        System.out.println("***************************************************************************************");
        // will give us the current time and date
        LocalDateTime current = LocalDateTime.now();
        System.out.println("current date and time : " + current);
        System.out.println("***************************************************************************************");

        // to print in a particular format
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatedDateTime = current.format(format);
        System.out.println("in formatted manner " + formatedDateTime);
        System.out.println("***************************************************************************************");

        // printing some specified date
        LocalDate date2 = LocalDate.of(1950, 1, 26);
        System.out.println("the republic day :" + date2);
        System.out.println("***************************************************************************************");

        // printing date with current time.
        LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016);
        System.out.println("specific date with " + "current time : " + specificDate);
        System.out.println("***************************************************************************************");

    }


    public static void main(String[] args) {
        LocalDataTimeApi();
    }
}



