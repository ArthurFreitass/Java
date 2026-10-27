package jdbc.recuperando.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {

    private static Connection connect = null;

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

    public static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("C:\\Users\\Arthur Freitas\\IdeaProjects\\Java\\src\\jdbc\\recuperando\\db\\db.properties")) {
            Properties ps = new Properties();
            ps.load(fs);
            return ps;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

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

    // Close statements


    public static void closeStatement(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    public static void closeResultSet(ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

}
