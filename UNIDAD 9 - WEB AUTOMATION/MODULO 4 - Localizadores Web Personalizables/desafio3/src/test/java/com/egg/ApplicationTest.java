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

        /*
         * Accede a LinkedIn y navega hasta tu perfil. Si no tienes un perfil, puedes
         * iniciar sesión en cualquier otra página donde necesites ingresar tus
         * credenciales. Localiza los campos de entrada para usuario y contraseña
         */

        try {
            driver.get("https://ar.linkedin.com/");
            Thread.sleep(1000); // Espera
            driver.manage().window().maximize();
            Thread.sleep(1000); // Espera

            // Iniciar secion
            WebElement iniciarSecion = driver
                    .findElement(By.cssSelector("a[class=\"nav__button-secondary btn-secondary-emphasis btn-md\"]"));
            iniciarSecion.click();
            Thread.sleep(1000); // Espera

            // Usuario
            WebElement usuario = driver.findElement(By.id("username"));
            usuario.click();
            usuario.sendKeys("usuario@hotmail.com");
            Thread.sleep(1000); // Espera

            // Clave
            WebElement clave = driver.findElement(By.id("password"));
            clave.click();
            clave.sendKeys("1234");
            Thread.sleep(1000); // Espera

            // Boton Iniciar Secion
            WebElement boton = driver
                    .findElement(By.cssSelector("button[class=\"btn__primary--large from__button--floating\"]"));
            boton.click();
            Thread.sleep(1000); // Espera

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {

        }

        /* Navegar a una lista de reproducción en YouTube. */

        try {
            driver.get("https://www.youtube.com/");
            Thread.sleep(1000); // Espera

            // Buscar lista
            WebElement buscador = driver
                    .findElement(By.cssSelector("input[name=\"search_query\"]"));
            buscador.click();
            Thread.sleep(1000); // Espera
            buscador.sendKeys("que hacer con los pesos");
            Thread.sleep(1000); // Espera
            WebElement lupa = driver
                    .findElement(By.cssSelector(
                            "button[class=\"ytSearchboxComponentSearchButton ytSearchboxComponentSearchButtonDark\"]"));
            lupa.click();
            Thread.sleep(1000); // Espera

            // Seleccionar video
            WebElement video = driver
                    .findElement(By.cssSelector(
                            "img[src=\"https://i.ytimg.com/vi/bkqyQQ3B4v8/hqdefault.jpg?sqp=-oaymwEcCOADEI4CSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLChpSP0EW9VSym0uWgEIS5yjfe38w\"]"));
            video.click();
            Thread.sleep(10000); // Espera

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {

        }

        /*
         * Navegar a Amazon, realizar una búsqueda y luego filtrar los resultados por
         * una categoría específica.
         */

         try {
            driver.get("https://www.amazon.com/-/es/");
            Thread.sleep(1000); // Espera

            // Buscar lista
            

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {

        }


    }
}
