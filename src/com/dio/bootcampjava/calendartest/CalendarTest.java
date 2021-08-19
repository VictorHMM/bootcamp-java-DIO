package com.dio.bootcampjava.calendartest;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calendar dueDate = Calendar.getInstance();
        System.out.println("Please, inform the month (mm)");
        dueDate.set(Calendar.MONTH, input.nextInt());
        System.out.println("Please, inform the day (dd)");
        dueDate.set(Calendar.DATE, input.nextInt());
        System.out.println("Please, inform the year (yyyy)");
        dueDate.set(Calendar.YEAR, input.nextInt());
        dueDate = correctDueDateForWeekend(dueDate);
        dueDate.add(Calendar.DATE, 10);
        System.out.printf("You can pay your bill until %d/%d/%d", dueDate.get(Calendar.MONTH), dueDate.get(Calendar.DATE), dueDate.get(Calendar.YEAR));
    }
    private static Calendar correctDueDateForWeekend(Calendar dueDate)
    {
        if(dueDate.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
            dueDate.add(Calendar.DATE, 2);
        else if(dueDate.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
            dueDate.add(Calendar.DATE, 1);
        return dueDate;
    }









}
