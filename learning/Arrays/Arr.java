package Arrays;

import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("enter number of elements");

        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++){//for reading array
            arr[i]=s.nextInt();

        }

        System.out.println("---------------------------------------------");
        for(int i: arr){ //for printing array

            

            System.out.print(i+" ");

        }


    }
}
