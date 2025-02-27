package com.actividad1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Main {
    public static void main(String[] args) {


    // Configura la propiedad del sistema para el driver de Edge
    System.setProperty("webdriver.edge.driver", "C:/EdgeDriver/edgedriver_win64/msedgedriver.exe");
    //Crea una instancia del WebDriver que utilizarás:
    WebDriver driver = new EdgeDriver();

    //Usa el método get de la instancia del WebDriver para abrir el navegador y redirigirlo automáticamente a la URL deseada:
    driver.get("https://www.google.com");

    //Actividad: Navegar hacia otras páginas
    driver.navigate().to("https://openai.com/");
    driver.navigate().to("https://github.com/");
    driver.navigate().back();

    //Actividad: Minimizar y maximizar la ventana del navegador
    

    //Recuerda cerrar el navegador una vez que hayas completado las acciones previstas en tu script:
    driver.quit();

    }
}