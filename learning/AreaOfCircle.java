import java.util.Scanner;
//import java.util.*;
class FirstClass{
    public static void main(String[] args) {
        float PI = 3.14F;
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        sc.close();
        float area = PI*(rad)*(rad);
        System.out.println(area);
    }
}