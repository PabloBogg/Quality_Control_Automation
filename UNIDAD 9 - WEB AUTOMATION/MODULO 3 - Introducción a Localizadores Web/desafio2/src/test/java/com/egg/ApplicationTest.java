package com.egg;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

class ApplicationTest {

    @Test
    void integradora() {
        // Configura la propiedad del sistema para el driver de Edge
        System.setProperty("webdriver.edge.driver", "C:/EdgeDriver/edgedriver_win64/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        /*
         * Operaciones a Realizar: Paso 1: Iniciar Sesión en un Proveedor de Correo
         * Electrónico
         * 
         * Abre el navegador y accede a tu proveedor de correo electrónico (Gmail,
         * Hotmail, etc.).
         * 
         * Localiza los campos de usuario y contraseña e ingresa tus credenciales para
         * iniciar sesión.
         */

        try {

            driver.get(
                    "https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=ASSHyko6w88Npr7DC-lyBQFUhVe3aKSl024OgfuCGs9wOQltM77TZ7EszKamK-03PKHtzWv1v8Ra9A&ddm=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
            Thread.sleep(2000);

            driver.manage().window().maximize();
            Thread.sleep(2000);

            WebElement correo = driver.findElement(By.id("identifierId"));
            correo.click();
            correo.sendKeys("boggetti939@gmail.com");
            Thread.sleep(2000);

            WebElement siguiente = driver.findElement(By.cssSelector(".VfPpkd-LgbsSe-OWXEXe-k8QpJ > .VfPpkd-vQzf8d"));
            siguiente.click();
            Thread.sleep(2000);

            /*
             * Paso 2: Navegar hacia Wikipedia
             * 
             * Navega hacia la página principal de Wikipedia.
             * 
             * Paso 3: Buscar y Hacer Clic en un Elemento Químico
             * 
             * Utiliza la barra de búsqueda de Wikipedia para buscar un elemento químico de
             * tu preferencia.
             * 
             * Haz clic en el primer enlace que aparezca relacionado con el elemento químico
             * buscado.
             */

            driver.get("https://www.wikipedia.org/");
            Thread.sleep(2000);

            WebElement busqueda = driver.findElement(By.id("searchInput"));
            busqueda.click();
            busqueda.sendKeys("Elemento Químico");
            Thread.sleep(2000);

            WebElement lupa = driver.findElement(By.cssSelector(".svg-search-icon"));
            lupa.click();
            Thread.sleep(2000);

            /*
             * Paso 4: Navegar hacia el Diccionario de la Real Academia Española (RAE)
             * 
             * Navega a la página del Diccionario de la RAE: .
             * 
             * Paso 5: Consultar el Significado de una Palabra
             * 
             * Localiza el campo de búsqueda por su atributo name y escribe una palabra para
             * buscar su significado utilizando sendKeys.
             * 
             * Haz clic en el botón "Consultar" utilizando findElement y click para obtener
             * el significado.
             */
            driver.get("https://dle.rae.es/");
            Thread.sleep(2000);

            WebElement buscador = driver.findElement(By.id("w"));
            buscador.click();
            buscador.sendKeys("selenio");
            Thread.sleep(2000);

            WebElement lupa2 = driver.findElement(By.cssSelector(".c-site-search__search-box .c-button"));
            lupa2.click();
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Cerrar el navegador
            driver.quit();
        }

    }
}
