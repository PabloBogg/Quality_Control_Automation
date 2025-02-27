package com.desafio1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) {

        // Configura la propiedad del sistema para el driver de Edge
        System.setProperty("webdriver.edge.driver", "C:/EdgeDriver/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        try {
            // 1 - Abrir el navegador y navegar a la página de inicio de Google.
            driver.get("https://www.google.com");

            // Espera de 3 segundos
            Thread.sleep(3000);

            // 2 - Maximizar la ventana del navegador para tener una vista completa de los elementos en la página.
            driver.manage().window().maximize();

            // Espera de 3 segundos
            Thread.sleep(3000);

            // 3 - Navegar a la página de inicio de OpenAI.
            driver.navigate().to("https://openai.com/");

            // Espera de 3 segundos
            Thread.sleep(3000);

            // 4 - Reducir la ventana del navegador a la mitad de su tamaño y centrarla en la pantalla.
            driver.manage().window().setSize(new Dimension(800, 600));
            driver.manage().window().setPosition(new Point(400, 200));

            // Espera de 3 segundos
            Thread.sleep(3000);

            // 5 - Navegar a la página de inicio de Wikipedia.
            driver.navigate().to("https://www.wikipedia.org/");

            // Espera de 3 segundos
            Thread.sleep(3000);

            // 6 - Cambiar el tamaño de la ventana del navegador a su tamaño original.
            driver.manage().window().maximize();

            // Espera de 3 segundos
            Thread.sleep(3000);

            // 7 - Cerrar el navegador.
            driver.quit();

        } catch (InterruptedException e) {
            e.printStackTrace();}
    }
}