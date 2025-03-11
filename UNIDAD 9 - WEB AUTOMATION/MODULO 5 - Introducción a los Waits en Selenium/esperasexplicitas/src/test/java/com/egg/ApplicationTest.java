package com.egg;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

class ApplicationTest {

        @Test
        void explicitWaits() throws InterruptedException {

                // Configura la ruta del driver
                WebDriver driver = new EdgeDriver();

                // Establece una espera implícita de 15 segundos.
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

                // Espera a que el cuadro de búsqueda de Google sea visible y luego introduce un
                // texto para realizar una búsqueda.
                driver.get("https://www.google.com.ar/");
                driver.manage().window().maximize();
                WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("APjFqb")));
                searchBox.sendKeys("egg live" + Keys.ENTER);// Actions action=new Actions(driver);//
                                                            // action.sendKeys(Keys.ENTER).perform();
                Thread.sleep(3000);

                // Espera a que el botón "Login" en GitHub sea clickeable antes de interactuar
                // con él.
                driver.get("https://github.com/");
                WebElement buttonLogin = wait.until(
                                ExpectedConditions.elementToBeClickable(
                                                By.className("Primer_Brand__Button-module__Button___lDruK")));
                buttonLogin.click();
                Thread.sleep(3000);

                // Espera a que el menú desplegable (como el de idiomas o categorías) de una
                // página de tu elección esté disponible.
                driver.get("https://tiendamia.com/ar/cumple-11");
                WebElement menuDesplegable = wait
                                .until(ExpectedConditions.elementToBeClickable(
                                                By.cssSelector("div[onclick=\"toggleMenu();\"]")));
                menuDesplegable.click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("categories-dropdown")));
                Thread.sleep(3000);
                driver.quit();

        }
}