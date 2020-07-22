package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {
	
	@FindBy(xpath="//input[@value='Delete This Customer']")
	private WebElement DeletecustBtn;
	
	@FindBy(xpath="//input[@value='Delete Customer']")
	private WebElement Deletecustpopup;
	
	public EditCustomerPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getDeletecustBtn() {
		return DeletecustBtn;
	}

	public WebElement getDeletecustpopup() {
		return Deletecustpopup;
	}

	

}
