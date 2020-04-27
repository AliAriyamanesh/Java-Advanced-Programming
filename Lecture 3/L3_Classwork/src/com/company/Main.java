package com.company;

import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n;
        System.out.println("Enter the number of users : ");
        n=Integer.parseInt(input.next());
        User[] user =new User[n];

        for (int i = 0;i<n;i++){
            user[i]=new User();
            System.out.println("Enter the following informations for the user["+(i+1)+"] :");
            System.out.println("name : ");
            user[i].name=input.next();
            System.out.println("family : ");
            user[i].family=input.next();
            System.out.println("age : ");
            user[i].age=Integer.parseInt(input.next());
        }
        try{
        search(user);
        }
        catch (UserExeption e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }
    public static void search(User[] user) throws UserExeption{
        int n = user.length;
        for(int i=0;i<n ; i++){
            for (int j=i+1;j<n;j++ ){
                if (user[i].name.equals(user[j].name)){
                    if (user[i].family.equals(user[j].family)){
                        if (user[i].age==user[j].age){
                            throw new UserExeption("There is two users with same informations !");
                        }
                    }
                }
            }
        }
    }
}
