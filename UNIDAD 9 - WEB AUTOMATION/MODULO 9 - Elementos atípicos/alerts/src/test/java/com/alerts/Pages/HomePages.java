package com.alerts.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePages extends Driver {

    public HomePages(WebDriver driver, String url) {
        super(driver, url);
    }

    @FindBy(css = "button")
    private WebElement botonTriIt;

    public void clickBotonTriIt() {
        botonTriIt.click();
        
    }

}