package com.challenge.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Driver {

    private WebDriver driver;

    public Driver(WebDriver driver, String url) {

        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        this.driver.get(url);
        this.driver.manage().window().maximize();

    }

    public void quit() {
        this.driver.quit();
    }

}
