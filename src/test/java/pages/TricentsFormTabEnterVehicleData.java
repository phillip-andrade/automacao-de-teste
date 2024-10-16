package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Page;

public class TricentsFormTabEnterVehicleData extends Page {

	Actions actions = new Actions(getDriver());

    public TricentsFormTabEnterVehicleData() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(id = "nav_automobile")
    protected WebElement selectMenuNavAutomobile;
    
    @FindBy(id = "nav_truck")
    protected WebElement selectMenuNavTruck;
    
    @FindBy(id = "nav_motorcycle")
    protected WebElement selectMenuNavMotorcycle;
    
    @FindBy(id = "nav_camper")
    protected WebElement selectMenuNavCamper;
    
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
    
    @FindBy(id = "payload")
    protected WebElement fieldPayload;
    
    @FindBy(id = "totalweight")
    protected WebElement fieldTotalWeight;
    
    @FindBy(id = "cylindercapacity")
    protected WebElement fieldCylinderCapacity;
    
    @FindBy(id = "model")
    protected WebElement selectModel;
    
    @FindBy(id = "numberofseatsmotorcycle")
    protected WebElement selectNumberOfSeatsMotorcycle;
        
    @FindBy(id = "nextenterinsurantdata")
    protected WebElement buttonNext;

    public void selectMenuNavAutomobile() {
        selectMenuNavAutomobile.click();
    }
    
    public void selectMenuNavTruck() {
        selectMenuNavTruck.click();
    }
    
    public void selectMenuNavMotorcycle() {
        selectMenuNavMotorcycle.click();
    }
    
    public void selectMenuNavCamper() {
        selectMenuNavCamper.click();
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
    
    public void setPayload(String payload) {
    	fieldPayload.sendKeys(payload);
    }
    
    public void setTotalWeight(String totalWeight) {
    	fieldTotalWeight.sendKeys(totalWeight);
    }
    
    public void setCylinderCapacity(String cylinderCapacity) {
    	fieldCylinderCapacity.sendKeys(cylinderCapacity);
    }
    
    public void setModel(String model) {
    	selectModel.sendKeys(model);
    }
    
    public void setNumberOfSeatsMotorcycle(String numberOfSeatsMotorcycle) {
    	selectNumberOfSeatsMotorcycle.sendKeys(numberOfSeatsMotorcycle);
    }
    
    public void setRightHandDrive(String gender) throws InterruptedException {
    	if (gender.equalsIgnoreCase("Yes")) {
    		WebElement radio = getDriver().findElement(By.xpath("//input[@id='righthanddriveyes']"));
    		getDriver().findElement(By.xpath("//input[@id='righthanddriveyes']"));
    		Thread.sleep(500);
    		actions.moveToElement(radio).click().build().perform();
    	} else {
    		WebElement radio = getDriver().findElement(By.xpath("//input[@id='righthanddriveno']"));
    		getDriver().findElement(By.xpath("//input[@id='righthanddriveno']"));
    		Thread.sleep(500);
    		actions.moveToElement(radio).click().build().perform();
    	}
    }
    
    public void clickNext() throws InterruptedException {
		Thread.sleep(1000);
    	buttonNext.click();
    }
}