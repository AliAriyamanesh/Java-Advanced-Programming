package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Equation equation = new Equation();
        System.out.println("Enter a :");
        equation.a=Integer.parseInt(input.next());
        System.out.println("Enter b :");
        equation.b=Integer.parseInt(input.next());
        System.out.println("Enter c :");
        equation.c=Integer.parseInt(input.next());

        try {
            equation.calculateRoots();
        } catch (EquationExeption equationExeption) {
            equationExeption.printStackTrace();
        }
    }
}
