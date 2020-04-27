package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = input.next();

        try {
            checkDigit(str);
        } catch (StringExeption stringExeption) {
            stringExeption.printStackTrace();
        }

    }
    public static void checkDigit(String str) throws StringExeption{
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)<58 && str.charAt(i) > 47) throw new StringExeption("Digit found inside of string");
        }
        System.out.println("The length of string is "+str.length());
    }
}
