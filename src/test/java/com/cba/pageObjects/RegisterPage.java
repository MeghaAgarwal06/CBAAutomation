package com.cba.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver ldriver;
	public RegisterPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//defining the Elements on the Page
	
	@FindBy(id="rdoAdvanced")
	WebElement RdBtnAdvcdCntrl;
	
	@FindBy(id="chkMMFXSelected")
	WebElement ChkBoxRegForgnLang;
	
	@FindBy(name="btnNext")
	WebElement BtnNext;
	
	public void clickAdvancedCntrol() {
		RdBtnAdvcdCntrl.click();
	}
	
	public void clickForeignLang() {
		ChkBoxRegForgnLang.click();
	}
	public void clickLetsGo() {
		BtnNext.click();
	}
	
	
}
