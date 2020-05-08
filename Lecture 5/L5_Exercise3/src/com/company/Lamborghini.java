package com.company;

public class Lamborghini implements Car {
    public int horsepower=285;
    @Override
    public void getSpecs() {
        System.out.println("Lamborghini horsepower : "+horsepower);
    }
}
