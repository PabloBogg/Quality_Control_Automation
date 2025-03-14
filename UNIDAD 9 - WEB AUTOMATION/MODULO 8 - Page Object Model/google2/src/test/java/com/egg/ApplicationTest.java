package com.egg;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
        // System.setProperty("webdriver.edge.driver",
        // "C:\\EdgeDriver\\edgedriver_win64\\msedgedriver.exe");
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
