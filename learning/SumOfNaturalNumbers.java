import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the max limit of natural numbers you want to print: ");
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<= n; i++){
            sum = sum + i;
            //System.out.println(sum);

        }
        System.out.println(sum);
        

    }
}
