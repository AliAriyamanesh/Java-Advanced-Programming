package com.company;

public class ClacMinus extends Calculate {
    public String str;
    public int num1,num2;
    public void calc(){
        System.out.println(num1 +"-"+ num2+" = "+(num1-num2));
    }
    public ClacMinus(String str){
        num1=str.charAt(0)-48;
        num2=str.charAt(2)-48;
        calc();
    }
}
