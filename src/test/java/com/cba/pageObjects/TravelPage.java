package com.cba.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravelPage {
	WebDriver ldriver;
	public TravelPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	//defining the Elements on the Page
	@FindBy(xpath="//a[@title='Discover more']")
	WebElement BtnDiscoverMore;
	
	

	public void clickDiscoverMore() {
		BtnDiscoverMore.click();
	}
}


