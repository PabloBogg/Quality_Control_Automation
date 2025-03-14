package com.egg;

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