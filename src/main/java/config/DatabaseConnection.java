package config;
import java.sql.*;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/Sport_Leagues";
    private static final String USER = "postgres";
    private static final String PASSWORD = "4900686311";
    private static Connection connection;
    public static Connection getConnection() throws SQLException {
    Connection userConnection = DriverManager.getConnection(URL, USER, PASSWORD );
        return connection;
    }

    public static void closeConnection() throws SQLException {
        connection.close();
    }
}
