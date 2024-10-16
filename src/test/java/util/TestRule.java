package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestRule {

	private static WebDriver driver;

	public static WebDriver getDriver() {

		if(driver == null) {
			String path = "C:\\Users\\Phillip Andrade\\eclipse-workspace\\desafioSelenium\\automacao-de-teste\\src\\test\\resources\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);

			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("start-maximized");

			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
		}

		return driver;
	}


	public static void openBrowserChrome(String url)  {
		driver.navigate().to(url);
	}
}