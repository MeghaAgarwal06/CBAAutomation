package com.cba.utilies;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
 
	Properties prop;
	public ReadConfig()
	{
		File src = new File("./Configurations/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			prop= new Properties();
			prop.load(fis);
			
		}catch(Exception e) {
			System.out.println("exceptin is "+ e.getMessage());
		}
	}
	
	public String getBaseUrl() {
		String url=prop.getProperty("baseUrl");
		return url;
	}
	
	public String getChromePath() {
		String path=prop.getProperty("chromePath");
		return path;
	}
	
	public String getUsername() {
		String username=prop.getProperty("username");
		return username;
	}
	public String getPassword() {
		String passowrd=prop.getProperty("passowrd");
		return passowrd;
	}
	public String getRenenterPw() {
		String reenterpw=prop.getProperty("reenterpw");
		return reenterpw;
	}
	public String getSecretAnsOne() {
		String secretansone=prop.getProperty("secretansone");
		return secretansone;
	}
	public String getSecretAnsTwo() {
		String secretanstwo=prop.getProperty("secretanstwo");
		return secretanstwo;
	}
}
