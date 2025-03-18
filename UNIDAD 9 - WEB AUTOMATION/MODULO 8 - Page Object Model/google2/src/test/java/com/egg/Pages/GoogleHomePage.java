package com.egg.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;

public class GoogleHomePage extends Driver {

    public GoogleHomePage(WebDriver driver, String url) {
        super(driver, url);
    }

    @FindBy(id = "APjFqb")
    private WebElement searchField;

    @FindBy(css = "input[class=\"gNO89b\"]")
    private WebElement searchButton;

    @FindBy(css = "div#search div.g")
    private WebElement searchResults;

    @FindBy(linkText = "Acceder")
    private WebElement buttonLogin;

    @FindBy(id = "identifierId")
    private WebElement campoEmail;

    @FindBy(css ="span[class=\"VfPpkd-vQzf8d\"]")
    private WebElement buttonSiguiente;


    public void toLoginPage( ){
        buttonLogin.click();
        //campoEmail.sendKeys(email);
        //buttonSiguiente.click();
    }
    
    
    
    public void search(String text) {
        searchField.sendKeys(text);

    }

    public String getInputValue() {
        return searchField.getDomAttribute("value");
    }

}