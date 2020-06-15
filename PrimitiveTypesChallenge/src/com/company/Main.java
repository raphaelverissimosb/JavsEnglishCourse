package com.company;

public class Main {

    public static void main(String[] args) {

        byte varByte = 5;
        short varShort = 1500;
        long varLong = 50000L + 10L +(varByte + varShort);
        System.out.println("The sum is :" + varLong);

    }
}
