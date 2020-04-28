package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        Scanner input = new Scanner(System.in);
        System.out.println("------ User information ------\nName : ");
        user.setName(input.next());
        System.out.println("Family : ");
        user.setFamily(input.next());
        System.out.println("Age : ");
        user.setAge(Integer.parseInt(input.next()));
        System.out.println("Username : ");
        user.setFamily(input.next());
        System.out.println("Password : ");
        user.setPass(input.next());
        System.out.println("Job : ");
        user.setJob(input.next());
    }
}