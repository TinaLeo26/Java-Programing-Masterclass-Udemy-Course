package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(-10,5));
        System.out.println(calcFeetAndInchesToCentimeters(157));
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches){
        if (feet >= 0 && inches >= 0 && inches <= 12){
            double totalInches = (feet * 12) + inches ;
            double centimeters = totalInches * 2.54;
            return centimeters;
        }
        return -1;
    }
    public static double calcFeetAndInchesToCentimeters (double inches){
        if ( inches < 0){
            return  -1 ;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int)inches % 12;
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
