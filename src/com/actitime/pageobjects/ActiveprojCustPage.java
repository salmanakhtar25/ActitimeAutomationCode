package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveprojCustPage {

	@FindBy(css="input[value='Create New Customer']")
	private WebElement createNewCustBtn;

	@FindBy(xpath="//table[@id='SuccessMessages']//span")
	private WebElement successMsgEle;

	@FindBy(linkText="GE HealthCare")
	private WebElement custnamelnk;

	@FindBy(name="selectedCustomer")
	private WebElement custdrpdwn;

	@FindBy(xpath="//input[contains(@value,'Show')]")
	private WebElement showbtn;

	@FindBy(xpath="//input[@value='Create New Project']")
	private WebElement createnewprojBtn;

	@FindBy(linkText="Medical Software")
	private WebElement projnamelnk;

	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement dltcustele;

	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement createpojmsgele;
	
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement dltpojele;



	public ActiveprojCustPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public WebElement getCreatenewprojBtn() {
		return createnewprojBtn;
	}
	public WebElement getProjnamelnk() {
		return projnamelnk;
	}
	public WebElement getCustnamelnk() {
		return custnamelnk;
	}
	public WebElement getSuccessMsgEle() {
		return successMsgEle;
	}

	public WebElement getCreateNewCustBtn() {
		return createNewCustBtn;
	}

	public WebElement getCustdrpdwn() {
		return custdrpdwn;
	}

	public WebElement getShowbtn() {
		return showbtn;
	}
	public WebElement getDltcustele() {
		return dltcustele;
	}
	public WebElement getCreatepojmsgele() {
		return createpojmsgele;
	}
	public WebElement getDltpojele() {
		return dltpojele;
	}
	
}
