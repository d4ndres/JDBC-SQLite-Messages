import java.sql.Connection;
import java.sql.DriverManager;

class ConnectionSQLite {
    public Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:..\\database app\\my_database.db");
            System.out.println("Todo bem");
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return connection;
    }
}