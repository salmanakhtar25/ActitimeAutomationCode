package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage extends BasePage {
	
	@FindBy(xpath="//span[text()='Create New User']")
	private WebElement CreateNewuserBtn;
	
	@FindBy(linkText="Devgan, Ajay (Ajay_Dev)")
	private WebElement userlink;
	
	@FindBy(css="span[class='successmsg']")
	private WebElement usermsgele;
	
	public UserListPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewuserBtn() {
		return CreateNewuserBtn;
	}

	public WebElement getUserlink() {
		return userlink;
	}

	public WebElement getUsermsgele() {
		return usermsgele;
	}
	
	
	

}
