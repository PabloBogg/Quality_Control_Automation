package com.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

class ApplicationTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();

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
        driver.quit();
    }
}
