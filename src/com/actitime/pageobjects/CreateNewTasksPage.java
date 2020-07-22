package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewTasksPage {
	
	@FindBy(name="customerId")
	private WebElement custDrpdwn;
	
	@FindBy(name="projectId")
	private WebElement ProjDrpdwn;
	
	@FindBy(name="task[0].name")
	private WebElement tasktxtBx;
	
	@FindBy(name="task[0].deadline")
	private WebElement dedlintxtBx;
	
	@FindBy(name="task[0].billingType")
	private WebElement billtypdrpdwn;
	
	@FindBy(name="task[0].markedToBeAddedToUserTasks")
	private WebElement adttchkBx;
	
	@FindBy(xpath="//input[@value='Create Tasks']")
	private WebElement creatTskBtn;
	
	public CreateNewTasksPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getCustDrpdwn() {
		return custDrpdwn;
	}

	public WebElement getProjDrpdwn() {
		return ProjDrpdwn;
	}

	public WebElement getTasktxtBx() {
		return tasktxtBx;
	}

	public WebElement getDedlintxtBx() {
		return dedlintxtBx;
	}

	public WebElement getBilltypdrpdwn() {
		return billtypdrpdwn;
	}

	public WebElement getAdttchkBx() {
		return adttchkBx;
	}

	public WebElement getCreatTskBtn() {
		return creatTskBtn;
	}
	

}
