package com.cba.testCases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cba.pageObjects.LogOnPage;
import com.cba.pageObjects.LoginPage;
import com.cba.pageObjects.TravelMoneyCardApply;
import com.cba.pageObjects.TravelMoneyPage;
import com.cba.pageObjects.TravelPage;

public class TC_TravelMoney extends BaseClass {

	
	@Test
	public void testTravelMoney()  {
		//Navigate to https://www.commbank.com.au/travel.html
		driver.get(travelUrl);
		driver.manage().window().maximize();
		
		TravelPage travel = new TravelPage(driver);
		//Click on discover more on Travel Money Option listed on Page
		travel.clickDiscoverMore();
		
		TravelMoneyPage travelPage = new TravelMoneyPage(driver);
		List<String> btns= travelPage.checkOptions();
		
		//Check the 2 currency convertor options 
		ArrayList<String> expectedArr = new ArrayList<String>(2);
		expectedArr.add("Foreign exchange calculator");
		expectedArr.add("Exchange rates");
		 Iterator<String> itr=btns.iterator();//getting the Iterator  
		  while(itr.hasNext()){ 
			  boolean ans = expectedArr.contains(itr.next()); 
			  Assert.assertTrue(ans);			  	   	  
		  }
		

		 //Select register Online
		  travelPage.clickRegisterOnline(); 
		  
		  // Switch to new window opened
		  for(String winHandle : driver.getWindowHandles()){
		      driver.switchTo().window(winHandle);
		  }
		  
		  //Select apply online option
		  TravelMoneyCardApply applyOnline = new TravelMoneyCardApply(driver);
		  applyOnline.clickOnlineOption();
		  
	
		 
		  LogOnPage logOn = new LogOnPage(driver);
		//  WebElement ClientNumber1;
		 // ClientNumber1=wait.until(ExpectedConditions.visibilityOf(logOn.getClientNumber()));
		  
		  boolean expected =logOn.checkClientNumberFieldPresent();
		  Assert.assertEquals(true, expected);
		  expected=logOn.checkPasswordFieldPresent();
		  Assert.assertEquals(true, expected);
		   
		  
}
}
