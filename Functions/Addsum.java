package Functions;
import java.util.*;

public class Addsum {
    public static double Sum(double a, double b) {
        System.out.println("The numbers are: "+a+","+b);
        double x = a + b;
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        sc.close();

        double newSum= Sum(a, b);
        System.out.println("Their Sum is: "+newSum);
    }
}
