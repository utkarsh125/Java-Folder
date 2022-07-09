import java.util.Scanner;

// Should look something like this:

// 1 2 3 4 5
// 1 2 3 4
// 1 2 3 
// 1 2 
// 1

public class numHalfPyr {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("Number given: "+n);

        //METHOD 1
        System.out.println("-------METHOD#1--------");
        for(int i=n; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }

        System.out.println("-------METHOD#2--------");
        //METHOD 2
        for(int i = 1;i<=n;i++){
            //inner loop
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }

    }
}
