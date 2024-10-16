package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Page;

public class TricentsFormTabEnterProductData extends Page{
	
	Actions actions = new Actions(getDriver());

    public TricentsFormTabEnterProductData() {
        PageFactory.initElements(getDriver(), this);
    }
    
    @FindBy(id = "enterproductdata")
    protected WebElement tabEnterProductData;
    
    @FindBy(id = "startdate")
    protected WebElement fieldStartDate;
    
    @FindBy(id = "insurancesum")
    protected WebElement selectdInsuranceSum;
    
    @FindBy(id = "meritrating")
    protected WebElement selectMeritRating;
    
    @FindBy(id = "damageinsurance")
    protected WebElement selectDamageInsurance;
    
    @FindBy(id = "courtesycar")
    protected WebElement selectCourtesyCar;
    
    @FindBy(id = "nextselectpriceoption")
    protected WebElement buttonNext;
    
    @FindBy(id = "preventerinsurancedata")
    protected WebElement buttonPrev;
    

    public void openTabEnterProductData() {
    	tabEnterProductData.click();
    }
    
    public void setStartDate(String startDate) {
    	fieldStartDate.sendKeys(startDate);
    }
    
    public void setInsuranceSum(String insuranceSum) {
    	selectdInsuranceSum.sendKeys(insuranceSum);
    }
    
    public void setMeritRating(String meritRating) {
    	selectMeritRating.sendKeys(meritRating);
    }
    
    public void setDamageInsurance(String damageInsurance) {
    	selectDamageInsurance.sendKeys(damageInsurance);
    }
    
    public void setEuroProtection() throws InterruptedException {
    	WebElement radio = getDriver().findElement(By.xpath("//input[@id='EuroProtection']"));
		getDriver().findElement(By.xpath("//input[@id='EuroProtection']"));
		Thread.sleep(500);
		actions.moveToElement(radio).click().build().perform();
    }
    
    public void setLegalDefenseInsurance() throws InterruptedException {
    	WebElement radio = getDriver().findElement(By.xpath("//input[@id='LegalDefenseInsurance']"));
		getDriver().findElement(By.xpath("//input[@id='LegalDefenseInsurance']"));
		Thread.sleep(500);
		actions.moveToElement(radio).click().build().perform();
    }
    
    public void setCourtesyCar(String courtesyCar) {
    	selectCourtesyCar.sendKeys(courtesyCar);
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
