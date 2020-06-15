package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min value is :"+ myMinFloatValue);
        System.out.println("Float Max value is :"+ myMaxFloatValue);

        float myMinDoubleValue = Float.MIN_VALUE;
        float myMaxDoubleValue = Float.MAX_VALUE;
        System.out.println("Float Min value is :"+ myMinDoubleValue);
        System.out.println("Float Max value is :"+ myMaxDoubleValue);

        int myIntegerValue = 5 / 2 ;
        float myFloatValue = 5f / 2f ;
        double myDoubleValue = 5d / 2d;

        System.out.println("My Integer Value =" + myIntegerValue);
        System.out.println("My Float Value =" + myFloatValue);
        System.out.println("My Double Value =" + myDoubleValue);

        double numberPounds = 200d;
        double convertKg = numberPounds * 0.45359237d;
        System.out.println("Converted Kilograms = " + convertKg);
    }
}
