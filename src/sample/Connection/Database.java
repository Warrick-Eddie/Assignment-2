package sample.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private Database() {

    }

    public static Database getInstance() {

        return new Database();
    }

    public Connection getConnection() {

        String connect_string = "jdbc:sqlite:database.db";


        Connection connection = null;
        try {

            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(connect_string);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Connection Successful");

        return connection;
    }


}
