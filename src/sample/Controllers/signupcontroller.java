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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class signupcontroller implements Initializable {

    @FXML
    private TextField tf_id;
    @FXML
    private TextField tf_first;
    @FXML
    private TextField tf_last;
    @FXML
    private TextField tf_role;
    @FXML
    private TextField tf_user;
    @FXML
    private PasswordField tf_pass;
    @FXML
    private TextField tf_squestion;
    @FXML
    private TextField tf_aquestion;

    double x = 0, y = 0;

    void login(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample/FXML/login.fxml"));
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    void signup(MouseEvent event) {
        Connection connection = Database.getInstance().getConnection();

        try {
            String ID = tf_id.getId();
            String First = tf_first.getText();
            String Last = tf_last.getText();
            String Username = tf_user.getText();
            String Password = tf_pass.getText();
            String Secret = tf_squestion.getText();
            String Answer = tf_aquestion.getText();

            Statement statement = connection.createStatement();

            int status = statement.executeUpdate("insert into users (ID, firstname, lastname, username, password, secret, answer)"
                    + " values('" + ID + "', '"+ First + "', '" + Last + "', '" + Username + "', '" + Password + "', '" + Secret + "', '" + Answer + "')");

            if (status > 0) {
                System.out.println("User has been registered. shamdog");
            }

            } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    void dragged(MouseEvent event) {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();

        stage.setX(event.getXOnScreen() - x);
        stage.setY(event.getYOnScreen() - y);
    }

    void pressed(MouseEvent event) {
        x = event.getXOnScreen();
        y = event.getYOnScreen();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
