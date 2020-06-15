package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        System.out.println("Integer MIN value =" + myMinValue);
        System.out.println("Integer MAX value =" + myMaxValue);
        System.out.println("Busted MAX value " + (myMinValue + 1));
        System.out.println("Busted MIN value " + (myMaxValue - 1));

        int myTotal = (myMinValue / 2);

        byte myNewByteValue =(byte)(myMinValue / 2);

        short myNewShortValue = (short)(myMinValue / 2);
    }
}
