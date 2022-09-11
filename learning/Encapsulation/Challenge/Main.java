package com.Encapsulation.Challenge;

public class Main {
    //Create a class and demonstrate proper encapsulation techniques
    //The class will be called Printer
    //It will simulate a real Computer Printer
    //It should have fields for the toner level, number of pages printed, and
    //Also whether it is a duplex Printer (capable for printing on both sides)
    //Add methods to fill up the toner (Up to a maximum of 100%), another method to
    //Simulate printing a page (which should increase the number of pages printed)
    //Decide on the scope, whether to use constructors, and anything else you think is needed.

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial Page Count: "+printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print for printer "+printer.getPagesPrinted());
        pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print for printer "+printer.getPagesPrinted());
    }

}
