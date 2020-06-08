package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    TextField txtfieldname;
    @FXML
    TextField txtfieldfamily;
    @FXML
    TextField txtfieldage;
    @FXML
    TableView<Person> table;
    @FXML
    TableColumn<Person,String> columnname;
    @FXML
    TableColumn<Person,String> columnfamily;
    @FXML
    TableColumn<Person,Integer> columnage;
    @FXML
    TextArea txtarea;

     ObservableList<Person> observableList = FXCollections.observableArrayList();
    public void btnclick(ActionEvent e){
        if (txtfieldname.getText().equals("") | txtfieldfamily.getText().equals("")  |txtfieldage.getText().equals("")  ){
            Alert alert =new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText("Empty filed(s)");
            alert.setContentText("Fields are not completed in Thread 1 ");
            alert.showAndWait();
        }else{
            Thread thread1 =new Thread(){
                @Override
                public void run() {
                    try (Connection connection = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "Ariya",
                            "myjava123")) {
                        Class.forName ("oracle.jdbc.driver.OracleDriver");// for old versions of JDBC
                        PreparedStatement preparedStatement = connection.prepareStatement ("insert into persons (name,family,age) values (?,?,?)");
                        preparedStatement.setString(1,txtfieldname.getText());
                        preparedStatement.setString(2,txtfieldfamily.getText());
                        preparedStatement.setInt(3,Integer.parseInt(txtfieldage.getText()));
                        preparedStatement.executeUpdate();
                    } catch (ClassNotFoundException e)// if no lib files are added
                    {
                        System.out.println ("DB Driver Not Exist!!");
                    } catch (SQLException e) {
                        System.out.println ("DB ERROR " + e.getMessage ());
                    }
                }
            };
            Thread thread2=new Thread(){
                @Override
                public void run() {
                    observableList.clear();
                    try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ariya",
                            "myjava123")) {
                        Class.forName("oracle.jdbc.driver.OracleDriver");// for old versions of JDBC

                        PreparedStatement preparedStatement1 =
                                connection.prepareStatement("select * from persons");
                        ResultSet rs = preparedStatement1.executeQuery();
                        while(rs.next()){
                            observableList.add(new Person(rs.getString("name"),rs.getString("family"),rs.getInt("age")));
                        }
                        connection.close();
                        refreshTable();
                    } catch (ClassNotFoundException e)// if no lib files are added
                    {
                        System.out.println("DB Driver Not Exist!!");
                    } catch (SQLException e)
                    {
                        System.out.println("DB ERROR " + e.getMessage());
                    }

                }
            };
            Thread thread3=new Thread(){
                @Override
                public void run() {
                    String Fcontent="";
                    File file =new File (getClass().getResource("File.txt").getFile());
                    try {
                        FileReader fileReader =new FileReader(file);
                        int ascci =fileReader.read();
                        while (ascci !=-1){
                            Fcontent += (char) ascci;
                            ascci=fileReader.read();
                        }
                        refreshTextArea(Fcontent);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };
            thread1.start();
            thread2.start();
            thread3.start();
        }
    }
      void refreshTextArea(String content){
        txtarea.setText(content);
    }
      void refreshTable(){
        table.setItems(observableList);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        columnname.setCellValueFactory(new PropertyValueFactory<>("name"));
        columnfamily.setCellValueFactory(new PropertyValueFactory<>("family"));
        columnage.setCellValueFactory(new PropertyValueFactory<>("age"));
    }
}
