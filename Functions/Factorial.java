package Functions;
import java.util.*;

public class Factorial {
    public static void printFactorial(int n) {
        //FOR NEGATIVE NUMBERS
        if (n<0){
            System.out.println("invalid number");
            return;
        }
        //LOOP
        int factorial = 1; //WE NEED A DEFAULT VALUE OF 1
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        printFactorial(n);
    }
}
