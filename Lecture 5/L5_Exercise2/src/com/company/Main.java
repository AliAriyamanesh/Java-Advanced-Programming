package com.company;

public class Main {

    public static void main(String[] args) {
	UserSingleton.getInstance().setName("Ali").setUsername("mr.ariya").setPassword("12345678");
	UserSingleton.getInstance().printInf();
    }
}
