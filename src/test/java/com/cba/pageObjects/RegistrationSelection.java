package com.cba.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationSelection {

	WebDriver ldriver;
	public RegistrationSelection(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="btnSubmit")
	WebElement BtnSubmit;
	
	
	public void clickNextBtn() {
		BtnSubmit.click();
	}
}
