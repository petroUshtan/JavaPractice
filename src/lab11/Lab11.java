package lab11;/**
 * Created by Work on 20.04.2017.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Lab11 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UI11.fxml"));
        primaryStage.setTitle("Laba11");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
