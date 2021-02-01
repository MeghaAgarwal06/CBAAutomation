package com.cba.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOnPage {
	WebDriver ldriver;
	public LogOnPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//input[@id='txtMyClientNumber_field']")
	 List<WebElement> ClientNumber;
	
	@FindBy(id="txtMyPassword_field")
	 List<WebElement> password;
	
	
	public boolean checkClientNumberFieldPresent() {
		
	return	ClientNumber.size()!=0;
		
	}
	

	public boolean checkPasswordFieldPresent() {
		
	return	password.size()!=0;
		
	}
}


