package com.egg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Application {

    public static void main(String[] args) {

        // Configura la propiedad del sistema para el driver de Edge
        System.setProperty("webdriver.edge.driver", "C:/EdgeDriver/edgedriver_win64/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        // 1 - Abrir el navegador y navegar a la página de inicio de Google.
        driver.get("https://www.wikipedia.org/");

        // 2 - Maximizar la ventana del navegador para tener una vista completa de los
        // elementos en la página.
        driver.manage().window().maximize();

        WebElement prueba_id_1 = driver.findElement(By.id("js-lang-list-button"));
        prueba_id_1.click();

        WebElement prueba_id_2 = driver.findElement(By.id("searchInput"));
        prueba_id_2.sendKeys("java");

        WebElement lupa_1 = driver.findElement(By.className("sprite svg-search-icon"));
        WebElement lupa = driver.findElement(By.xpath("//button[contains(@class, 'svg-search-icon')]"));
        WebElement prueba_className_3 = driver.findElement(By.cssSelector(".pure-form > input[type='submit']"));
        prueba_className_3.click();
        lupa.click();

    }
}
