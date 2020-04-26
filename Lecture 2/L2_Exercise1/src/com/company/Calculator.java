package com.company;

public class Calculator {
    public int num1,num2;
    private int sum,subtraction,multiplication;
    private float division;
    public void printSum(){
        System.out.println(num1 +" + "+num2 +" = "+sum+"\n\n");
    }
    public void printSubtraction(){
        System.out.println(num1 +" - "+num2 +" = "+subtraction+"\n\n");
    }
    public void printMultiplication(){
        System.out.println(num1 +" * "+num2 +" = "+multiplication+"\n\n");
    }
    public void printDivision(){
        System.out.println(num1 +" / "+num2 +" = "+division+"\n\n");
    }
    public  Calculator(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
        sum=num1+num2;
        subtraction=num1-num2;
        multiplication=num1*num2;
        division=((float)num1)/num2;
    }
}
