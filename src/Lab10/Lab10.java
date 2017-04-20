package Lab10;/**
 * Created by Work on 19.04.2017.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Lab10 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        try {
            Parent root = FXMLLoader.load(getClass().getResource("UI10.fxml"));
            primaryStage.setTitle("Laba10");
        primaryStage.setScene(new Scene(root));
            primaryStage.show();
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
