package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import util.Page;

public class TricentsSweetAlertOK extends Page{
	
	Actions actions = new Actions(getDriver());

	public TricentsSweetAlertOK() {
		PageFactory.initElements(getDriver(), this);
	}

    public String getAlertMessage() throws InterruptedException {
		By css = By.cssSelector(".sweet-alert h2");
		WebElement element = getDriver().findElement(css );
        return element.getText();
    }
}