package Model.Repository;

import Model.Entity.PlanEntity;
import Model.Entity.UserEntity;

import javax.jws.soap.SOAPBinding;
import java.sql.*;

public class UserRepo implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;
    public UserRepo (){
        try {
            Class.forName ("oracle.jdbc.driver.OracleDriver");
            connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "ariya", "myjava123");
            connection.setAutoCommit (false);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addPlan(UserEntity userEntity , PlanEntity planEntity) throws SQLException {
        preparedStatement=connection.prepareStatement ("UPDATE users  set cash = cash + ?, data= data + ? WHERE username=? ");
        preparedStatement.setInt (1,planEntity.getPrice());
        preparedStatement.setInt (2,planEntity.getSize());
        preparedStatement.setString (3,userEntity.getUsername());
        preparedStatement.executeUpdate();
    }
    public PlanEntity getUserStatus(UserEntity userEntity)  {

        try {
            preparedStatement=connection.prepareStatement ("SELECT CASH,DATA FROM  USERS WHERE USERNAME=? AND PASSWORD=?");
        preparedStatement.setString(1,userEntity.getUsername());
        preparedStatement.setString(2,userEntity.getPassword());
                ResultSet resultSet=preparedStatement.executeQuery ();
        if (resultSet.next ()){
            PlanEntity planEntity=new PlanEntity ();
            planEntity.setPrice(resultSet.getInt("cash"));
            planEntity.setSize(resultSet.getInt("data"));
            return planEntity;
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void commit() throws Exception{
        connection.commit ();
    }
    public void rollback() throws Exception{
        connection.rollback ();
    }
    @Override
    public void close() throws Exception {
        preparedStatement.close ();
        connection.close ();
    }
}
