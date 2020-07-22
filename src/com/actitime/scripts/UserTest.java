package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.features.LoginFeatures;
import com.actitime.features.UserFeatures;
import com.actitime.generic.BaseLib;
import com.actitime.generic.ExcelUtilities;

public class UserTest extends BaseLib{

	@Test(priority=6)
	public void createuser(){
		ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
		String username=eu.readData("Sheet1", 1, 1);
		String password=eu.readData("Sheet1", 1, 2);
		String UserName=eu.readData("Sheet1", 7, 3);
		String Password=eu.readData("Sheet1", 7, 4);
		String FirstName=eu.readData("Sheet1", 7, 5);
		String LastName=eu.readData("Sheet1", 7, 6);
		String Id=eu.readData("Sheet1", 7, 7);
		LoginFeatures lf=new LoginFeatures(driver);
		lf.login(username, password);
		UserFeatures uf=new UserFeatures(driver);
		uf.Createnewuser(UserName,Password,FirstName,LastName,Id);
		uf.verifyCreateuser();
	}

	@Test(priority=10)
	public void deleteuser() throws InterruptedException{
		ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
		String username=eu.readData("Sheet1", 1, 1);
		String password = eu.readData("Sheet1", 1, 2);
		LoginFeatures lf=new LoginFeatures(driver);
		lf.login(username, password);
		UserFeatures uf=new UserFeatures(driver);
		uf.deleteuser();
		uf.verifydeleteUser();

	}
}
