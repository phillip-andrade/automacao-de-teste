package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Page;

public class TricentsFormTabEnterProductData extends Page{
	
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
    
    @FindBy(id = "EuroProtection")
    protected WebElement selectEuroProtection;
    
    @FindBy(id = "LegalDefenseInsurance")
    protected WebElement selectLegalDefenseInsurance;
    
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
    
    public void setEuroProtection() {
    	WebDriverWait wait = getDriverWait();
    	WebElement radio = getDriver().findElement(By.id("EuroProtection"));
		wait.until(ExpectedConditions.elementToBeClickable(radio));
		radio.click();
//    	selectEuroProtection.click();
    }
    
    public void setLegalDefenseInsurance() {
    	WebDriverWait wait = getDriverWait();
    	WebElement radio = getDriver().findElement(By.id("LegalDefenseInsurance"));
		wait.until(ExpectedConditions.elementToBeClickable(radio));
		radio.click();
//    	selectLegalDefenseInsurance.click();
    }
    
    public void setCourtesyCar(String courtesyCar) {
    	selectCourtesyCar.sendKeys(courtesyCar);
    }
    
    public void clickNext() {
    	buttonNext.click();
    }
    
    public void clickPrev() {
    	buttonPrev.click();
    }
}
