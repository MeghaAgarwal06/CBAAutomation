package com.cba.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[@class='register-link mr-lg-4 mr-3']")
	WebElement BtnRegisterOnline;
	
	
	public void clickRegisterOnline() {
		BtnRegisterOnline.click();
	}
}
