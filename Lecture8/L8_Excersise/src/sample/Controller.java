package sample;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    TextField name;
    @FXML
    TextField family;
    @FXML
    TextField father;
    @FXML
    ComboBox<String> jens;
    @FXML
    DatePicker datepicker;
    @FXML
    Button button;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        jens.getItems().add("مرد");
        jens.getItems().add("زن");
    }
    public void add(ActionEvent e){

if (name.getText().equals("")|family.getText().equals("")|father.getText().equals("")|jens.getValue() ==null | datepicker.getValue() ==null){
    Alert alert =new Alert(Alert.AlertType.ERROR);
    alert.setTitle("Employment UI");
    alert.setHeaderText("Incomplete information");
    alert.setContentText("Fields are not completed !");
    alert.showAndWait();
}else{

    Person person = new Person(name.getText(),family.getText(),father.getText(),jens.getValue(),datepicker.getValue().toString());
   DBManager.getInstance().add(person);

}

    }
}
