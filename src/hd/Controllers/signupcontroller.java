package hd.Controllers;

import hd.Connection.Database;
import hd.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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


    void pressed(MouseEvent event) {
        x = event.getXOnScreen();
        y = event.getYOnScreen();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void signup(javafx.scene.input.MouseEvent event) {
        Connection connection = Database.getInstance().getConnection();

        try {
            String ID = tf_id.getId();
            String First = tf_first.getText();
            String Last = tf_last.getText();
            String Role = tf_role.getText();
            String Username = tf_user.getText();
            String Password = tf_pass.getText();
            String Secret = tf_squestion.getText();
            String Answer = tf_aquestion.getText();

            Statement statement = connection.createStatement();

            int status = statement.executeUpdate("insert into HOT (ID, First, Last, Role, hd.User, Pass, SQuestion, SQuestion)"
                    + " VALUES(" +
                    " '" + ID +       "'," +
                    " '" + First +    "'," +
                    " '" + Last +     "'," +
                    " '" + Role +     "'," +
                    " '" + Username + "'," +
                    " '" + Password + "'," +
                    " '" + Secret +   "'," +
                    " '" + Answer +   "'" +
                    ")");

            if (status > 0) {
                System.out.println("hd.User has been registered. shamdog");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void login(javafx.scene.input.MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        System.out.println(Main.class.getResource("/hd/FXML/login.fxml"));
        loader.setLocation(Main.class.getResource("/hd/FXML/login.fxml"));
        Parent layout = loader.load();

        //Parent root = FXMLLoader.load(getClass().getResource("/FXML/login.fxml"));
        Scene scene = new Scene(layout);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

}
