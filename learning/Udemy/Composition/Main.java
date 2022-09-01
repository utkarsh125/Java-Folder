

public class Main{
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell","240",dimensions);

        Monitor theMonitor = new Monitor("27inch Beast","Acer",27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("X370","Asus", 4, 6, "11X");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(1500, 1200,"red");
        thePC.getMotherboard().loadProgram("Windows 10");
        thePC.getTheCase().pressPowerButton();

    }
}