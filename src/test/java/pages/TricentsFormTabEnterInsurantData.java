package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Page;

public class TricentsFormTabEnterInsurantData extends Page{
	
	WebDriverWait wait = getDriverWait();

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
    
    @FindBy(id = "gendermale")
    protected WebElement selectGenderMale;
    
    @FindBy(id = "genderfemale")
    protected WebElement selectGenderFamale;
    
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
    
    @FindBy(id = "speeding")
    protected WebElement selectdHobbieSpeeding;
    
    @FindBy(id = "bungeejumping")
    protected WebElement selectHobbieBungeeJumping;
    
    @FindBy(id = "cliffdiving")
    protected WebElement selectHobbieCliffDiving;
    
    @FindBy(id = "skydiving")
    protected WebElement selectHobbieSkyDiving;
    
    @FindBy(id = "other")
    protected WebElement selectHobbieOther;
    
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
    
//    public void setGenderMale() {
//    	WebElement radio = getDriver().findElement(By.xpath("gendermale"));
//		wait.until(ExpectedConditions.elementToBeClickable(radio));
//		radio.click();
//    	selectGenderMale.click();
//    }
//   
//    public void setGenderFamele() {
//    	selectGenderFamale.click();
//    }
    
    public void setGender(String gender) {
    	if (gender.equalsIgnoreCase("Male")) {
    		WebElement radio = getDriver().findElement(By.id("gendermale"));
//    		wait.until(ExpectedConditions.elementToBeClickable(radio));
    		radio.click();
    		
    	} else {
    		WebElement radio = getDriver().findElement(By.id("genderfemale"));
//    		wait.until(ExpectedConditions.elementToBeClickable(radio));
    		radio.click();

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
    
    public void selectHobbieSpeeding() {
    	WebDriverWait wait = getDriverWait();
    	WebElement radio = getDriver().findElement(By.id("speeding"));
		wait.until(ExpectedConditions.elementToBeClickable(radio));
		radio.click();
//    	selectdHobbieSpeeding.click();
    }
    
    public void selectHobbieBungeeJumping() {
    	WebDriverWait wait = getDriverWait();
    	WebElement radio = getDriver().findElement(By.id("bungeejumping"));
		wait.until(ExpectedConditions.elementToBeClickable(radio));
		radio.click();
//    	selectHobbieBungeeJumping.click();
    }
    
    public void selectHobbieCliffDiving() {
    	WebDriverWait wait = getDriverWait();
    	WebElement radio = getDriver().findElement(By.id("cliffdiving"));
		wait.until(ExpectedConditions.elementToBeClickable(radio));
		radio.click();
//    	selectHobbieCliffDiving.click();
    }
    
    public void selectHobbieSkyDiving() {
    	WebDriverWait wait = getDriverWait();
    	WebElement radio = getDriver().findElement(By.id("skydiving"));
		wait.until(ExpectedConditions.elementToBeClickable(radio));
		radio.click();
//    	selectHobbieSkyDiving.click();
    }
    
    public void selectHobbieOther() {
    	WebDriverWait wait = getDriverWait();
    	WebElement radio = getDriver().findElement(By.id("other"));
		wait.until(ExpectedConditions.elementToBeClickable(radio));
		radio.click();
//    	selectHobbieOther.click();
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
    
    public void clickNext() {
    	buttonNext.click();
    }
    
    public void clickPrev() {
    	buttonPrev.click();
    }

}
