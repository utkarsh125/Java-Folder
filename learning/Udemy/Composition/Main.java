package com.utkarsh;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell","240", dimensions);

        Monitor theMonitor = new Monitor("27INCH Beast", "Acer", 27, new Resolution(2540,1440));

        Motherboard theMotherboard = new Motherboard("BJ-200","Asus",4,6,"V2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        //Create a single room of a house using composition
        //Think about the things that should be included in the room
        //Maybe physical parts of the house but furniture as well
        //Add at least one method to access an object via a getter and
        //then that objects method as you saw in the previous video (L: 91)
        //then add at least one method to hide the object e.g. not using a getter
        //but to access the object used in the composition within the main class

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12,55);
        Bed bed = new Bed("Modern",4,3,2,1);
        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Utkarsh", wall1, wall2, wall3,
                wall4, ceiling, bed, lamp);

        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();

    }







}
