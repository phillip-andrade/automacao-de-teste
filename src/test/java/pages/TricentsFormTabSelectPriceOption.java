package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Page;

public class TricentsFormTabSelectPriceOption extends Page{

	Actions actions = new Actions(getDriver());

	public TricentsFormTabSelectPriceOption() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "selectpriceoption")
	protected WebElement tabSelectPriceOption;

	@FindBy(id = "viewquote")
	protected WebElement selectViewQuote;

	@FindBy(id = "downloadquote")
	protected WebElement selectDownloadQuote;

	@FindBy(id = "nextsendquote")
	protected WebElement buttonNext;

	@FindBy(id = "preventerproductdata")
	protected WebElement buttonPrev;


	public void openTabSelectPriceOption() {
		tabSelectPriceOption.click();
	}

	public void setSelectSilver() throws InterruptedException {
		WebElement radio = getDriver().findElement(By.xpath("//input[@id='selectsilver']"));
		getDriver().findElement(By.xpath("//input[@id='selectsilver']"));
		Thread.sleep(500);
		actions.moveToElement(radio).click().build().perform();
	}

	public void setSelectGold() throws InterruptedException {
		WebElement radio = getDriver().findElement(By.xpath("//input[@id='selectgold']"));
		getDriver().findElement(By.xpath("//input[@id='selectgold']"));
		Thread.sleep(3000);
		actions.moveToElement(radio).click().build().perform();
	}

	public void setSelectPlatinum() throws InterruptedException {
		WebElement radio = getDriver().findElement(By.xpath("//input[@id='selectplatinum']"));
		getDriver().findElement(By.xpath("//input[@id='selectplatinum']"));
		Thread.sleep(3000);
		actions.moveToElement(radio).click().build().perform();	
	}

	public void setSelectUltimate() throws InterruptedException {
		WebElement radio = getDriver().findElement(By.xpath("//input[@id='selectultimate']"));
		getDriver().findElement(By.xpath("//input[@id='selectultimate']"));
		Thread.sleep(3000);
		actions.moveToElement(radio).click().build().perform();	
	}

	public void selectViewQuote() {
		selectViewQuote.click();
	}

	public void selectDownloadQuote() {
		selectDownloadQuote.click();
	}

	public void clickNext() throws InterruptedException {
		Thread.sleep(1000);
		buttonNext.click();
	}

	public void clickPrev() throws InterruptedException {
		Thread.sleep(1000);
		buttonPrev.click();
	}
}
