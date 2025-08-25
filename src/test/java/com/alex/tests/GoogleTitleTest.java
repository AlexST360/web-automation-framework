package com.qa.automation.tests;

import com.qa.automation.factory.DriverFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class GoogleTitleTest {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = DriverFactory.initDriver();
    }

    @Test
    public void testGoogleTitle() {
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println("Página cargada con título: " + title);
        Assertions.assertTrue(title.contains("Google"), "El título no contiene 'Google'");
    }

    @AfterAll
    public static void tearDown() {
        DriverFactory.quitDriver();
    }
}
