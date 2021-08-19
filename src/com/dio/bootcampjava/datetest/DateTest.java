package com.dio.bootcampjava.datetest;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date dataNascimento = new Date(825257760000L);
        System.out.println(dataNascimento);
        System.out.println("Is after 2010/05/15?");
        System.out.println(dataNascimento.after(new Date(1273932960000L)));
    }
}
