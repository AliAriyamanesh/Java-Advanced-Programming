package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Shape shape ;
        Scanner input = new Scanner(System.in);
        String scn;
        int width,height;
        System.out.println("Enter the width : ");
        scn=input.nextLine();
        width=Integer.parseInt(scn);
        System.out.println("Enter the height : ");
        scn=input.nextLine();
        height=Integer.parseInt(scn);
        shape=new Shape(width,height);
        System.out.println("surface = "+ shape.surface());
	// write your code here
    }
}
