package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Page;

public class TricentsFormTabSelectPriceOption extends Page{
	
	public TricentsFormTabSelectPriceOption() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "selectpriceoption")
	protected WebElement tabSelectPriceOption;

	@FindBy(id = "selectsilver")
	protected WebElement selectSilver;
	
	@FindBy(id = "selectgold")
	protected WebElement selectGold;
	
	@FindBy(id = "selectplatinum")
	protected WebElement selectPlatinum;
	
	@FindBy(id = "selectultimate")
	protected WebElement selectUltimate;
	
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
	
	public void setSelectSilver() {
		selectSilver.click();
	}
	
	public void setSelectGold() {
		selectGold.click();
	}
	
	public void setSelectPlatinum() {
		selectPlatinum.click();
	}
	
	public void setSelectUltimate() {
		selectUltimate.click();
	}
	
	public void selectViewQuote() {
		selectViewQuote.click();
	}
	
	public void selectDownloadQuote() {
		selectDownloadQuote.click();
	}
	
    public void clickNext() {
    	buttonNext.click();
    }
    
    public void clickPrev() {
    	buttonPrev.click();
    }
}
