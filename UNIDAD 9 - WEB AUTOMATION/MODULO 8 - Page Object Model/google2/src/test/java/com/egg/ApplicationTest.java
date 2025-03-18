package com.egg;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.egg.Pages.GoogleHomePage;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class ApplicationTest {

    private WebDriver driver;
    private GoogleHomePage home;

    @BeforeEach
    public void setUp() {
        driver = new EdgeDriver();
        home = new GoogleHomePage(driver, "http://www.google.com");
    }

    @AfterEach
    public void tearDown() {
        home.quit();
    }

    
    @Test
    public void testingTitle(){
        Assertions.assertEquals("Google", home.getTitle());
    }

    @Test
    public void testingSearch1(){
        WebElement input=driver.findElement(By.cssSelector("textarea#APjFqb"));
        Assertions.assertEquals("", input.getDomAttribute("value"));
    }


    //@Test
    //public void testingSearch2() {

        // Espera a que el cuadro de búsqueda de Google sea visible y luego introduce un
        // texto para realizar una búsqueda.  

        // Establece una espera implícita de 15 segundos.
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
       // WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("APjFqb")));
        //searchBox.sendKeys("egg live" + Keys.ENTER);
    //}

    @Test
    public void testingSearch2() {
        home.search("automation");
        WebDriverWait waitSearch = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitSearch.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class=\"aajZCb\"]")));
        Assertions.assertNotEquals("",driver.findElements(By.cssSelector("div[class=\"aajZCb\"]")));
    }

    @Test
    public void testingLogin() throws InterruptedException {
        home.toLoginPage();
        Thread.sleep(3000);
        WebDriverWait waitLogin = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitLogin.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));
        WebElement campoEmail = driver.findElement(By.id("identifierId"));
        Assertions.assertEquals("",campoEmail.getDomAttribute("value"));

    }


}
