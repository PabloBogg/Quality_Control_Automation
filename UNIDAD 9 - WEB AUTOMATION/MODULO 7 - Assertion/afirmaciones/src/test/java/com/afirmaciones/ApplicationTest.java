package com.afirmaciones;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class ApplicationTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        //System.setProperty("webdriver.edge.driver","C:\\EdgeDriver\\edgedriver_win64\\msedgedriver.exe");
       // EdgeOptions options = new EdgeOptions();
        //options.addArguments("--user-data-dir=C:/temp/unique-directory");
        //WebDriver driver = new EdgeDriver(options);
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

    }

    /*
     * ✏️ Actividad: Validando con assertEquals
     * Escribe y ejecuta una prueba que cumpla con los siguientes pasos:
     * Iniciar el navegador y abrir Google.
     * Obtener el título de la página.
     * Verificar que el título es "Google" utilizando assertEquals.
     */
    @Test
    void pruebaAssertEquals() {
        driver.get("https://www.google.com");
        String titulo = driver.getTitle();
        Assertions.assertEquals("Google", titulo, "El titulo no es igual a Google");
    }
}
