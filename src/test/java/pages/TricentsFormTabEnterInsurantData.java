package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Page;

public class TricentsFormTabEnterInsurantData extends Page{
	
	Actions actions = new Actions(getDriver());

    public TricentsFormTabEnterInsurantData() {
        PageFactory.initElements(getDriver(), this);
    }
    
    @FindBy(id = "enterinsurantdata")
    protected WebElement tabEnterInsurantData;
    
    @FindBy(id = "firstname")
    protected WebElement fieldFirstName;
    
    @FindBy(id = "lastname")
    protected WebElement fieldLastName;
    
    @FindBy(id = "birthdate")
    protected WebElement fieldBirthDate;
    
    @FindBy(id = "streetaddress")
    protected WebElement fieldStreetAddress;
    
    @FindBy(id = "country")
    protected WebElement selectCountry;
    
    @FindBy(id = "zipcode")
    protected WebElement fieldZipCode;
    
    @FindBy(id = "city")
    protected WebElement fieldCity;
    
    @FindBy(id = "occupation")
    protected WebElement fieldOccupation;
    
    @FindBy(id = "website")
    protected WebElement fieldWebSite;
    
    @FindBy(id = "picture")
    protected WebElement fieldPictureName;
    
    @FindBy(id = "open")
    protected WebElement buttonPictureUpload;
    
    @FindBy(id = "nextenterproductdata")
    protected WebElement buttonNext;
    
    @FindBy(id = "preventervehicledata")
    protected WebElement buttonPrev;
    
   
    public void openTabEnterInsurantData() {
    	tabEnterInsurantData.click();
    }
    
    public void setFirstName(String firstName) {
    	fieldFirstName.sendKeys(firstName);
    }
    
    public void setLastName(String lastName) {
    	fieldLastName.sendKeys(lastName);
    }
    
    public void setBirthDate(String birthDate) {
    	fieldBirthDate.sendKeys(birthDate);
    }
    
    public void setGender(String gender) throws InterruptedException {
    	if (gender.equalsIgnoreCase("Male")) {
    		WebElement radio = getDriver().findElement(By.xpath("//input[@id='gendermale']"));
    		getDriver().findElement(By.xpath("//input[@id='gendermale']"));
    		Thread.sleep(500);
    		actions.moveToElement(radio).click().build().perform();
    	} else {
    		WebElement radio = getDriver().findElement(By.xpath("//input[@id='genderfemale']"));
    		getDriver().findElement(By.xpath("//input[@id='genderfemale']"));
    		Thread.sleep(500);
    		actions.moveToElement(radio).click().build().perform();
    	}
    }
    
    public void setStreetAddress(String streetAddress) {
    	fieldStreetAddress.sendKeys(streetAddress);
    }

    public void setSelectCountry(String country) {
    	selectCountry.sendKeys(country);
    }
    
    public void setZipCode(String zipCode) {
    	fieldZipCode.sendKeys(zipCode);
    }
    
    public void setCity(String city) {
    	fieldCity.sendKeys(city);
    }
    
    public void setOccupation(String occupation) {
    	fieldOccupation.sendKeys(occupation);
    }
    
    public void selectHobbieSpeeding() throws InterruptedException {
    	WebElement radio = getDriver().findElement(By.xpath("//input[@id='speeding']"));
		getDriver().findElement(By.xpath("//input[@id='speeding']"));
		Thread.sleep(500);
		actions.moveToElement(radio).click().build().perform();
    }
    
    public void selectHobbieBungeeJumping() throws InterruptedException {
    	WebElement radio = getDriver().findElement(By.xpath("//input[@id='bungeejumping']"));
		getDriver().findElement(By.xpath("//input[@id='bungeejumping']"));
		Thread.sleep(500);
		actions.moveToElement(radio).click().build().perform();
    }
    
    public void selectHobbieCliffDiving() throws InterruptedException {
    	WebElement radio = getDriver().findElement(By.xpath("//input[@id='cliffdiving']"));
		getDriver().findElement(By.xpath("//input[@id='cliffdiving']"));
		Thread.sleep(500);
		actions.moveToElement(radio).click().build().perform();
    }
    
    public void selectHobbieSkyDiving() throws InterruptedException {
    	WebElement radio = getDriver().findElement(By.xpath("//input[@id='skydiving']"));
		getDriver().findElement(By.xpath("//input[@id='skydiving']"));
		Thread.sleep(500);
		actions.moveToElement(radio).click().build().perform();
    }
    
    public void selectHobbieOther() throws InterruptedException {
    	WebElement radio = getDriver().findElement(By.xpath("//input[@id='other']"));
		getDriver().findElement(By.xpath("//input[@id='other']"));
		Thread.sleep(500);
		actions.moveToElement(radio).click().build().perform();
    }
    
    public void setWebSite(String webSite) {
    	fieldWebSite.sendKeys(webSite);
    }
    
    public void setPictureName(String pictureName) {
    	fieldPictureName.sendKeys(pictureName);
    }
    
    public void openPictureUpload() {
    	buttonPictureUpload.click();
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
