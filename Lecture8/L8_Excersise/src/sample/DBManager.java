package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBManager {
    private static DBManager instance = new DBManager();
    private DBManager() {}
    private Connection connection;
    private PreparedStatement preparedStatement;
    public static DBManager getInstance() {
        return instance;
    }
    public void add(Person person){
        try {
            Class.forName ("oracle.jdbc.driver.OracleDriver");
             connection= DriverManager.getConnection  ("jdbc:oracle:thin:@localhost:1521:xe", "ariya", "myjava123");
        preparedStatement=connection.prepareStatement ("INSERT INTO  employment(name, family, father, jens,birth) VALUES (?,?,?,?,?)");
        preparedStatement.setString (1,person.getName ());
        preparedStatement.setString (2,person.getFamily ());
        preparedStatement.setString (3,person.getFather ());
        preparedStatement.setString (4,person.getJens ());
        preparedStatement.setString (5,person.getDate ());
        preparedStatement.executeUpdate ();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
