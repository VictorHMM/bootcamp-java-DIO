package com.dio.bootcampjava.iteratortest;

import java.util.stream.IntStream;

public class IteratorTest {
    public static void main(String[] args) {
        IntStream.rangeClosed(5, 10).forEach(n -> {
            System.out.println(n);
        });
    }
}
