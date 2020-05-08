package com.company;

public class BMW implements Car {
    public int horsepower=230;
    @Override
    public void getSpecs() {
        System.out.println("BMW horsepower : "+horsepower);
    }
}
