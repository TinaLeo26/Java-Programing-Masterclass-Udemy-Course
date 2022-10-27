package com.company;

public class Main {

    public static void main(String[] args) {
//      Account timAccount = new Account();
//      timAccount.withdrawFounds(100.0);
//      timAccount.depositFounds(50);
//
//      Wall wall = new Wall(-1.25,-1.25);
//        System.out.println("area = " + wall.getArea());
//
//        wall.setHeight(-1.5);
//        System.out.println("area = " + wall.getArea());

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor,carpet);
        System.out.println(calculator.getTotalCost());


    }
}
