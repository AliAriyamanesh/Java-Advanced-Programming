package com.company;

public class Dastgah {
    public int x,y;
    boolean ans;
    public Dastgah(int a,int b,int c,int d,int e,int f){
        if ((a/c)!=(b/d)){
            this.ans=true;
            this.x=(e*d-b*f)/(a*d-b*c);
            this.y=(a*f-e*c)/(a*d-b*c);
        }else{
            this.ans=false;
        }

    }
}
