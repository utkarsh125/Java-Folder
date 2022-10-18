package Patterns;
import java.util.Scanner;

public class HalfPyrinverse {
    public static void main(String[] args) {
        System.out.println("Enter the number of stars: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //outer loop
        for(int i = n; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
