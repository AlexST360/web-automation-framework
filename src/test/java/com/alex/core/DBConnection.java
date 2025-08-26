package com.alex.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                String url = ConfigReader.get("db.url");
                String user = ConfigReader.get("db.username");
                String pass = ConfigReader.get("db.password");
                String driver = ConfigReader.get("db.driver");

                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, pass);
                System.out.println("✅ Conexión a MySQL establecida correctamente");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("❌ Driver JDBC no encontrado", e);
            } catch (SQLException e) {
                throw new RuntimeException("❌ Error al conectar con MySQL", e);
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
                System.out.println("🔌 Conexión MySQL cerrada");
            } catch (SQLException e) {
                throw new RuntimeException("❌ Error cerrando la conexión", e);
            }
        }
    }
}
