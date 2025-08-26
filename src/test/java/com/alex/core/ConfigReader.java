package com.alex.core;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static final Properties properties = new Properties();

    static {
        try (InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                throw new RuntimeException("❌ No se encontró application.properties en resources");
            }
            properties.load(input);
        } catch (Exception e) {
            throw new RuntimeException("❌ Error cargando configuración: " + e.getMessage(), e);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}
