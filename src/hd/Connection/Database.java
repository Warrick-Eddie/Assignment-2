package hd.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private Database() {

    }

    public static Database getInstance() {

        return new Database();
    }

    public static void CheckConnection() throws SQLException {
        String DatabaseName = " HOT";
        System.out.println("Test Connection DataBase :" + DatabaseName);
        String url = "jdbc:sqlite:database.db" + DatabaseName;
        Connection con = DriverManager.getConnection(url, "root", "");
        System.out.println("connection success");
        //con.close();

    }

    public Connection getConnection() {

        String connect_string = "jdbc:sqlite:database.db";


        Connection connection = null;
        try {

            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(connect_string);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Connection Successful");

        return connection;
    }


}
