package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
    public static void main(String[] args) {
        Connection connect =null;
        //String url="jdbc:postgresql://localhost/university?username=postgres&password=1234";
        String url="jdbc:postgresql://localhost:5432/university?user=postgres&password=1234";
        try {
            connect= DriverManager.getConnection(url);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

}