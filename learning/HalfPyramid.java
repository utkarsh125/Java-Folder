import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        // int n = 4;

        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.close();

        for(int i = 1; i<=m; i++){
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
