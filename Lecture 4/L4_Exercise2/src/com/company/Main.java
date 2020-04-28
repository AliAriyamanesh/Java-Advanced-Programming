package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User user = new User();
        User[] clonedusers=new User[3];
        System.out.println("------ New User ------\nUsername : ");
        user.setUser(input.next());
        System.out.println("Password : ");
        user.setPass(input.next());
        for(int i=0;i<3;i++){
            try {
                clonedusers[i] = (User) user.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n\n------ Main User ------\nUsername : "+user.getUser()+"\nPassword : "+user.getPass()+"\n\n------ Cloned Users ------");
        for(int i=0;i<3;i++){
            System.out.println("--- User "+(i+1)+" ---\nUsername : "+clonedusers[i].getUser()+"\nPassword : "+clonedusers[i].getPass());
        }
    }
}
