package com.company;

import sun.security.util.Resources;
import sun.security.x509.FreshestCRLExtension;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FReader implements Runnable {
    private String FContent;
    private static FReader instance = new FReader();
    private FReader() {}
    public static FReader getInstance(){return instance;}
    public String getFContent() {
        return FContent;
    }


    @Override
    public void run() {
        FContent="";
        File file = new File(getClass().getResource("File1.txt").getFile());
        try {
            FileReader fileReader = new FileReader(file);
            int ascci;
            ascci=fileReader.read();
            while(ascci !=-1){
                FContent +=(char) ascci;
                ascci=fileReader.read();
            }
            System.out.println(FContent);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
