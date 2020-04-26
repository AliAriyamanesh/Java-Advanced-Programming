package com.company;

public class Shape {
    public int width;
    public int height;
    public int surface(){
        int surf;
        surf =(this.width)*(this.height);
        return surf;
    }
    public Shape(int width , int height){
        this.height=height;
        this.width=width;
    }
    public Shape(){}

}
