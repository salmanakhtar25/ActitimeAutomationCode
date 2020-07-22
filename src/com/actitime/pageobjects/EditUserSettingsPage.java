package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditUserSettingsPage {
	
	@FindBy(xpath="//input[@value='Delete This User']")
	private WebElement dltuserbtn;
	
	public EditUserSettingsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getDltuserbtn() {
		return dltuserbtn;
	}
	

}
