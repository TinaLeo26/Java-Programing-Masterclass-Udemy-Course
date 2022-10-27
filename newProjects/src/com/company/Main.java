package com.company;

public class Main {

    public static void main(String[] args) {

    }
    public static double area (double radius){
        if( radius < 0 ){
            return -1;
        }
        return radius*radius *Math.PI ;
    }
    public static double area (double x, double y){
        if (x < 0 || y < 0){
            return -1;
        }
        return x * y;
    }

    public static void printYearsAndDays (long minutes){
        if ( minutes < 0){
            System.out.println("Invalid Value");
        }
        long hour = minutes / 60;
        long day = hour / 24;
        long year = day / 365;
        System.out.println(minutes + " min = " + year + "y and " + day + "d");
    }

    public static void printEqual (int x, int y, int z){
        if (x < 0 || y < 0 || z < 0){
            System.out.println("Invalid Value");
        }else if ((x == y) && (x == z) && (y == z)){
            System.out.println("All numbers are equal");
        }else if ((x != y) &&( x != z) && (z != y)){
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
    }
    public static boolean isCatPlaying (boolean summer, int temperature) {
        if ((!summer) && (temperature >= 25 && temperature <= 35)){
            return true;
        }else if ((summer) && (temperature >= 25 && temperature <= 45)){
            return true;
        }
        return false;
    }
}
