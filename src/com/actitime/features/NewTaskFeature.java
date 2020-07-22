package com.actitime.features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.actitime.pageobjects.CreateNewTasksPage;
import com.actitime.pageobjects.OpenTasksPage;
import com.actitime.pageobjects.ViewOpenTaskPage;

public class NewTaskFeature {
	WebDriver driver;
	CreateNewTasksPage cntp;
	OpenTasksPage otp;
	ViewOpenTaskPage votp;

	public NewTaskFeature(WebDriver driver){
		this.driver=driver;
		cntp=new CreateNewTasksPage(driver);
		otp=new OpenTasksPage(driver);
		votp=new ViewOpenTaskPage(driver);
	}

	public void createTask(String TaskName){
		otp.getCreateTaskBtn().click();
		WebElement custdrpdwn = cntp.getCustDrpdwn();
		Select cstvalue=new Select(custdrpdwn);
		cstvalue.selectByVisibleText("GE HealthCare");
		WebElement projdrpdwn = cntp.getProjDrpdwn();
		Select projvalue=new Select(projdrpdwn);
		projvalue.selectByVisibleText("Medical Software");
		cntp.getTasktxtBx().sendKeys(TaskName);
		cntp.getDedlintxtBx().sendKeys("Jan 18, 2020");
		WebElement biltypdrpdwn = cntp.getBilltypdrpdwn();
		Select biltypvalue=new Select(biltypdrpdwn);
		biltypvalue.selectByVisibleText("Billable");
		cntp.getAdttchkBx().click();
		cntp.getCreatTskBtn().click();
	}
	
	public void verifyCreateTask(String customerName,String projectName){
		String actualText = otp.getTaskmsgele().getText();
		String expectedText = "1 new task was added to the customer \""+customerName+"\", project \""+projectName+"\".";
		Assert.assertEquals(actualText, expectedText);
		Reporter.log(actualText, true);
	}

	public void deleteTask(){
		otp.getTasknamelnk().click();
		votp.getDlttaskBtn().click();
		votp.getDlttaskpopup().click();
	}
	
	public void verifydeleteTask(){
		String actualText = otp.getTaskmsgele().getText();
		String expectedText = "Task has been successfully deleted.";
		Assert.assertEquals(actualText, expectedText);
		Reporter.log(actualText, true);
	}

}
