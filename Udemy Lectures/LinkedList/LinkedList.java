package com.DSA.LinkedList;

import java.io.*;
import java.util.Scanner;
public class LinkedList{
    Node head;



    static class Node{
        int data;
        Node next;

        //CONSTRUCTOR

        Node(int d){
            data = d;
            next = null;

        }
    }


    //METHOD TO INSERT A NEW NODE

    public static LinkedList insert(LinkedList list, int data){
        //CREATING A NEW NODE

        Node new_node = new Node(data);

        //IF THE LINKEDLIST IS EMPTY;
        //THEN MAKE THE NEW NODE AS HEAD

        if(list.head == null){
            list.head = new_node;
        }
        else{
            //ELSE TRAVERSE TILL THE LAST NODE
            //AND INSERT THE NEW_NODE THERE

            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }

            last.next = new_node;
        }
        return list;

    }

    public static void printList(LinkedList list){
        Node currNode = list.head;
        System.out.println("LinkedList: ");

        //TRAVERSE THROUGH THE LINKEDLIST
        while(currNode != null){
            System.out.println(currNode.data + " ");

            //GO TO NEXT NODE
            currNode = currNode.next;
        }
    }

    //DriverCODE

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        Scanner sc = new Scanner(System.in);
        System.out.println("First element: ");
        int val1 = sc.nextInt();
        System.out.println("Next element: ");
        int val2 = sc.nextInt();
        System.out.println("Next element: ");
        int val3 = sc.nextInt();
        System.out.println("Next element: ");
        int val4 = sc.nextInt();
        System.out.println("Next element: ");
        int val5 = sc.nextInt();
        System.out.println("Next element: ");
        int val6 = sc.nextInt();

        list = insert(list, val1);
        list = insert(list, val2);
        list = insert(list, val3);
        list = insert(list, val4);
        list = insert(list, val5);
        list = insert(list, val6);

        printList(list);
    }
}