package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Page;

public class TricentsFormTabSendQuote extends Page{
	
	public TricentsFormTabSendQuote() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "sendquote")
	protected WebElement tabSelectSendQuote;
	
	@FindBy(id = "email")
	protected WebElement fieldEmail;
	
	@FindBy(id = "phone")
	protected WebElement fieldPhone;
	
	@FindBy(id = "username")
	protected WebElement fieldUsername;
	
	@FindBy(id = "password")
	protected WebElement fieldPassword;
	
	@FindBy(id = "confirmpassword")
	protected WebElement fieldConfirmPassword;
	
	@FindBy(id = "Comments")
	protected WebElement fieldComments;
	
    @FindBy(id = "sendemail")
    protected WebElement buttonSend;
    
    @FindBy(id = "prevselectpriceoption")
    protected WebElement buttonPrev;
	
	
	/***************************************/
	public void SelectSendQuote() {
		tabSelectSendQuote.click();
	}
	
	public void setEmail(String email) {
		fieldEmail.sendKeys(email);
	}
	
	public void setPhone(String phone) {
		fieldPhone.sendKeys(phone);
	}

	public void setUsername(String username) {
		fieldUsername.sendKeys(username);
	}
	
	public void setPassword(String password) {
		fieldPassword.sendKeys(password);
	}
	
	public void setConfirmPassword(String confirmpassword) {
		fieldConfirmPassword.sendKeys(confirmpassword);
	}
	
	public void setComments(String comments) {
		fieldComments.sendKeys(comments);
	}
	
    public void clickSend() throws InterruptedException {
		Thread.sleep(1000);
    	buttonSend.click();
    }
    
    public void clickPrev() throws InterruptedException {
		Thread.sleep(1000);
    	buttonPrev.click();
    }
}
