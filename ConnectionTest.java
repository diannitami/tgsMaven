package Developer.compiler;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
    @BeforeAll
    static void beforeALL(){
        try {
            Driver mysqlDriver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(mysqlDriver);
        }catch (SQLException exception){
            exception.printStackTrace();
        }
    }
    @Test
    void testConnection(){
        String jdbcUrl = "jdbc:mysql://localhost/maven";
        String username = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("koneksi telah berhasil");
        }catch (SQLException exception){

        }
    }
}
