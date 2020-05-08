package com.company;

public class CarFactory {
    public static Car getCar(CarBrands brands){
        switch (brands){
            case Benz:
                return new Benz();
            case BMW:
                return new BMW();

            case Toyota:
                return new Toyota();

            case Lamborghini:
                return new Lamborghini();

            default:
                return null;

        }
    }

}
