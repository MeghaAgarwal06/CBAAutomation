package com.cba.testCases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cba.pageObjects.LoginPage;
import com.cba.pageObjects.RegisterInformation;
import com.cba.pageObjects.RegisterPage;
import com.cba.pageObjects.RegistrationSelection;

public class TC_RegisterOnline_001 extends BaseClass  {

	
	@Test
	public void registerOnline() throws InterruptedException  {
		
		driver.get(baseUrl);
		LoginPage loginPage = new LoginPage(driver);

		//click on rgister online
		loginPage.clickRegisterOnline();
		Assert.assertEquals(driver.getTitle(), "Registration");
		
		RegisterPage regPage = new RegisterPage(driver);
		//select Advanced option
		regPage.clickAdvancedCntrol();
		regPage.clickForeignLang();
		regPage.clickLetsGo();
		
		RegistrationSelection regSelect = new RegistrationSelection(driver);
		regSelect.clickNextBtn();
		
		RegisterInformation regInfo = new RegisterInformation(driver);
		
		String pattern = "MMddyyyyHHmmss";

		// Create an instance of SimpleDateFormat used for formatting 
		// the string representation of date according to the chosen pattern
		DateFormat df = new SimpleDateFormat(pattern);

		// Get the today date using Calendar object.
		Date today = Calendar.getInstance().getTime();        
		// Using DateFormat format method we can create a string 
		// representation of a date with the defined format.
		String todayAsString = df.format(today);

		//Append username with date to create distinct user	
		
		regInfo.setUsername(username+todayAsString);
		regInfo.setPassword(password);
		regInfo.setPasswordAgain(reenterpw);
		regInfo.selectDropDownOneOption(2);
		regInfo.setSecretPwOne(secretansone);
		regInfo.selectDropDownTwoOption(4);
		regInfo.setSecretPwTwo(secretanstwo);
	
		regInfo.createAccount();
		//check if page is navigated to Service details page.
		Assert.assertEquals(driver.getTitle(), "Step 1 - Service details");
	
		
		
	}
	
}
