package hd.Controllers;

import hd.Connection.Database;
import hd.User.User;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class logincontroller implements Initializable {

    public PasswordField tf_pass;
    @FXML
    public TextField tf_user;
    @FXML


    double x = 0, y = 0;
    public static Stage window;
    public static User user;
    boolean isUserValid = true;


    void pressed(MouseEvent event) {
        x = event.getXOnScreen();
        y = event.getYOnScreen();
    }

    public void dragged(javafx.scene.input.MouseEvent event) {
        Node node = (Node) event.getSource();

        Stage stage = (Stage) node.getScene().getWindow();

        stage.setX(event.getScreenX() - x);
        stage.setY(event.getSceneY() - y);
    }

    //public void signup(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        //Parent root = FXMLLoader.load(getClass().getResource("/hd/FXML/Signup.fxml"));
        //Stage stage = new Stage();
        //FXMLLoader loader = new FXMLLoader();
        //System.out.println(Main.class.getResource("/hd/FXML/Signup.fxml"));
        //loader.setLocation(Main.class.getResource("/hd/FXML/Signup.fxml"));
        //Parent root = loader.load();

        //Stage swapper = (Stage) root.getScene().getWindow();
        //stage.show();

        public void signup(Event event) throws IOException {
            try {
                //Load new FXML and assign it to scene
                Parent root = FXMLLoader.load(getClass().getResource("/hd/FXML/Signup.fxml"));
                //create empty new stage
                window = new Stage();
                //set layout properties
                Scene scene = new Scene(root);
                window.setScene(scene);
                window.setTitle("Hotel System");
                window.show();
                root.requestFocus();
                //close login stage
                ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
            } catch (IOException ex) {
                System.out.println("Error load homePage FXML !");
                System.out.println(ex);

            } catch (Exception e) {
                System.out.println(e);
                e.printStackTrace();
            }
        }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void loginAction(Event event) throws SQLException, IOException {
        String username, password;
        username = tf_user.getText();
        password = tf_pass.getText();

        Connection connection = Database.getInstance().getConnection();
        Statement statement = connection.createStatement();

        ResultSet resultSet = ((Statement) statement).executeQuery("select * from users where username" +
                " = '" + username + "' and password = '" + password + "'");

        if (resultSet.next()) {
            //Parent root = FXMLLoader.load(getClass().getResource("/hd/FXML/App.fxml"));
            try {
                //Load new FXML and assign it to scene
                Parent root = FXMLLoader.load(getClass().getResource("/hd/FXML/App.fxml"));
                //create empty new stage
                window = new Stage();
                //set layout properties
                Scene scene = new Scene(root);
                window.setScene(scene);
                window.setTitle("Hotel System Application");
                window.show();
                root.requestFocus();
                //close login stage
                ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
            } catch (IOException ex) {
                System.out.println("Error load homePage FXML !");
                System.out.println(ex);

            } catch (Exception e) {
                System.out.println(e);
                e.printStackTrace();
            }
        }
        //the method above is a test, delete when application is working
        System.out.println("You didn't make it");
    }

    public void login(Event event) throws SQLException {
        String username, password;
        username = tf_user.getText();
        password = tf_pass.getText();

        Connection connection = Database.getInstance().getConnection();
        Statement statement = connection.createStatement();

        ResultSet resultSet = ((Statement) statement).executeQuery("select * from users where username" +
                " = '" + username + "' and password = '" + password + "'");

        if (resultSet.next()) {
            //Parent root = FXMLLoader.load(getClass().getResource("/hd/FXML/App.fxml"));
            try {
                //Load new FXML and assign it to scene
                Parent root = FXMLLoader.load(getClass().getResource("/hd/FXML/App.fxml"));
                //create empty new stage
                window = new Stage();
                //set layout properties
                Scene scene = new Scene(root);
                window.setScene(scene);
                window.setTitle("Hotel System Application");
                window.show();
                root.requestFocus();
                //close login stage
                ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
            } catch (IOException ex) {
                System.out.println("Error load homePage FXML !");
                System.out.println(ex);

            } catch (Exception e) {
                System.out.println(e);
                e.printStackTrace();
            }
        }
        //the method above is a test, delete when application is working
        System.out.println("You didn't make it");
    }
}