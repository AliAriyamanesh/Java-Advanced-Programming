package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n=input.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the array("+i+"): ");
            array[i]=input.nextInt();
        }
        System.out.printf("\narrays ={");
        for(int i=0;i<n;i++){
            System.out.print(array[i]);
            System.out.printf(",");
        }
        System.out.printf("}");
	// write your code here
    }
}
