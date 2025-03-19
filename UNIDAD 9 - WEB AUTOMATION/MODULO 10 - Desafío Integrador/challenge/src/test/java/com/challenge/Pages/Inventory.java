package com.challenge.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Inventory extends Driver {

    public Inventory(WebDriver driver, String url) {

        super(driver, url);

    }

    @FindBy(linkText = "Open Menu")
    WebElement desplegable;

    @FindBy(id = "logout_sidebar_link")
    WebElement logOut;

    public void logOut() {
        desplegable.click();
        logOut.click();
    }

}
