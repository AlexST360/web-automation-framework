package com.qa.automation.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class DriverFactory {

    private static final Logger log = LogManager.getLogger(DriverFactory.class);
    private static WebDriver driver;

    public static WebDriver initDriver() {
        if (driver == null) {
            try {
                // Asegura carpeta de logs
                new File("logs").mkdirs();

                log.info("Inicializando WebDriver (Chrome) con WebDriverManager...");
                WebDriverManager.chromedriver().setup();

                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                options.addArguments("--disable-notifications");
                options.addArguments("--incognito");

                driver = new ChromeDriver(options);
                log.info("WebDriver inicializado correctamente.");
            } catch (Exception e) {
                log.error("Error al inicializar el WebDriver: {}", e.getMessage(), e);
                throw e;
            }
        }
        return driver;
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            return initDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            log.info("Cerrando el WebDriver...");
            driver.quit();
            driver = null;
        }
    }
}
