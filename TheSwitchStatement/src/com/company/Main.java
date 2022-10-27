package com.company;

public class Main {

    public static void main(String[] args) {


        int switchValue = 3;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value wa 2");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char letter = 'A';
        switch (letter){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(letter + " was found");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
