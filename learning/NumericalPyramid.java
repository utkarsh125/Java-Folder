import java.util.Scanner;

// To print the pyramid like this: 

// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5 

public class NumericalPyramid {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("Number chosen: "+n);

        //MORE CLEANER AND EFFICIENT WAY
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }


        //THIS IS LESS CLEAN WAY
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
    }
}
