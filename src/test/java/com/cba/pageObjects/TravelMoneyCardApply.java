package com.cba.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravelMoneyCardApply {
	WebDriver ldriver;
	public TravelMoneyCardApply(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	//defining the Elements & methods on the Page
	
	
	@FindBy(className="select")
	WebElement Onlineoption;
	
	

	public void clickOnlineOption() {
		Onlineoption.click();
	}
}


