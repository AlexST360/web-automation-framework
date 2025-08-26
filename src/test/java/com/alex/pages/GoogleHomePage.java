package com.qa.automation.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleHomePage {

    private static final Logger log = LogManager.getLogger(GoogleHomePage.class);

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By searchBox = By.name("q");
    private final String url = "https://www.google.com/";

    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public GoogleHomePage open() {
        log.info("Abriendo página de Google: {}", url);
        driver.get(url);
        // Aceptar cookies si aparece banner (best effort)
        try {
            driver.switchTo().frame(0);
        } catch (Exception ignored) {}
        return this;
    }

    public GoogleHomePage typeQuery(String query) {
        log.info("Escribiendo consulta en el buscador: {}", query);
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
        WebElement input = driver.findElement(searchBox);
        input.clear();
        input.sendKeys(query);
        return this;
    }

    public void submit() {
        log.info("Enviando búsqueda (ENTER).");
        driver.findElement(searchBox).sendKeys(Keys.ENTER);
    }

    public String getTitle() {
        String title = driver.getTitle();
        log.info("Título actual de la página: {}", title);
        return title;
    }
}
