package exercises_simple;
import java.util.Scanner;

public class TableOfaNum {
    public static void main(String[] args) {
        System.out.println("Enter the number for it's table: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        //Using the do-while
        // int i = 1;
        // do{
        //     i++;
        //     int x = n*i;
        //     System.out.println(x);
        // } while(i<10);

        //Using for-loop
        // System.out.println("-------------------------");
        // for(int i = 1; i<11; i++){
        //     System.out.println(i*n);
        // }

        //using the while loop

        int x = 1;
        System.out.println("----------------------------");
        System.out.println(n);
        while(x<10){
            x++;
            System.out.println(x*n);
        }
    }
}
