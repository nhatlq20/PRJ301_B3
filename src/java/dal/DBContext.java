package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Provides a basic SQL Server database context.
 *
 * <p>This class initializes a JDBC {@link Connection} in its constructor and
 * exposes it to subclasses (e.g., DAOs) via the protected field {@code c}.
 * It also provides a utility method to close the connection.</p>
 */
public class DBContext {

    /** Shared JDBC connection for DAO subclasses. */
    protected Connection c;

    /**
     * Initializes the JDBC connection using SQL Server driver and credentials.
     *
     * <p>Note: In production, move credentials to configuration and handle
     * exceptions with a proper logging framework.</p>
     */
    public DBContext() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=PRJtest;encrypt=true;trustServerCertificate=true";
            String username = "sa";
            String pass = "ndc2022005";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c = DriverManager.getConnection(url, username, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** Closes the shared JDBC connection if it is open. */
    public void closeConnection() {
        try {
            if (c != null && !c.isClosed()) {
                c.close();
                System.out.println("Connection closed successfully.");
            }
        } catch (SQLException e) {
            System.out.println("Error closing connection: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Demo: open and then close a connection
        DBContext context = new DBContext();
        context.closeConnection();
    }
}
