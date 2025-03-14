package com.egg;

import GoogleHomePage;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

public class ApplicationTest {

    private WebDriver driver;
    private GoogleHomePage home;

    @BeforeEach
    public void setUp() {
        //System.setProperty("webdriver.edge.driver", "C:\\EdgeDriver\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();
        home = new GoogleHomePage(driver, "http://www.google.com");
    }

    @AfterEach
    public void tearDown() {
        home.quit();
    }

    @Test
    public void testingSearch() {
        home.search("automation");
        WebDriverWait waitSearch = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitSearch.until(ExpectedConditions.titleContains("automation"));
        Assertions.assertTrue(driver.findElements(By.cssSelector("div#search div.g")).size() > 0);
    }
}
