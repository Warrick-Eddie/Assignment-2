package sample.Controllers;

import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class title_bar implements Initializable {

    void close(MouseEvent event) {
        Node node = (Node) event.getSource();

        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
    }

    void max(MouseEvent event) {
        Node node = (Node) event.getSource();

        Stage stage = (Stage) node.getScene().getWindow();
        stage.setFullScreenExitHint(" ");
        stage.setFullScreen(true);
    }

    void min(MouseEvent event) {
        Node node = (Node) event.getSource();

        Stage stage = (Stage) node.getScene().getWindow();
        stage.setIconified(true);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
