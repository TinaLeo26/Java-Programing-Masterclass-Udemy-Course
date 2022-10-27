package com.company;

public class Main {

    public static void main(String[] args) {
//        int count = 0;
//        int sum = 0;
//        for (int i =1; i <= 1000; i++){
//            if ( (i % 3 == 0) && (i % 5 ==0)){
//                count++;
//                sum +=i;
//                System.out.println("Number found " + i);
//            }
//            if (count == 5){
//                break;
//            }
//        }
//        System.out.println("Sum = " + sum);
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100, 1000));

    }

    public static boolean isOdd (int number){
        if (number <= 0){
            return false;
        }else if ((number % 2 !=0) && (number > 0) ){
            return true;
        }
        return false;
    }
    public static int sumOdd(int start, int end){
        if (end< start || start < 0 || end <0){
            return -1;
        }
        int sum =0;
        for (int i = start; i<= end; i++){
            if (isOdd(i)){
                sum+=i;

            }
        }
       return sum;
    }


}
