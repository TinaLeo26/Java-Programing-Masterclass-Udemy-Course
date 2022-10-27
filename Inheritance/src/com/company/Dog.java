package com.company;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private  int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int tail, int legs, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.tail = tail;
        this.coat = coat;
        this.teeth = teeth;
        this.legs = legs;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    public void run(){
        System.out.println("Dog.run() called");
       move(10);
    }
}
