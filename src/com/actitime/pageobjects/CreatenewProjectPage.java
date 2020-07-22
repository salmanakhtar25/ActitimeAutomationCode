package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatenewProjectPage {
	@FindBy(xpath="//input[@name='name']")
	private WebElement projnameTxtBx;
	
	@FindBy(name="customerId")
	private WebElement customerdrpdwn;
	
	@FindBy(name="createProjectSubmit")
	private WebElement createprjctBtn;
	
	public CreatenewProjectPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateprjctBtn() {
		return createprjctBtn;
	}

	public WebElement getProjnameTxtBx() {
		return projnameTxtBx;
	}

	public WebElement getCustomerdrpdwn() {
		return customerdrpdwn;
	}

}
