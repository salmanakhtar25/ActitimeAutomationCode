package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.features.LoginFeatures;
import com.actitime.features.TaskFeatures;
import com.actitime.generic.BaseLib;
import com.actitime.generic.ExcelUtilities;

public class TaskTest extends BaseLib{

	@Test(priority=3)
	public void createCustomer(){
		ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
		String username=eu.readData("Sheet1", 1, 1);
		String password = eu.readData("Sheet1", 1, 2);
		LoginFeatures lf=new LoginFeatures(driver);
		lf.login(username, password);
		String customerName=eu.readData("Sheet1", 3, 3);
		TaskFeatures tf=new TaskFeatures(driver);
		tf.clickonTask();
		tf.clickonProjCustLink();
		tf.createcustomer(customerName);
		tf.verifyCreateCustomer(customerName);
	}

	@Test(priority=9)
	public void Deletecustomer(){
		ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
		String username=eu.readData("Sheet1", 1, 1);
		String password = eu.readData("Sheet1", 1, 2);
		LoginFeatures lf=new LoginFeatures(driver);
		lf.login(username, password);
		TaskFeatures tf=new TaskFeatures(driver);
		tf.clickonTask();
		tf.clickonProjCustLink();
		tf.deletecustomer();
		tf.verifyDeleteCustomer();
	}
	@Test(priority=4)
	public void createproject(){
		ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
		String username=eu.readData("Sheet1", 1, 1);
		String password = eu.readData("Sheet1", 1, 2);
		LoginFeatures lf=new LoginFeatures(driver);
		lf.login(username, password);
		String projectName = eu.readData("Sheet1", 5, 4);
		TaskFeatures tf=new TaskFeatures(driver);
		tf.clickonTask();
		tf.clickonProjCustLink();
		tf.createproject(projectName);
		tf.verifyCreatepoject(projectName);
		
	}
	@Test(priority=8)
	public void DeleteProject(){
		ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
		String username=eu.readData("Sheet1", 1, 1);
		String password = eu.readData("Sheet1", 1, 2);
		LoginFeatures lf=new LoginFeatures(driver);
		lf.login(username, password);
		TaskFeatures tf=new TaskFeatures(driver);
		tf.clickonTask();
		tf.clickonProjCustLink();
		tf.deleteproject();
		tf.verifydeleteproject();

	}
	
	
}
