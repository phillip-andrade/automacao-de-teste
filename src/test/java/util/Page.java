package util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

    private WebDriver driver = null;

    public Page() {
        driver = TestRule.getDriver();
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return driver;
    }
    
	public WebDriverWait getDriverWait() {
	    WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return  driverWait;
	}

}