package com.egg;

public class Driver {

    private WebDriver driver;

    public Driver(WebDriver driver, String url) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        this.driver.manage().window().maximize();
        this.driver.get(url);
    }

    public String getTitle() {
        return this.driver.getTitle();
    }

    public void quit() {
        this.driver.quit();
    }

}