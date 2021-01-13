package com.cba.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cba.pageObjects.LoginPage;
import com.cba.pageObjects.RegisterInformation;
import com.cba.pageObjects.RegisterPage;
import com.cba.pageObjects.RegistrationSelection;

public class TC_RegisterOnline_001 extends BaseClass  {

	
	@Test
	public void registerOnline()  {
		
		driver.get(baseUrl);
		LoginPage loginPage = new LoginPage(driver);

		driver.switchTo().frame("frmRegistration");
		loginPage.clickRegisterOnline();
		Assert.assertEquals(driver.getTitle(), "Registration");
		
		RegisterPage regPage = new RegisterPage(driver);
		regPage.clickAdvancedCntrol();
		regPage.clickForeignLang();
		regPage.clickLetsGo();
		
		RegistrationSelection regSelect = new RegistrationSelection(driver);
		regSelect.clickNextBtn();
		
		RegisterInformation regInfo = new RegisterInformation(driver);
		regInfo.setUsername(username);
		regInfo.setPassword(password);
		regInfo.setPasswordAgain(reenterpw);
		regInfo.selectDropDownOneOption(2);
		regInfo.setSecretPwOne(secretansone);
		regInfo.selectDropDownTwoOption(4);
		regInfo.setSecretPwTwo(secretanstwo);
		regInfo.createAccount();
		Assert.assertEquals(driver.getTitle(), "Step 1 - Service details");
		
		
	}
	
}
