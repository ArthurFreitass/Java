package jdbc.application;

import jdbc.db.DB;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        Connection connect = DB.getConnection();
        DB.closeConnection();
        
    }
}
