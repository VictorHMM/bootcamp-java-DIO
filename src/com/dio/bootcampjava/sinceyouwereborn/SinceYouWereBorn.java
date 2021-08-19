package com.dio.bootcampjava.sinceyouwereborn;

import java.time.LocalDateTime;
import java.util.Scanner;

public class SinceYouWereBorn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputDate, inputTime;
        int hour, minute, day, month, year;
        System.out.println("Please enter your date of birth (mmddyyyy)");
        inputDate = input.nextLine();
        day = Integer.parseInt(inputDate.substring(0, 1));
        month = Integer.parseInt(inputDate.substring(2, 3));
        year = Integer.parseInt(inputDate.substring(4, 7));
        System.out.println("Please enter the time of your birth (hhmm)");
        inputTime = input.nextLine();
        hour = Integer.parseInt(inputTime.substring(0, 1));
        minute = Integer.parseInt(inputTime.substring(2, 3));
        LocalDateTime dateTimeOfBirth = LocalDateTime.of(year, month, day, hour, minute);
        System.out.println(dateTimeOfBirth);


    }
}