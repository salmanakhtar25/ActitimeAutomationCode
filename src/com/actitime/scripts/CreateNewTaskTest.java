package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.features.LoginFeatures;
import com.actitime.features.NewTaskFeature;
import com.actitime.features.TaskFeatures;
import com.actitime.generic.BaseLib;
import com.actitime.generic.ExcelUtilities;

public class CreateNewTaskTest extends BaseLib {

	@Test(priority=5)
	public void createTask(){
		ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
		String username=eu.readData("Sheet1", 1, 1);
		String password = eu.readData("Sheet1", 1, 2);
		LoginFeatures lf=new LoginFeatures(driver);
		lf.login(username, password);
		String customerName=eu.readData("Sheet1", 3, 3);
		String projectName = eu.readData("Sheet1", 5, 4);
		String TaskName=eu.readData("Sheet1", 6, 5);
		TaskFeatures tf=new TaskFeatures(driver);
		tf.clickonTask();
		NewTaskFeature ntf=new NewTaskFeature(driver);
		ntf.createTask(TaskName);
		ntf.verifyCreateTask(customerName, projectName);
	}

	@Test(priority=7)
	public void deletetask(){
		ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
		String username=eu.readData("Sheet1", 1, 1);
		String password = eu.readData("Sheet1", 1, 2);
		LoginFeatures lf=new LoginFeatures(driver);
		lf.login(username, password);
		TaskFeatures tf=new TaskFeatures(driver);
		tf.clickonTask();
		NewTaskFeature ntf=new NewTaskFeature(driver);
		ntf.deleteTask();
		ntf.verifydeleteTask();


	}


}
