package com.company;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        while (true){
            System.out.println("---Menu---\n1) add student\n2) delete student\n3) edit student");
            switch (input.next()){
                case "1":
                    addStudent();
                    break;
                case "2":
                    deleteStudent();
                    break;
                case "3":
                    updateStudent();
                    break;
            }
        }
    }
    public static void updateStudent(){
        Scanner input =new Scanner(System.in);
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ariya",
                "myjava123")) {
            System.out.println("Enter code :");
            Class.forName("oracle.jdbc.driver.OracleDriver");// for old versions of JDBC
            PreparedStatement preparedStatement1 = connection.prepareStatement("update student set name=?,enterance=?,avg=? WHERE code=?");
            preparedStatement1.setLong(4, Integer.parseInt(input.nextLine()));
            System.out.println("name :");
            preparedStatement1.setString(1, input.nextLine());
            System.out.println("Entrance year :");
            preparedStatement1.setLong(2, Integer.parseInt(input.nextLine()));
            System.out.println("average :");
            preparedStatement1.setLong(3, Integer.parseInt(input.nextLine()));
            preparedStatement1.executeUpdate();
        } catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e)
        {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }
    public static void deleteStudent(){
        Scanner input =new Scanner(System.in);
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ariya",
                "myjava123")) {
            System.out.println("Enter code :");
            Class.forName("oracle.jdbc.driver.OracleDriver");// for old versions of JDBC
            PreparedStatement preparedStatement3 = connection.prepareStatement("delete from student where code=?");
            preparedStatement3.setLong(1, Integer.parseInt(input.nextLine()));
            preparedStatement3.executeUpdate();
            System.out.println("deleted");
        } catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e)
        {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }
    public static void addStudent() {
        Scanner input =new Scanner(System.in);
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ariya",
                "myjava123")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");// for old versions of JDBC

            System.out.println("--- new student ---");
            PreparedStatement preparedStatement1 =
                    connection.prepareStatement("insert into student (code,name,enterance,avg) values (?,?,?,?)");
            System.out.println("student code (primary key) :");
            preparedStatement1.setLong(1, Integer.parseInt(input.nextLine()));
            System.out.println("name :");
            preparedStatement1.setString(2, input.nextLine());
            System.out.println("Entrance year :");
            preparedStatement1.setLong(3, Integer.parseInt(input.nextLine()));
            System.out.println("average :");
            preparedStatement1.setLong(4, Integer.parseInt(input.nextLine()));
            preparedStatement1.executeUpdate();

        } catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e)
        {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }
}
