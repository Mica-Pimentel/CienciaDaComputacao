/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionTest {

    public static void main(String[] args) {
        // URL da conex?o do banco de dados

        String jdbcUrl = "jdbc:mysql://localhost:3306/crudea3";
        String username = "root";
        String password = "";

        Connection connection = null;

        try {
            // Tenta estabelecer a conex?o
            
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            if (connection != null) {
                System.out.println("Conex?o estabelecida com sucesso!");
            } else {
                System.out.println("Falha ao estabelecer a conex?o!");
            }
        } catch (SQLException e) {
        } finally {
            // Fecha a conex?o
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                }
            }
        }
    }
}
*/
