package com.dropdowns;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import com.dropdowns.Pages.HomePage;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class ApplicationTest {

    private WebDriver driver;
    private HomePage home;

    @BeforeEach
    public void setUp() {
        driver = new EdgeDriver();
        String url = "https://getbootstrap.com/docs/4.3/components/dropdowns/";
        home = new HomePage(driver, url);

    }

    @AfterEach
    public void tearDown() {
        home.quit();
    }

    @Test
    void testingDropdown() {
        // Cambiar al iframe que contiene el desplegable
        //driver.switchTo().frame("iframeResult");

        // Hacer click en el boton
        WebElement boton = driver.findElement(By.id("dropdownMenuButton"));
        boton.click();

        // Localizar el dropdown y crear un objeto Select
        Select dropdown = new Select(driver.findElement(By.cssSelector("div[aria-labelledby=\"dropdownMenuButton\"]")));
        

        // Cambiar opción y probar
        dropdown.selectByIndex(0);
        String selectedOption = dropdown.getFirstSelectedOption().getText();
        assert selectedOption.equals("Action");

    }
}
