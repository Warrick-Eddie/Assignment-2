package hd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        //FXMLLoader loader = new FXMLLoader(getClass().getResource("/Signup.fxml"));
        //Parent root = loader.load();
        //Parent root = FXMLLoader.load(getClass().getResource("/FXML/logincontroller.fxml"));
        stage.setTitle("CAN YOU SEE THIS");
        //Scene scene = new Scene(root);
        //stage.setScene(scene);
        //stage.show();

        FXMLLoader loader = new FXMLLoader();
        System.out.println(Main.class.getResource("/hd/FXML/sample2.fxml"));
        loader.setLocation(Main.class.getResource("/hd/FXML/sample2.fxml"));
        Parent layout = loader.load();

        //Parent root = FXMLLoader.load(getClass().getResource("/FXML/sample2.fxml"));
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}