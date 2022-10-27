package com.company;

public class PC {
    private Case theCase;
    private Monitor Monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.Monitor= monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
        Monitor.drawPixelAt(1200,50, "yellow");
    }

}
