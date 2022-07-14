package Patterns;
//import java.util.*;
import java.util.Scanner;

public class patternRect {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int n = 4;
        // int m = 5;

        // for(int i = 1; i<=n;i++){
        //     //inner loop
        //     for(int j=1; j<=m; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i = 1; i<=x; i++){
            for(int j=1; j<=y; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
