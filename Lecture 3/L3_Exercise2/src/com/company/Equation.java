package com.company;

public class Equation {
    public int a;
    public int b;
    public int c;
    private int delta;
    private float r1,r2;
    public void calculateRoots() throws EquationExeption {
        delta=((b*b) - (4*a*c));
        if(delta<0) throw new EquationExeption("Delta is negative");
        if (delta==0){
            r1 = (float)(-b + Math.sqrt(delta))/2*a;
            System.out.println("R1 = R2 = "+r1);
        }
        if(delta>0){
            r1 = (float)(-b + Math.sqrt(delta))/2*a;
            r2= (float)(-b - Math.sqrt(delta))/2*a;
            System.out.println(" R1 = "+r1+"  R2 = "+r2);
        }

    }
    public Equation(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public Equation(){}

}
