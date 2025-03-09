package com.egg;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

class ApplicationTest {

    @Test
    void shouldAnswerWithTrue() {
        // Configura la propiedad del sistema para el driver de Edge
        System.setProperty("webdriver.edge.driver", "C:/EdgeDriver/edgedriver_win64/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        try {

            // ---Actividad: Localización por Id---
            /*
             * Explora Wikipedia e identifica tres elementos con el atributo id.
             * Modifica el script anterior para que, de forma automática:
             * - Navegue a Wikipedia.
             * - Realice clic en los elementos identificados.
             * - (Opcional) Utiliza la función de retroceso en el navegador.
             * Ejecuta el programa y verifica que:
             * - Se abre el navegador automáticamente
             * - Se realicen correctamente las operaciones programadas.
             * - Finaliza cerrando el navegador.
             * 
             * 
             * 
             * driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
             * Thread.sleep(2000); // Espera de 3 segundos
             * driver.manage().window().maximize();
             * Thread.sleep(2000); // Espera de 3 segundos
             * 
             * WebElement menuPrincipal_id_1 =
             * driver.findElement(By.id("vector-main-menu-dropdown-checkbox"));
             * menuPrincipal_id_1.click();
             * Thread.sleep(2000); // Espera de 3 segundos
             * 
             * WebElement herramientas_id_2 =
             * driver.findElement(By.id("vector-page-tools-dropdown-checkbox"));
             * herramientas_id_2.click();
             * Thread.sleep(2000); // Espera de 3 segundos
             * 
             * WebElement masOpciones_id_3 =
             * driver.findElement(By.id("vector-user-links-dropdown-checkbox"));
             * masOpciones_id_3.click();
             * Thread.sleep(2000); // Espera de 3 segundos
             * 
             * driver.close();
             */

            // ---Actividad: Localización por name---
            /*
             * Modifica el script anterior para que, de forma automática:
             * - Haga clic en uno de los elementos localizados por Name.
             * - Navegue a GitHub.
             * - Localice un campo de entrada de texto por Name.
             * - Escriba un texto en el campo localizado (usando sendKeys).
             * - Ejecuta el programa y verifica que:
             * - Se abre el navegador automáticamente.
             * - Se realicen correctamente las operaciones programadas.
             * - Finaliza cerrando el navegador.
             * 
             * 
             * driver.get("https://github.com/login");
             * Thread.sleep(2000); // Espera de 3 segundos
             * driver.manage().window().maximize();
             * Thread.sleep(2000); // Espera de 3 segundos
             * 
             * WebElement login = driver.findElement(By.name("login"));
             * login.click();
             * Thread.sleep(2000); // Espera de 3 segundos
             * login.sendKeys("Nombre de Usuario");
             * Thread.sleep(2000); // Espera de 3 segundos
             * driver.close();
             */

            // ---Actividad: Localización por linkTest---
            /*
             * Modifica el script anterior para que, de forma automática:
             * - Haga clic en el botón de inicio de sesión (usando findElement y click).
             * - Ejecuta el programa y asegúrate de que:
             * - El navegador se abre automáticamente.
             * - Las acciones programadas se realizan correctamente.
             * - Finaliza cerrando el navegador
             */
            driver.get("https://github.com");
            Thread.sleep(2000); // Espera de 3 segundos
            driver.manage().window().maximize();
            Thread.sleep(2000); // Espera de 3 segundos
            driver.findElement(By.linkText("Sign in")).click();
            Thread.sleep(2000); // Espera de 3 segundos
            driver.close();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Cerrar el navegador
            driver.quit();
        }

    }
}
