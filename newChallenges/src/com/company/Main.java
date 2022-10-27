package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(10));

    }
    public static boolean isPerfectNumber (int number){
        if (number<1){
            return false;
        }
        int sum =0;
        for (int i=1; i<number; i++){
            if (number%i==0){
                sum+=i;
            }

            if (sum == number){
                return true;
            }
        }
        return false;

    }

    public static void printFactors (int number){
        if (number < 1){
            System.out.println("Invalid Value");
        }
        for (int i=1; i<=number; i++){
            if (number%i==0){
                System.out.println(i);
            }
        }
    }




    public static boolean isValid (int x){
        if (x >= 10 && x<= 1000){
            return true;
        }
        return false;
    }

    public static boolean hasSameLastDigit (int x, int y, int z){
        if (!isValid(x) || !isValid(y) || !isValid(z)){
            return false;
        }else if (x%10 == y%10 || x%10 == z%10 || y%10 == z%10){
            return true;
        }
        return false;
    }

    public static boolean hasSharedDigit (int x, int y){
        if (((x < 10) && (x > 99)) || ((y < 10) && (y > 99))){
            return false;
        }else if (x%10 == y%10 || x/10 == y/ 10 || x/10 == y%10){
            return true;
        }
        return false;

    }

    public static int getEvenDigitSum (int number){
        if (number <0) {
            return -1;
        }
        int sum = 0;
        while (number >0){
           if (number % 2 ==0){
               sum += number%10;
           }
           number/=10;
        }
        return sum;
    }

    public static int sumFirstAndLast  ( int number){
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int lastDigit = number % 10;
        int firstDigit = number;
        while (firstDigit >=10 ){
            firstDigit /=10;
        }
        sum = lastDigit + firstDigit;
        return sum;
    }


    public static boolean isPalindrome (int number){
        int reverse = 0;
        int lastDigit ;
        int num = number;
        while (num !=0){
            lastDigit = 0;
            lastDigit = num % 10;
           reverse *=10;
           reverse+=lastDigit;
           num/=10;
        }

        if (number == reverse){
            return true;
        }
        return false;
    }
}
