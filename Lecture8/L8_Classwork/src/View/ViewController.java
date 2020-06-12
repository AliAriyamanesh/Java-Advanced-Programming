package View;

import Model.Entity.PersonEntity;
import Model.Service.PersonService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class ViewController {
    @FXML
    TextField signinname;
    @FXML
    TextField signinusername;
    @FXML
    TextField signinpassword;
    @FXML
    TextField signinemail;
    @FXML
    TextField signupusername;
    @FXML
    TextField signuppassword;
    @FXML
    Button signup;
    @FXML
    Button signin;
    public void signinButton(ActionEvent e){
        try {
            if (PersonService.getInstance().Exists(signupusername.getText(),signuppassword.getText())){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Person Application");
                alert.setHeaderText("Welcome !");
                alert.setContentText("You have successfully logged in !");
                alert.showAndWait();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
    public void signupButton(ActionEvent e){
        try {
            PersonService.getInstance().save(new PersonEntity(signinname.getText(),signinusername.getText(),signinpassword.getText(),signinemail.getText()));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Person Application");
            alert.setHeaderText("Done !");
            alert.setContentText("New person added successfully !");
            alert.showAndWait();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
