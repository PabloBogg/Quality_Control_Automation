package com.egg.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage extends Driver {

    public GoogleHomePage(WebDriver driver, String url) {
        super(driver, url);
    }

    @FindBy(id = "searchField")
    private WebElement searchField;

    @FindBy(css = "button#search")
    private WebElement searchButton;

    public void search(String text) {
        searchField.sendKeys(text);
        searchButton.click();
    }
}