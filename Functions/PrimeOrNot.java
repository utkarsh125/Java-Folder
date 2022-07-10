package Functions;
import java.util.*;

public class PrimeOrNot {
    public static void checkPrime(int n) {  
        boolean flag = true;
        for(int i = 2; i<n; i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println(n+" Is prime");
        }
        else{
            System.out.println(n+" Not prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check: ");
        int n = sc.nextInt();
        sc.close();

        checkPrime(n);
    }
}
