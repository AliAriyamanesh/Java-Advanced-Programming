package Model.Repository;

import Model.Entity.PersonEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonRepository implements AutoCloseable {
    private PreparedStatement preparedStatement;
    private Connection connection;
    @Override
    public void close() throws Exception {
        preparedStatement.close ();
        connection.close ();
    }
    public boolean Login (String username,String password) throws SQLException {
        preparedStatement=connection.prepareStatement ("SELECT * FROM  person where username=? and password=? ");
        preparedStatement.setString(1,username);
        preparedStatement.setString(2,password);
                ResultSet resultSet=preparedStatement.executeQuery ();
      if(resultSet.next()){
          return true;
      }
        return false;
    }
    public PersonRepository() throws Exception{ //constructor
        Class.forName ("oracle.jdbc.driver.OracleDriver"); //activate
        connection= DriverManager.getConnection
                ("jdbc:oracle:thin:@localhost:1521:xe", "ariya", "myjava123");
//activate
        connection.setAutoCommit (false); //initialize
    }
    public void insert(PersonEntity personEnti) throws Exception{
        preparedStatement=connection.prepareStatement ("INSERT INTO person(name, username, password, email) VALUES (?,?,?,?)");
        preparedStatement.setString (1,personEnti.getName());
        preparedStatement.setString (2,personEnti.getUsername());
        preparedStatement.setString (3,personEnti.getPassword());
        preparedStatement.setString (4,personEnti.getEmail());
        preparedStatement.executeUpdate ();
    }
    public void commit() throws Exception{
        connection.commit ();
    }
    public void rollback() throws Exception{
        connection.rollback ();
    }

}

