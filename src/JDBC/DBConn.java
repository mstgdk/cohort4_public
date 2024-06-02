package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/university";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "1234";

    public static void main(String[] args) {
        Connection connect = null;
        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        } catch (SQLException e) {
            System.out.println(e.getMessage());        }
    }
}
