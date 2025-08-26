package com.qa.automation.tests;

import com.qa.automation.core.DriverFactory;
import com.qa.automation.pages.GoogleHomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class GoogleSearchTest {

    private static final Logger log = LogManager.getLogger(GoogleSearchTest.class);
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = DriverFactory.initDriver();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        DriverFactory.quitDriver();
    }

    @Test
    public void shouldSearchOnGoogleAndSeeTitle() {
        String query = "Selenium WebDriver";
        GoogleHomePage google = new GoogleHomePage(driver)
                .open()
                .typeQuery(query);
        google.submit();

        String title = google.getTitle();
        log.info("Verificando que el título contenga la palabra 'Google' o la query.");
        Assert.assertTrue(title.contains("Google") || title.toLowerCase().contains("selenium"),
                "El título no contiene 'Google' ni la consulta. Título: " + title);
    }
}
