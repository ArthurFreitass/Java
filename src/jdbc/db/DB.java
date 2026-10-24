package jdbc.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    private static Connection connect = null;

    // Check connection or and make a connection
    public static Connection getConnection() {
        try {
            if (connect == null) {
                Properties ps = loadProperties();
                String url = ps.getProperty("dburl");
                connect = DriverManager.getConnection(url, ps);
            }
            return connect;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    // Load bd properties
    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("C:\\Users\\Arthur Freitas\\IdeaProjects\\Java\\src\\jdbc\\db\\db.properties")) {
            Properties ps = new Properties();
            ps.load(fs);
            return ps;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    // Close
    public static void closeConnection() {
        try {
            if (connect != null) {
                connect.close();
                connect = null;
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }
}
