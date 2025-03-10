package com.egg;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

class ApplicationTest {

    @Test
    void shouldAnswerWithTrue() throws InterruptedException {

        // System.setProperty("webdriver.edge.driver",
        // "C:/EdgeDriver/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://www.google.com.ar/");
        driver.manage().window().maximize();

        WebElement searchBox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("APjFqb")));

        searchBox.sendKeys("egg live"+Keys.ENTER);
        //Actions action=new Actions(driver);
        //action.sendKeys(Keys.ENTER).perform();

        Thread.sleep(3000);


        driver.get("https://github.com/");

        WebElement buttonLogin=wait.until(ExpectedConditions.elementToBeClickable(By.className("Primer_Brand__Button-module__Button___lDruK")));

        buttonLogin.click();

        Thread.sleep(3000);



        driver.get("https://tiendamia.com/ar/cumple-11");

        WebElement menuDesplegable=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[onclick=\"toggleMenu();\"]")));
        menuDesplegable.click();

        WebElement menuDesplegableVisible=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("categories-dropdown")));

        Thread.sleep(3000);




        driver.quit();





        



        






        /*
         * driver.get("https://www.linkedin.com/");
         * driver.manage().window().maximize();
         * 
         * driver.findElement(By.
         * cssSelector("a[class=\"nav__button-secondary btn-secondary-emphasis btn-md\"]"
         * ));
         * 
         * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         * driver.get("https://github.com/");
         * 
         * driver.findElement(By.id("hero_user_email")).sendKeys(
         * "mailPrueba");
         * 
         * Thread.sleep(3000);
         * 
         * driver.quit();
         */

    }
}
