import java.sql.SQLException;

class DatabaseConnection {
    public void connect() throws SQLException {
        // Code to connect to the database that may throw SQLException
    }
}

class MySQLConnection extends DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }
}

public class MainDBConnection {
    public static void main(String[] args) {
        DatabaseConnection dbConnection = new MySQLConnection();
        try {
            dbConnection.connect();
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        } catch (SQLException sqlException) {
            System.out.println("sqlException: " + sqlException.getMessage());
        }
    }
}
