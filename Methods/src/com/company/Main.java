package com.company;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

//        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("David",calculateHighScorePosition(1500) ) ;
//        position = calculateHighScorePosition(900);
        displayHighScorePosition("Tobias", calculateHighScorePosition(900));
        displayHighScorePosition("Vasi", calculateHighScorePosition(400));
        displayHighScorePosition("Tina", calculateHighScorePosition(50));


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver ){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition (String name, int position ){
        System.out.println(name + " managed to get into position "
                + position +  " on the high score table ");
    }
    public static int calculateHighScorePosition (int playerScore){
        if (playerScore > 1000){
            return 1;
        }else if (playerScore < 1000 && playerScore > 500){
            return 2;
        }else if (playerScore < 500 && playerScore > 100){
            return 3;
        }
        return 4;
    }
}
