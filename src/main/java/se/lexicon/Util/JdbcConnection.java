package se.lexicon.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/world";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "75240644.Pa@";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, DB_USER, DB_PASSWORD);
    }
}
