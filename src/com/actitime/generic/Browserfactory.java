package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserfactory {
	public static WebDriver launchBrowser(String BrowserName){
		WebDriver driver=null;
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./exefiles/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(BrowserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","./exefiles/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		return driver;	
	}

}
