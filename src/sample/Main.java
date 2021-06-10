import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        //Parent root = FXMLLoader.load(getClass().getResource("sample/FXML/Signup.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Signup.fxml"));
        Parent root = loader.load();
        //URL url = Main.class.getResource("/FXML/Signup.fxml");
        // URL url = getClass().getResource("Signup.fxml");
        // Parent root = FXMLLoader.load(url);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}