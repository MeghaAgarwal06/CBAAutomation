package com.cba.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterInformation {

	WebDriver ldriver;
	public RegisterInformation(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="txtUserName")
	WebElement TxtBxUserName;
	
	@FindBy(id="txtPassword")
	WebElement TxtBxPassword;
	
	@FindBy(id="txtReenterPassword")
	WebElement TxtBxReenterPw;
	
	@FindBy(id="ddlSecret1")
	WebElement DropDownBoxOne;
	
	@FindBy(id="txtSecret1")
	WebElement TxtBxSecretAnsOne;
	
	@FindBy(id="ddlSecret2")
	WebElement DropDownBoxTwo;
	
	@FindBy(id="txtSecret2")
	WebElement TxtBxSecretAnsTwo;
	
	
	@FindBy(id="btnSubmit")
	WebElement BtnSubmit;
	
	public void setUsername(String uname) {
		TxtBxUserName.sendKeys(uname);
	}
	
	public void setPassword(String password) {
		TxtBxPassword.sendKeys(password);
	}
	
	public void setPasswordAgain(String reenterpw) {
		TxtBxReenterPw.sendKeys(reenterpw);
	}
	
	
	public  void selectDropDownOneOption(int num) {
	      Select drop = new Select(DropDownBoxOne);
	      drop.selectByIndex(num);  
	}
	public void setSecretPwOne(String secretpassword) {
		TxtBxSecretAnsOne.sendKeys(secretpassword);
	}
	
	public  void selectDropDownTwoOption(int num) {
	      Select drop = new Select(DropDownBoxTwo);
	      drop.selectByIndex(num);  
	}
	
	public void setSecretPwTwo(String secretpassword) {
		TxtBxSecretAnsTwo.sendKeys(secretpassword);
	}
	
	public void createAccount() {
		BtnSubmit.click();
	}
	
}



