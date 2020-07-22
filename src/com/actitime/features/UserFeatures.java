package com.actitime.features;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.actitime.pageobjects.CreateNewUserPage;
import com.actitime.pageobjects.EditUserSettingsPage;
import com.actitime.pageobjects.UserListPage;

public class UserFeatures {
	WebDriver driver;
	UserListPage ulp;
	CreateNewUserPage cnup;
	EditUserSettingsPage eusp;

	public UserFeatures(WebDriver driver){
		this.driver=driver;
		ulp=new UserListPage(driver);
		cnup=new CreateNewUserPage(driver);
		eusp=new EditUserSettingsPage(driver);
	}

	public void Createnewuser(String UserName, String Password,String FirstName,String LastName,String Id){
		ulp.getUsersele().click();
		ulp.getCreateNewuserBtn().click();
		cnup.getUntxtbx().sendKeys(UserName);
		cnup.getPwdtxtbx().sendKeys(Password);
		cnup.getRepwdtxtbx().sendKeys(Password);
		cnup.getFntxtbx().sendKeys(FirstName);
		cnup.getLntxtbx().sendKeys(LastName);
		cnup.getEmailtxtbx().sendKeys(Id);
		cnup.getCreateuserBtn().click();
	}
	
	public void verifyCreateuser(){
		String actualText = ulp.getUsermsgele().getText();
		String expectedText = "User account has been successfully created.";
		Assert.assertEquals(actualText, expectedText);
		Reporter.log(actualText, true);
	}

	public void deleteuser(){
		ulp.getUsersele().click();
		ulp.getUserlink().click();
		eusp.getDltuserbtn().click();
		driver.switchTo().alert().accept();
	}
	
	public void verifydeleteUser(){
		String actualText = ulp.getUsermsgele().getText();
		String expectedText = "User account has been successfully deleted.";
		Assert.assertEquals(actualText, expectedText);
		Reporter.log(actualText, true);
	}

}
