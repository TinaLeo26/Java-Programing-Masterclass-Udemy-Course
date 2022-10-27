package com.company;

public class Main {

    public static void main(String[] args) {
//
//        int count = 0;
//        while (count != 5){
//            System.out.println("Count value is " + count);
//            count++;
//        }

        int number = 4;
        int finisNumber = 20;
        int evenNumberFound = 0;
        while (number <= finisNumber){
            number++;

            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println(" Even number " + number);
            evenNumberFound++;
           if (evenNumberFound >= 5){
               break;
           }
        }
        System.out.println("Total even number found " + evenNumberFound);



    }
    public static boolean isEvenNumber (int number){
        if (number % 2 ==0){
            return true;
        }
        return false;
    }
}
