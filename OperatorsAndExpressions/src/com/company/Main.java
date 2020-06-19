package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 3;
        System.out.println("1 +2 =" + result);
        int previousResult = result;
        System.out.println("Previous Result = " + previousResult);
        result = result - 1 ;
        System.out.println("3 - 1" + result);

        boolean isAlien = false;
        if(isAlien  == false ) {
            System.out.println("Is is not a Alien!");
        }

        double variable1 = 20.00d;
        double variable2 = 80.00d;

        double variableTotal = (variable1 + variable2) * 100.00d;
        System.out.println("Values total is :" + variableTotal);
        double theRemainder = variableTotal % 40.00d;
        System.out.println("The remainder is :" + theRemainder);

        boolean isNoRemainder = (theRemainder == 0)? true : false;
        System.out.println("isNoRemainder =" + isNoRemainder);

        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }
    }
}
