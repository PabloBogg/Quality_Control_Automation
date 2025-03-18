package com.wikipedia;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wikipedia.Pages.WikipediaHomePages;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

class ApplicationTest {
    private WebDriver driver;
    private WikipediaHomePages home;

    @BeforeEach
    public void setUp() {
        driver = new EdgeDriver();
        home = new WikipediaHomePages(driver, "https://www.wikipedia.org/");
    }

    @AfterEach
    public void tearDown() {
        home.quit();
    }

    @Test
    public void testingSearch() {
        home.busqueda("java");
        WebDriverWait waitSearch = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitSearch.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchInput")));
        Assertions.assertEquals("java", driver.findElement(By.id("searchInput")));
        
    }
}
