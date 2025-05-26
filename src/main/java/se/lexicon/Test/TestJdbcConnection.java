package se.lexicon.Test;

import se.lexicon.Exception.DatabaseException;
import se.lexicon.Util.JdbcConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class TestJdbcConnection {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = JdbcConnection.getConnection()) {
            if (conn != null && !conn.isClosed()) {
                System.out.println(" Database connection successful!");
            } else {
                System.out.println(" Failed to establish connection.");
            }
        } catch (DatabaseException e) {
            System.out.println(" Error during database connection:");
            e.printStackTrace();
        }
    }
}
