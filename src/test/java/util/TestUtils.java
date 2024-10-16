package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestUtils {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    private static void setDriver() {
        String path = "/automacao-de-teste/src/test/resources/drivers/";
        if(System.getProperty("os.name").contains("Windows")) {
            path = path + "chromedriver.exe";
        } 
//        else {
//            path = "/Users/raphael/Documents/temp/teste-selenium/teste-selenium/src/test/resources/drivers/" + "chromedriver_mac";
//        }
        System.setProperty("webdriver.chrome.driver", path);
    }

    public static void openBrowserChrome(String url){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        setDriver();

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }

}