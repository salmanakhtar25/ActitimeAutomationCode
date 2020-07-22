package com.actitime.features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import com.actitime.pageobjects.ActiveprojCustPage;
import com.actitime.pageobjects.CreateNewCustPage;
import com.actitime.pageobjects.CreatenewProjectPage;
import com.actitime.pageobjects.EditCustomerPage;
import com.actitime.pageobjects.EditprojectPage;
import com.actitime.pageobjects.EnterTimeTrackPage;
import com.actitime.pageobjects.OpenTasksPage;

public class TaskFeatures {
	WebDriver driver;
	EnterTimeTrackPage ettp;
	OpenTasksPage otp;
	ActiveprojCustPage apcp;
	CreateNewCustPage cncp;
	EditCustomerPage ecp;
	CreatenewProjectPage cnpp;
	EditprojectPage epp;

	public TaskFeatures(WebDriver driver){
		this.driver=driver;
		ettp=new EnterTimeTrackPage(driver);
		otp=new OpenTasksPage(driver);
		apcp=new ActiveprojCustPage(driver);
		cncp=new CreateNewCustPage(driver);
		ecp=new EditCustomerPage(driver);
		cnpp=new CreatenewProjectPage(driver);
		epp=new EditprojectPage(driver);
	}

	public void clickonTask(){
		ettp.getTaskele().click();
	}

	public void clickonProjCustLink(){
		otp.getProjCustLink().click();
	}

	public void createcustomer(String customerName){
		apcp.getCreateNewCustBtn().click();
		cncp.getCustNameTxtBx().sendKeys(customerName);
		cncp.getCreatecustBtn().click();
	}
	public void verifyCreateCustomer(String customerName){
		String actualText=apcp.getSuccessMsgEle().getText();
		String expectedText = "Customer \""+customerName+"\" has been successfully created.";
		Assert.assertEquals(actualText, expectedText);
		Reporter.log(actualText,true);
	}
	public void deletecustomer(){
		WebElement drpdwn = apcp.getCustdrpdwn();
		Select custdrpdwn=new Select(drpdwn);
		custdrpdwn.selectByVisibleText("GE HealthCare");
		apcp.getShowbtn().click();
		apcp.getCustnamelnk().click();
		ecp.getDeletecustBtn().click();
		ecp.getDeletecustpopup().click();
	}

	public void verifyDeleteCustomer(){
		String actualText = apcp.getDltcustele().getText();
		String expectedText = "Customer has been successfully deleted.";
		Assert.assertEquals(actualText, expectedText);
		Reporter.log(actualText, true);
	}
	public void createproject(String projectName){
		apcp.getCreatenewprojBtn().click();
		WebElement custdrpdwn = cnpp.getCustomerdrpdwn();
		Select value=new Select(custdrpdwn);
		value.selectByVisibleText("GE HealthCare");
		cnpp.getProjnameTxtBx().sendKeys(projectName);
		cnpp.getCreateprjctBtn().click();
	}

	public void verifyCreatepoject(String projectName){
		String actualText = apcp.getCreatepojmsgele().getText();
		String expectedText = "Project \""+projectName+"\" has been successfully created.";
		Assert.assertEquals(actualText, expectedText);
		Reporter.log(actualText, true);
	}

	public void deleteproject(){
		apcp.getProjnamelnk().click();
		epp.getDeleteprojBtn().click();
		epp.getDeleteprojpopup().click();
	}
	public void verifydeleteproject(){
		String actualText = apcp.getDltpojele().getText();
		String expectedText = "Project has been successfully deleted.";
		Assert.assertEquals(actualText, expectedText);
		Reporter.log(actualText, true);
	}
}

