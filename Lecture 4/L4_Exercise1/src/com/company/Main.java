package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map map = new HashMap();
        Scanner input=new Scanner(System.in);
        System.out.println("------ New Student ------\nStudent ID : ");
        map.put("id",input.next());
        System.out.println("Student Name : ");
        map.put("name",input.next());
        System.out.println("Student Average : ");
        map.put("average",input.next());

        System.out.println("------ Student Information ------\nname : "+map.get("name")+"\nID : "+map.get("id")+"\nAverage : "+map.get("average"));

    }
}
