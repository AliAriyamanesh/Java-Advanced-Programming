package com.company;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        while (true){
            System.out.println("---Menu---\n1) add employee\n2)delete employee");
            switch (input.next()){
                case "1":
                    addEmployee();
                    break;
                case "2":
                    deleteEmployee();
                    break;
            }
        }
    }
    public static void deleteEmployee(){
        Scanner input =new Scanner(System.in);
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ariya",
                "myjava123")) {
            System.out.println("Enter code :");
            Class.forName("oracle.jdbc.driver.OracleDriver");// for old versions of JDBC
            PreparedStatement preparedStatement3 = connection.prepareStatement("delete from employee where code=?");
            preparedStatement3.setLong(1, Integer.parseInt(input.nextLine()));
            preparedStatement3.executeUpdate();
        } catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e)
        {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }
    public static void addEmployee() {
        Scanner input =new Scanner(System.in);
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ariya",
                "myjava123")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");// for old versions of JDBC

            System.out.println("--- new person ---");
            PreparedStatement preparedStatement1 =
                    connection.prepareStatement("insert into employee (code,name,melli,father,semat,salary,experience) values (?,?,?,?,?,?,?)");
            System.out.println("code (primary key) :");
            preparedStatement1.setLong(1, Integer.parseInt(input.nextLine()));
            System.out.println("name :");
            preparedStatement1.setString(2, input.nextLine());
            System.out.println("code melli :");
            preparedStatement1.setLong(3, Integer.parseInt(input.nextLine()));
            System.out.println("father name :");
            preparedStatement1.setString(4, input.nextLine());
            System.out.println("semat :");
            preparedStatement1.setString(5, input.nextLine());
            System.out.println("salary :");
            preparedStatement1.setLong(6, Integer.parseInt(input.nextLine()));
            System.out.println("Experience :");
            preparedStatement1.setLong(7, Integer.parseInt(input.nextLine()));
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
