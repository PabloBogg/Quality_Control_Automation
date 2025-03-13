package com.egg;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;




class ApplicationTest {

    @Test
    void shouldAnswerWithTrue() {

        WebDriver driver = new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.google.com.ar/");
        driver.manage().window().maximize();

        String correo="";
        String clave="prueba@gmail.com";


        driver.get("https://github.com/login");

        WebElement campoEmail = driver.findElement(By.id("login_field"));
        campoEmail.sendKeys(correo);

        WebElement campoContrasenia=driver.findElement(By.id("password"));
        campoContrasenia.sendKeys(clave);
     
        WebElement boton=driver.findElement(By.cssSelector("input[class=\"btn btn-primary btn-block js-sign-in-button\"]"));
        
              
        if(boton.isEnabled()){
            boton.click();
            System.out.println("Se inicia secion correctamente.");
        }else{
            System.out.println("Es necesario completar los campos email y Clave");
        }

        driver.quit();


    }
}


