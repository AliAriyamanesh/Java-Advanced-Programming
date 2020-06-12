package Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../View/sample.fxml"));
        primaryStage.setTitle("Person MVC");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/view/icon.png")));;
        primaryStage.setScene(new Scene(root, 430, 310));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
