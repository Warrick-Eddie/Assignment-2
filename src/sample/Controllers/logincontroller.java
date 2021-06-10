package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.Connection.Database;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class logincontroller implements Initializable {

    @FXML
    private TextField tf_user;
    @FXML
    private PasswordField pf_pass;

    void login(MouseEvent event) throws SQLException, IOException {

        String username, password;
        username = tf_user.getText();
        password = pf_pass.getText();

        Connection connection = Database.getInstance().getConnection();
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from users where username" +
                " = '" + username + "' and password = '" + password + "'");

        if (resultSet.next()) {
            Parent root = FXMLLoader.load(getClass().getResource("/sample/FXML/App.fxml"));
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.setScene(new Scene(root));
        }
    }

    double x= 0, y= 0;

    void pressed(MouseEvent event) {
        x = event.getXOnScreen();
        y = event.getYOnScreen();
    }

    void dragged(MouseEvent event) {
        Node node = (Node) event.getSource();

        Stage stage = (Stage) node.getScene().getWindow();

        stage.setX(event.getXOnScreen() - x);
        stage.setY(event.getYOnScreen() - y);
    }

    void signup(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/FXML/Signup.fxml"));
        Node node = (Node) event.getSource();

        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(root));

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
