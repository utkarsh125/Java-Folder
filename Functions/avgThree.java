package Functions;

import java.util.Scanner;

public class avgThree {
    public static double avgofThree(double a, double b, double c) {
        double x = a+b+c;
        double y = x/3;
        return y;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();

        double avg = avgofThree(a, b, c);
        System.out.println("Average is: "+avg);
    }
}
