package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewUserPage {
	
	@FindBy(name="username")
	private WebElement untxtbx;
	
	@FindBy(name="passwordText")
	private WebElement pwdtxtbx;
	
	@FindBy(name="passwordTextRetype")
	private WebElement repwdtxtbx;
	
	@FindBy(name="firstName")
	private WebElement fntxtbx;
	
	@FindBy(name="lastName")
	private WebElement lntxtbx;
	
	@FindBy(name="email")
	private WebElement emailtxtbx;
	
	@FindBy(xpath="//input[@value='   Create User   ']")
	private WebElement createuserBtn;
	
	public CreateNewUserPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getUntxtbx() {
		return untxtbx;
	}

	public WebElement getPwdtxtbx() {
		return pwdtxtbx;
	}

	public WebElement getRepwdtxtbx() {
		return repwdtxtbx;
	}

	public WebElement getFntxtbx() {
		return fntxtbx;
	}

	public WebElement getLntxtbx() {
		return lntxtbx;
	}

	public WebElement getEmailtxtbx() {
		return emailtxtbx;
	}

	public WebElement getCreateuserBtn() {
		return createuserBtn;
	}
	

}
