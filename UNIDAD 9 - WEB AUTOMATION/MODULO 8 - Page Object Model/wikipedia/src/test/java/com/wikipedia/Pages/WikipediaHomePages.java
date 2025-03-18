package com.wikipedia.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WikipediaHomePages extends Driver {

    public WikipediaHomePages(WebDriver driver, String url) {
        super(driver, url);
    }

    @FindBy (id="searchInput")
    private WebElement barraBusqueda;

    public void busqueda(String text){
        barraBusqueda.sendKeys(text);
    }

}
//@FindBy (css="button[onclick=\"myFunction()\"]")
