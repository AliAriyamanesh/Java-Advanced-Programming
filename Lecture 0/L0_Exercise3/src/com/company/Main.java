package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a and b : ");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("1) a + b\n2)|a - b|\n3)a * b\n4)a / b");
        switch (input.nextInt()){
            case 1:{
                System.out.println("\na + b = " + (a+b));
                break;
            }
            case 2:{
                int res =0 ;
                if(a>b) res=a-b;
                if(a<=b) res=b-a;
                System.out.println("\n|a - b| = " + res);
                break;
            }
            case 3:{
                System.out.println("\na * b = " + (a*b));
                break;
            }
            case 4:{
                System.out.println("\na / b = " + (a/b));
                break;
            }
        }
    }
}
