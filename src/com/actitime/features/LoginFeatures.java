package com.actitime.features;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.actitime.pageobjects.LoginPage;

public class LoginFeatures {
	WebDriver driver;
	LoginPage lp;

	public LoginFeatures(WebDriver driver){
		this.driver=driver;
		lp=new LoginPage(driver);
	}

	public void login(String username, String password){
		lp.getUntxtbx().sendKeys(username);
		lp.getPwdtxtbx().sendKeys(password);
		lp.getLoginBtn().click();
	}

	public void verifyInvalidLogin(){
		String actualMsg = lp.getInvalidLoginEle().getText();
		String ExpectedMsg="Username or Password is invalid. Please try again.";
		Assert.assertEquals(actualMsg, ExpectedMsg);
		Reporter.log("Invalid login is verified", true);

	}
}
