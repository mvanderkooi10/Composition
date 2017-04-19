package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("227 Beast","Acer",27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("B-244", "Dell","v2.44",4,4);

        PC thePC = new PC(theCase,theMotherboard,theMonitor);
        thePC.getMonitor().drawPixelAt(1400,1800,"Red");
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();
    }
}
