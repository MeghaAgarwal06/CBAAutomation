package com.cba.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravelMoneyPage {
	WebDriver ldriver;
	public TravelMoneyPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//a[@class='button_secondary']")
	 List<WebElement> BtnsOptions;
	
	
	
	@FindBy(partialLinkText="Order online")
	WebElement BtnLogOn;
	
	
	public List<String> checkOptions() {
		
		ArrayList<String> list=new ArrayList<String>();
		for (WebElement webElement : BtnsOptions) {
            String name = webElement.getText();
           list.add(name);
        }
		return list;
	}
	
	public void clickRegisterOnline() {
		BtnLogOn.click();
	}
}


