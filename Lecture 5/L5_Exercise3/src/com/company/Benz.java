package com.company;

public class Benz implements Car {
    public int horsepower=255;
    @Override
    public void getSpecs() {
        System.out.println("Benz horsepower : "+horsepower);
    }
}
