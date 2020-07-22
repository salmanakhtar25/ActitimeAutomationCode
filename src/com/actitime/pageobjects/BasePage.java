package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskele;

	@FindBy(xpath="//div[text()='Users']")
	private WebElement usersele;

	public BasePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getTaskele() {
		return taskele;
	}

	public WebElement getUsersele() {
		return usersele;
	}
}
