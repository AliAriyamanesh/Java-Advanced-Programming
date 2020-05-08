package com.company;

public class Toyota implements Car{
    public int horsepower=205;
    @Override
    public void getSpecs() {
        System.out.println("Toyota horsepower : "+ horsepower);
    }
}
