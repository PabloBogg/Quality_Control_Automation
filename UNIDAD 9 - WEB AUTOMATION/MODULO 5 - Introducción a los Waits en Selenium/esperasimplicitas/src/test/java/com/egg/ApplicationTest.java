package com.egg;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

class ApplicationTest {

        @Test
        void shoImplicitWaits() throws InterruptedException {

                // Configura la ruta del driver
                WebDriver driver = new EdgeDriver();

                /*
                 * Navegación hacia LinkedIn: Agrega una espera de 15 segundos para que el botón
                 * "Iniciar Sesión" de LinkedIn cargue correctamente. Utiliza el método de
                 * selección que consideres más adecuado para localizar este botón y realizar el
                 * clic.
                 */
                driver.get("https://www.linkedin.com/");
                driver.manage().window().maximize();
                driver.findElement(By.cssSelector("a[class=\"nav__button-secondary btn-secondary-emphasis btn-md\"]"));

                /*
                 * Navegación hacia GitHub: Luego, navega hacia GitHub y establece una espera de
                 * 25 segundos para que el campo de entrada del correo electrónico cargue.
                 * Completa el campo con el valor “mailPrueba”. Ten en cuenta que la espera
                 * implícita afecta a todas las búsquedas posteriores a su declaración. Por lo
                 * tanto, si previamente estableciste una espera de 15 segundos, deberás
                 * modificarla para que aplique los 25 segundos de espera.
                 */
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
                driver.get("https://github.com/");
                driver.findElement(By.id("hero_user_email")).sendKeys(
                                "mailPrueba");
                Thread.sleep(3000);

                /*
                 * Navegación hacia Wikipedia: Dirígete a Wikipedia y realiza una búsqueda
                 * utilizando el campo de entrada correspondiente.
                 */

                driver.quit();

        }

        @Test
        void testMain() {
                
        }
}
