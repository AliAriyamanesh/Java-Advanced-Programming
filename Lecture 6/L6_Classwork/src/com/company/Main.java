package com.company;

import sun.security.jgss.GSSCaller;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        while(true){
            System.out.println("------Menu------\n1- SignUp\n2- Login");
            switch (input.next()){
                case "1":
                    signUp();
                    break;
                case "2":
                    logIn();
                    break;
            }
        }

    }
    public static void signUp(){
        String name,username,password,email;
        Scanner input = new Scanner(System.in);
        System.out.println("\n------Sign up------\nEnter name : ");
        name=input.nextLine();
        System.out.println("Enter username : ");
        username=input.nextLine();
        System.out.println("Enter password : ");
        password=input.nextLine();
        System.out.println("Enter email : ");
        email=input.nextLine();
       try {
            Class.forName("oracle.jdbc.driver.OracleDriver");// for old versions of JDBC
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ariya",
                    "myjava123");
            PreparedStatement preparedStatement =
                    connection.prepareStatement("insert into person (name,username,password,email) values (?,?,?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, email);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException e)// if no lib files are added
        {
            e.printStackTrace();
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e)
        {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }

    public static void logIn(){
        String username,password;
        Scanner input = new Scanner(System.in);
        System.out.println("\n------Login------\nEnter username : ");
        username=input.nextLine();
        System.out.println("Enter password : ");
        password=input.nextLine();
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ariya",
                "myjava123")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");// for old versions of JDBC
            PreparedStatement preparedStatement = connection.prepareStatement("select password from person where username>=?");
            preparedStatement.setString(1,username);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next() & password.equals(resultSet.getString("password") )){
                System.out.println("Logged in successfully !\n");
            }else{
                System.out.println("Incorrect username/password !\n");
            }

        } catch (ClassNotFoundException e)// if no lib files are added
        {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e)
        {
            e.printStackTrace();
            System.out.println("DB ERROR " + e.getMessage());
        }
    }
}
