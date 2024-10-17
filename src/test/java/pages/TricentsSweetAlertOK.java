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

    public boolean isTabSelected() throws InterruptedException {
    	WebElement sweetAlert = getDriver().findElement(By.className("sweet-alert showSweetAlert visible"));
    	
    	if(sweetAlert.isDisplayed()) {
    		System.out.println("O SweetAlert foi exibido com sucesso!");
    	}
    	
    	Thread.sleep(5000);
    	return getDriver().findElement(By.className("sweet-alert showSweetAlert visible")).isDisplayed();
    }
    
//	public void setSelectUltimate() throws InterruptedException {
//		Boolean isPresent = getDriver().findElement(By.xpath("//input[@class='la-ball-fall']")).isEnabled();
//		if(isPresent) {
//			WebElement radio = getDriver().findElement(By.xpath("//input[@class='la-ball-fall']"));
//			getDriver().findElement(By.xpath("//input[@id='la-ball-fall']"));
//			Thread.sleep(1000);
//			actions.moveToElement(radio).click().build().perform();	
//		}
//	}
}
