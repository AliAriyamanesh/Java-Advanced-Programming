package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int score[]=new int[5];
	int c[]=new int[5];
	int i,n=0,sum=0;
	float avg;
	String str;
	Scanner input=new Scanner(System.in);
	for(i=0;i<5;i++){
        System.out.println("Enter score and coefficient "+i+" :");
        str=input.nextLine();
        score[i]=Integer.parseInt(str);
        str=input.nextLine();
        c[i]=Integer.parseInt(str);
        n+=c[i];
        sum+=(score[i]*c[i]);
    }
	avg =(float) sum/n;
        System.out.println("Average is : "+avg);
        if(sum<13) System.out.println("mashroot");

    }

}
