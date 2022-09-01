package University

import java.util.Scanner;

import java.lang*;
import java.util.Scanner;

public class ArrayInitialization {
    public static void main(String[] args) {
        //ONE DIMENSIONAL ARRAY INPUT
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store: ");
        int n = sc.nextInt();

        //Array initialization

        int[] array = new int[10];
        System.out.println("Type the elements of the Array: ");

        for(int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0; i<n; i++){
            System.out.println(array[i]);
        }
    }
}
