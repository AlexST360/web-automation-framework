package com.alex.tests;

import com.alex.core.DBConnection;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLTest {

    @Test
    public void testDBConnection() throws Exception {
        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();

        // Crea tabla de prueba si no existe con las columnas correctas
        stmt.execute("CREATE TABLE IF NOT EXISTS users (id INT AUTO_INCREMENT PRIMARY KEY, username VARCHAR(100))");

        // Inserta un registro de prueba o actualiza si ya existe
        stmt.executeUpdate("INSERT INTO users (id, username) VALUES (1, 'Alex') " +
                "ON DUPLICATE KEY UPDATE username='Alex'");

        // Consulta registros
        ResultSet rs = stmt.executeQuery("SELECT * FROM users");
        while (rs.next()) {
            System.out.println("👤 Usuario: " + rs.getInt("id") + " - " + rs.getString("username"));
        }

        stmt.close();
        DBConnection.closeConnection();
    }
}
