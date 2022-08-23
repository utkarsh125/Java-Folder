package LectureEightyEight;

public class Thar extends Car{
    private int roadServiceMonths;

    public Thar(String name, String size, int wheels, int doors, int gears, boolean isManual, int roadServiceMonths) {
        super("Thar", "4WD", wheels, doors, gears, isManual);
        this.roadServiceMonths = roadServiceMonths;
    }
    
}
