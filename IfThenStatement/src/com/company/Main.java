package com.company;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("Is not an alien");
        }

        int topScore = 80;
        if (topScore != 100){
            System.out.println("You got the high score");
        }
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than top score");
        }
        if ((topScore > 90) || (topScore < 100)){
            System.out.println("either both or one are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("this is an error");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("this is not supposed to happen");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false ;
        if (wasCar){
            System.out.println("wasCar is true");
        }

        
    }
}
