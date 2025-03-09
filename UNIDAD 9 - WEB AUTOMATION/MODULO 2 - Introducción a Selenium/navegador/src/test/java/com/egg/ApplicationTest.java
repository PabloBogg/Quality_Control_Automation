package com.egg;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;



class ApplicationTest {

    @Test
    void navegador() {
    // Configura la propiedad del sistema para el driver de Chrome
    System.setProperty("webdriver.edge.driver", "C:/EdgeDriver/edgedriver_win64/msedgedriver.exe");

    // Crea una instancia del WebDriver que utilizarás.
    WebDriver driver = new EdgeDriver();

    // Usa el método get de la instancia del WebDriver para abrir el navegador y redirigirlo automáticamente a la URL deseada:
    driver.get("https://www.google.com");

    // Recuerda cerrar el navegador una vez que hayas completado las acciones previstas en tu script:
    driver.quit();


    }
}
