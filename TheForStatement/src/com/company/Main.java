package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println(calculateInterest(10000, 2));
//        for (int i = 2; i < 9; i++ ) {
//            System.out.println(calculateInterest(10000, i));
//        }
        int count = 0;
        for (int i=10; i<50;i++  ){
           if (isPrime(i)){
               count++;
               System.out.println("prime number " + i);
               if (count == 3) {
                   break;
               }
           }
        }

    }
    public static boolean isPrime (int n){
        if (n == 1){
            return false;
        }
        for (int i=2; i <=n/2; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static double calculateInterest (double amount, double interestRate){

        return (amount * ( interestRate / 100));
    }
}
