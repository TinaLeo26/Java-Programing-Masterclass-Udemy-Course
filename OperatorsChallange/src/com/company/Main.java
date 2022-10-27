package com.company;

public class Main {

    public static void main(String[] args) {

        double firstValue = 20.00;
        double secondValue = 80.00;
        double totalValue = (firstValue + secondValue) * 100.00;
        System.out.println(totalValue);
        double remainderValue = totalValue % 40.00;
        System.out.println(remainderValue);
        boolean remainder = (remainderValue == 0) ? true : false ;
        System.out.println(remainder);
        if (!remainder){
            System.out.println("Got some remainder");
        }
    }
}
