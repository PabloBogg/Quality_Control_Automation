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

        // ---Actividad: Localización por etiqueta + id---
        /*
         * Analiza la interfaz de Google e identifica el cuadro de búsqueda con el
         * atributo id.
         * 
         * Modifica el script anterior para que, de forma automática:
         * 
         * Navegue a la página de Google.
         * 
         * Localice el cuadro de búsqueda utilizando el método findElement con el
         * selector CSS de etiqueta + id.
         * 
         * Luego, escribe el texto "hello world" en el cuadro de búsqueda usando el
         * método sendKeys.
         * 
         * Al ejecutar el programa, asegúrate de que:
         * 
         * El navegador se abre automáticamente.
         * 
         * La búsqueda se realiza correctamente..
         */

        /*
         * try {
         * 
         * driver.get("https://www.google.com.ar/");
         * Thread.sleep(3000); // Espera
         * driver.manage().window().maximize();
         * Thread.sleep(3000); // Espera
         * 
         * // Buscador
         * WebElement buscador = driver.findElement(By.cssSelector("textarea#APjFqb"));
         * Thread.sleep(1000); // Espera
         * buscador.click();
         * Thread.sleep(1000); // Espera
         * buscador.sendKeys("Hola mundo!");
         * 
         * // Buscar
         * WebElement buscar =
         * driver.findElement(By.cssSelector("input[value=\"Buscar con Google\"]"));
         * buscar.click();
         * Thread.sleep(1000); // Espera
         * 
         * } catch (InterruptedException e) {
         * e.printStackTrace();
         * } finally {
         * 
         * }
         * 
         */
        // -----------------------------------------------------
        // ---Actividad: Localización por etiqueta + clase---
        /*
         * Al ejecutar el programa, asegúrate de que el navegador se abra
         * automáticamente y se realicen las operaciones programadas.
         * 
         * Modifica el script anterior para que de forma automática:
         * 
         * Después de escribir en el cuadro de búsqueda, navegue hacia la página de
         * TiendaMia (elige la URL correspondiente a tu país).
         * 
         * Maximice la ventana del navegador.
         * 
         * Localiza el primer enlace en la barra de navegación en la página de inicio de
         * TiendaMia que diga “Ofertas de la semana” usando el método findElement con el
         * selector CSS de etiqueta + clase.
         * 
         * Haz clic en el enlace encontrado utilizando el método click.
         * 
         * Al ejecutar el programa, asegúrate de que:
         * 
         * El navegador se abre automáticamente.
         * 
         * Las operaciones programadas se realizan correctamente.
         */

        try {

            driver.get("https://tiendamia.com/ar/");
            Thread.sleep(3000); // Espera
            driver.manage().window().maximize();
            Thread.sleep(3000); // Espera

            // Cerrar la ventana emergente
            driver.findElement(By.cssSelector(".modal-body:nth-child(2) > .close")).click();
            Thread.sleep(1000); // Espera

            // Despeglar menu
            driver.findElement(By.cssSelector(".dropdown > span:nth-child(1)")).click();
            Thread.sleep(1000); // Espera

            // Ofertas de la semana
            driver.findElement(By.cssSelector("a[href=\"https://tiendamia.com/ar/ofertas-de-la-semana\"]")).click();
            Thread.sleep(1000); // Espera

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            

        }

        // -----------------------------------------------------
        // ---Actividad: Localización por etiqueta + atributo---
        /*
         * Modifica el script anterior para que de forma automática:
         * 
         * Luego de hacer clic en “Ofertas de la semana”, navegue hacia Google.
         * 
         * Localiza el botón "Acceder" en la página de inicio de GMAIL utilizando el
         * atributo target en el selector CSS.
         * 
         * Usa el método findElement para localizarlo y click para hacer clic en él.
         * 
         * Al ejecutar el programa, asegúrate de que:
         * 
         * El navegador se abre automáticamente.
         * 
         * Las operaciones programadas se realizan correctamente.
         */

        try {

            driver.get("https://www.google.com.ar/");
            Thread.sleep(2000); // Espera

            // Boton acceder
            WebElement botonGmail = driver.findElement(By.cssSelector("a[target=\"_top\"]"));
            botonGmail.click();
            Thread.sleep(1000); // Espera

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            
            
        }

        // -----------------------------------------------------
        // ---Actividad: Localización por etiqueta + clase + atributo---

        /*
         * Modifica el script anterior para que de forma automática, luego de dar clic
         * en el login, navegue hacia LinkedIn .
         * 
         * Localiza el campo de contraseña en la página de inicio de LinkedIn utilizando
         * una combinación de etiqueta, clase y atributo (en este caso, el atributo
         * autocomplete), y luego escribe el texto "hello" (usando los métodos
         * findElement y sendKeys).
         * 
         * Al ejecutar el programa, asegúrate de que el navegador se abre
         * automáticamente y realiza las operaciones según lo programado.
         */

         try {

            driver.get("https://www.linkedin.com/checkpoint/rm/sign-in-another-account?rmDisableAutoLogin=true&midToken=AQEnKE1Gl82OFw");
            Thread.sleep(2000); // Espera

            // Campo contraseña
            WebElement contraseña = driver.findElement(By.cssSelector("input[autocomplete=\"current-password\"]"));
            contraseña.click();
            Thread.sleep(1000); // Espera
            contraseña.sendKeys("1234");
            Thread.sleep(1000); // Espera
            Thread.sleep(1000); // Espera

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Cerrar el navegador
            driver.quit();
        }

    }
}
