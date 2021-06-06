package com.cba.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cba.utilies.ReadConfig;

public class BaseClass {

	ReadConfig readConfig = new ReadConfig();
	public String baseUrl=readConfig.getBaseUrl();
	public String travelUrl=readConfig.getTravelUrl();
	public String username=readConfig.getUsername();
	public String password = readConfig.getPassword();
	public String reenterpw= readConfig.getRenenterPw();
	public String secretansone = readConfig.getSecretAnsOne();
	public String secretanstwo= readConfig.getSecretAnsTwo();
	
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
		driver = new ChromeDriver();
		//setting wait timeout as 5 seconds 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	  @AfterClass public void tearDown() { driver.quit(); }
	 
	 
}
