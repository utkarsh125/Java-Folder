package exercises_simple;

import java.util.*;

public class state{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        switch(a){
            case 1: System.out.println("C1");
            break;
            case 2: System.out.println("C2");
            break;
            case 3: System.out.println("C3");
            break;
            default: System.out.println("invalid");

            
        }
    }
}