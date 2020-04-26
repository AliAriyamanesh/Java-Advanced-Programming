package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter num1 and num2 : ");
        num1 = Integer.parseInt(input.next());
        num2 = Integer.parseInt(input.next());
        Calculator calculator = new Calculator(num1,num2);
        outerloop:
        for(;;){
            System.out.println("1) +\n2) -\n3) *\n4) /\n5) Exit\nChoose an operator : ");
            String choice = input.next();
            switch (choice){
                case "1":
                    calculator.printSum();
                    break;
                case "2":
                    calculator.printSubtraction();
                    break;
                case "3":
                    calculator.printMultiplication();
                    break;
                case "4":
                    calculator.printDivision();
                    break;
                case "5":
                    break outerloop;
            }

        }

    }
}
