package com.company;

import java.sql.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int code=981113003;
        System.out.println("--- Add new user ---");
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ariya",
                "myjava123")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");// for old versions of JDBC

            PreparedStatement preparedStatement1 =
                    connection.prepareStatement("insert into webusers (code,username,email,password,age,grade) values (?,?,?,?,?,?)");

            preparedStatement1.setLong(1, code);

            preparedStatement1.executeUpdate();


            System.out.println("--- Update user ---");
            PreparedStatement preparedStatement2 = connection.prepareStatement("update webusers set username=?, email=? ,password=?, age=? ,grade=? WHERE code=?");
            System.out.println("Enter username :");
            preparedStatement2.setString(1, input.nextLine());
            System.out.println("Enter Email");
            preparedStatement2.setString(2, input.nextLine());
            System.out.println("Enter password :");
            preparedStatement2.setString(3, input.nextLine());
            System.out.println("Enter age :");
            preparedStatement2.setLong(4, Integer.parseInt(input.nextLine()));
            System.out.println("Enter grade :");
            preparedStatement2.setString(5, input.nextLine());
            preparedStatement2.setLong(6,code);
            preparedStatement2.executeUpdate();
            connection.close();


        } catch (ClassNotFoundException e)// if no lib files are added
        {
            System.out.println("DB Driver  Not Exist!!");
        } catch (SQLException e)
        {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }
}
