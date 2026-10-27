package jdbc.recuperando.application;

import jdbc.recuperando.db.DB;
import jdbc.recuperando.db.DbException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    static void main() {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DB.getConnection();

            statement = connection.createStatement();

            resultSet = statement.executeQuery("select * from department");

            // Percorrendo

            while (resultSet.next()) {
                System.out.println("ID " + resultSet.getInt("Id") + " : " + resultSet.getString("Name"));
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(statement);
            DB.closeResultSet(resultSet);
            DB.closeConnection();
        }
    }
}
