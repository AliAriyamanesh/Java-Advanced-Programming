package com.company;

public class Main {

    public static void main(String[] args) {
	Dastgah moadeleh=new Dastgah(3,-1,2,3,7,1);
	if(moadeleh.ans==true){
        System.out.println("X = "+moadeleh.x+"  Y ="+moadeleh.y);
    }else{
        System.out.println("No answer");
    }
    }
}
