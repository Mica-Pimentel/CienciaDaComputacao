package crud_a3_psc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static String url = "jdbc:mysql://localhost:3306/crudea3";
    private static String user = "root";
    private static String password = "";

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(url, user, password);

    }
    
    

}
