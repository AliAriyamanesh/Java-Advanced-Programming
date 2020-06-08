package com.company;

public class Main {

    public static void main(String[] args) {

        Thread tr1 = new Thread(FReader.getInstance());
        tr1.start();
        Thread tr2 = new Thread(FWriter.getInstance());
        try {
           tr1.join();
        } catch (InterruptedException e) {
           e.printStackTrace();
        }

        tr2.start();
    }
}
