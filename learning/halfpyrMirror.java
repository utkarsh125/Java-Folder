import java.util.Scanner;

public class halfpyrMirror {
    public static void main(String[] args) {

        System.out.print("Enter the number of stars for testing: ");
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        System.out.println("Number of stars chosen: " + n);
        // System.out.println(n);
        
        for(int i = 1; i<=n; i++){
            //inner loop --> space print
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }

            //inner loop --> star print
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
