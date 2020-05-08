package com.company;

public class Calculate {
    public static Calculate getCalc(String str){
        switch (str.charAt(1)){
            case '+':
                return new CalcPlus(str);
            case '-':
                return new ClacMinus(str);
            default:
                return null;
        }
    }
    public Calculate(){}
}
