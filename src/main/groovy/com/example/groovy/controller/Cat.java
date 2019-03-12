package com.example.groovy.controller;

import java.math.BigInteger;

public class Cat {


    public static void main(String[] args) {


        long t1 = System.currentTimeMillis();

        BigInteger result = new BigInteger("1");

        for (int i = 1; i < 10001; i++) {
            result = result.multiply(new BigInteger(Integer.toString(i)));
        }

        long t2 = System.currentTimeMillis();

        System.out.println(t2 - t1);

        System.out.println(result);

    }
}
