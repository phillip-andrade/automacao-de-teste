package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page {

    private WebDriver driver = null;

    public Page() {
        driver = TestRule.getDriver();
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return driver;
    }

}