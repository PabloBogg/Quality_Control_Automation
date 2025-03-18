package com.alerts;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.alerts.Pages.HomePages;

class ApplicationTest {
    private WebDriver driver;
    private HomePages home;

    @BeforeEach
    public void setUp() {
        driver = new EdgeDriver();
        String url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
        home = new HomePages(driver, url);

    }

    @AfterEach
    public void tearDown() {
        home.quit();
    }

    @Test
    void testingAlerts() throws InterruptedException {
        driver.switchTo().frame("iframeResult"); // Cambiar al iframe primero

        WebDriverWait waitSearch = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitSearch.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button")));

        // Hacer clic en el botón
        home.clickBotonTriIt();
        

        // Esperar a que aparezca la alerta
        waitSearch.until(ExpectedConditions.alertIsPresent());

        // Cambiar a la alerta
        Alert alert = driver.switchTo().alert();

        // Ingresar texto en la alerta
        alert.sendKeys("Nombre Apellido");
        Thread.sleep(2000);

        // Hacer clic en el botón de Aceptar
        alert.accept();
        Thread.sleep(2000);

    }
}
