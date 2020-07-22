package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTasksPage {
	
	@FindBy(linkText="Projects & Customers")
	private WebElement projCustLink;
	
	@FindBy(xpath="//input[@value='Create New Tasks']")
	private WebElement createTaskBtn;
	
	@FindBy(linkText="Testing")
	private WebElement tasknamelnk;
	
	@FindBy(css="span[class='successmsg']")
	private WebElement taskmsgele;
	
	public OpenTasksPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getProjCustLink() {
		return projCustLink;
	}

	public WebElement getCreateTaskBtn() {
		return createTaskBtn;
	}

	public WebElement getTasknamelnk() {
		return tasknamelnk;
	}

	public WebElement getTaskmsgele() {
		return taskmsgele;
	}
	
	

}
