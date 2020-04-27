package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Student student=new Student();
        Student tempstudent=new Student();
        System.out.println("------ Sign up ------\nname :");
        student.name=input.next();
        System.out.println("username :");
        student.username=input.next();
        System.out.println("password :");
        student.password=input.next();
        System.out.println("------ Sign in ------\nname :");
        tempstudent.name=input.next();
        System.out.println("username :");
        tempstudent.username=input.next();
        System.out.println("password :");
        tempstudent.password=input.next();

        try {
            login(student,tempstudent);
        }catch (LoginExeption e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }
    public static void login(Student student ,Student tempstudent) throws LoginExeption{
        if(student.name.equals(tempstudent.name)) {
            if (!student.username.equals(tempstudent.username)){
                throw new LoginExeption("Incorrect username !");
            }else if(!student.password.equals(tempstudent.password)){
                throw new LoginExeption("Incorrect password !");
            }else {
                System.out.println("Successfully logged in !");
            }

        }
        else throw new LoginExeption("Student not found !");
    }
}
