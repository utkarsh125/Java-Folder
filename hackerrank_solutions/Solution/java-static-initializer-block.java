import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a>0 && b>0){
            System.out.println(a*b);
        }else if (a<=0||b<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
