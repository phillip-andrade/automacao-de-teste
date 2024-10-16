package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Page;

public class TricentsFormTabEnterVehicleData extends Page {

    public TricentsFormTabEnterVehicleData() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(id = "nav_automobile")
    protected WebElement selectMenuNavAutomobile;
    
    @FindBy(id = "entervehicledata")
    protected WebElement tabEnterVehicleData;

    @FindBy(id = "make")
    protected WebElement selectMake;

    @FindBy(id = "engineperformance")
    protected WebElement fieldEnginePerformance;
    
    @FindBy(id = "dateofmanufacture")
    protected WebElement fieldDateOfManufacture;
    
    @FindBy(id = "numberofseats")
    protected WebElement selectNumberOfSeats;
    
    @FindBy(id = "fuel")
    protected WebElement selectFuelType;
    
    @FindBy(id = "listprice")
    protected WebElement fieldListPrice;

    @FindBy(id = "licenseplatenumber")
    protected WebElement fieldLicensePlateNumber;
    
    @FindBy(id = "annualmileage")
    protected WebElement fieldAnnualMileage;
    
    @FindBy(id = "nextenterinsurantdata")
    protected WebElement buttonNext;

    public void selectMenuNavAutomobile() {
        selectMenuNavAutomobile.click();
    }
    
    public void openTabEnterVehicleData() {
        tabEnterVehicleData.click();
    }

    public void setSelectMake(String selectText) {
    	selectMake.sendKeys(selectText);
    }
    
    public void setEnginePerformance(String text) {
        fieldEnginePerformance.sendKeys(text);
    }
    
    public void setDateOfManufacture(String date) {
    	fieldDateOfManufacture.sendKeys(date);
    }
    
    public void setNumberOfSeats(String numberOfSeats) {
    	selectNumberOfSeats.sendKeys(numberOfSeats);
    }
    
    public void setSelectFuelType(String fuelType) {
    	selectFuelType.sendKeys(fuelType);
	}
    
    public void setListPrice(String listPrice) {
		fieldListPrice.sendKeys(listPrice);
	}
    
    public void setLicensePlateNumber(String licensePlateNumber) {
		fieldLicensePlateNumber.sendKeys(licensePlateNumber);
	}
    
    public void setAnnualMileage(String annualMileage) {
		fieldAnnualMileage.sendKeys(annualMileage);
	}
    
    public void clickNext() throws InterruptedException {
		Thread.sleep(1000);
    	buttonNext.click();
    }
}