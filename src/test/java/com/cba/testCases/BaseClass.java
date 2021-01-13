package com.cba.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cba.utilies.ReadConfig;

public class BaseClass {

	ReadConfig readConfig = new ReadConfig();
	public String baseUrl=readConfig.getBaseUrl();
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
		
	}
	
	/*
	 * @AfterClass public void tearDown() { driver.quit(); }
	 */
}
