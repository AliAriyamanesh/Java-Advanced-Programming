package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Student student = new Student();
        List<Integer> list=new ArrayList<>();
        System.out.println("------ New Student ------\nname : ");
        student.setName(input.next());
        System.out.println("id : ");
        student.setId(Integer.parseInt(input.next()));
        System.out.println("father name : ");
        student.setFather(input.next());
        for (int i =0;i<5;i++){
            System.out.println("score "+(i+1)+" : ");
            list.add(Integer.parseInt(input.next()));
        }
        student.setScores(list);
        student.printFields();
    }
}
