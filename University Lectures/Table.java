import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        
        System.out.print("Enter the number to print it's Table: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=11;i++){
            int c = n * i;
            System.out.println(n+"x"+i+"="+c);    
        }
    }
}
