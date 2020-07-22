package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewOpenTaskPage {
	
@FindBy(xpath="//input[@value='Delete This Task']")
private WebElement dlttaskBtn;

@FindBy(xpath="//input[@value='Delete Task']")
private WebElement dlttaskpopup;

public ViewOpenTaskPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}

public WebElement getDlttaskBtn() {
	return dlttaskBtn;
}

public WebElement getDlttaskpopup() {
	return dlttaskpopup;
}



}
