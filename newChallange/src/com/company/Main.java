package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean isLeapYear (int year){
        if (year <1 && year > 9999){
            return false;
        }else if ((year >= 1 && year <= 9999) && (year % 4 ==0 || year % 400 ==0)) {
         return true;
        }
        return false;
    }
    public static int getDaysInMonth (int month, int year){
        if ((month==2) && isLeapYear(year) &&(year >= 1 && year <= 9999)){
            return 29;
        }else if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999) ){
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;

                case 2:
                    return 28;

                case 4: case 6: case 9: case 11:
                    return 30;


            }
        }return -1;
    }




    public static void printNumberInWord (int number){
        switch (number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }
}
