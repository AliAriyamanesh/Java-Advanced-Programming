package View;

import Model.Entity.PlanEntity;
import Model.Entity.UserEntity;
import Model.Service.UserService;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

import java.sql.SQLException;

public class Controller {
@FXML
    TextField username;
    @FXML
    TextField password;
    @FXML
    Button button1;
    @FXML
    Button button2;
    @FXML
    RadioButton rb1;
    @FXML
    RadioButton rb2;
    @FXML
    RadioButton rb3;
    @FXML
    RadioButton rb4;
    @FXML
    Pane pane1;
    @FXML
    Pane pane2;
    @FXML
    Label dstat;
    @FXML
    Label vstat;
    public UserEntity userEntity;
    public PlanEntity  planEntity = new PlanEntity();
    public void onEnter(ActionEvent e){
        userEntity= new UserEntity(username.getText(),password.getText());
        if (UserService.getInstance().userExists(new UserEntity(username.getText(),password.getText()))){
            System.out.println("Yes");
            pane1.setVisible(false);
            pane2.setVisible(true);
           syncStats();
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Data MVC");
            alert.setHeaderText("Incorrect username / pass");
            alert.setContentText("Default username : "admin" pass:"admin"");
            alert.showAndWait();
        }
    }
    public void setPlan(Event e){
        String id =((RadioButton) e.getSource()).getId().toString();
        int size=0,cash=0;
        switch (id){
            case"rb1":
                size=2;
                cash=1000;
                break;
            case"rb2":
                size=4;
                cash=2000;
                break;
            case"rb3":
                size=10;
                cash=5000;
                break;
            case"rb4":
                size=25;
                cash=10000;
                break;
        }
        planEntity.setSize(size).setPrice(cash);

    }
    public void syncStats(){
        dstat.setText(Integer.toString( UserService.getInstance().userData(userEntity))+" GB");
        vstat.setText(Integer.toString( UserService.getInstance().userCash(userEntity))+" $");
    }
    public void add(ActionEvent e){
        UserService.getInstance().addPlan(userEntity,planEntity);
        syncStats();
    }
}
