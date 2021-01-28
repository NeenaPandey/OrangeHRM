package com.HRM_Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.HRM_Genrics.AutoConstant;
import com.HRM_Genrics.BaseTest;
import com.HRM_Genrics.ExcelLibrary;
import com.POM_HRM.UserManagementPom;
import com.POM_HRM.HRM_LoginLogout;

public class UserManagementTest extends BaseTest implements AutoConstant
{
	//WebDriver driver;

	@Test
	public void TC_001() throws IOException, InterruptedException
	{
		HRM_LoginLogout login = new  HRM_LoginLogout(driver);
		login.HRM_login(ExcelLibrary.getcellvalue(excel_path, Login_sheet_Name, 1, 0),ExcelLibrary.getcellvalue(excel_path, Login_sheet_Name, 1, 1));
		Thread.sleep(2000);
		
		UserManagementPom  admin = new UserManagementPom(driver);
		admin.UserManagementAdd(ExcelLibrary.getcellvalue(excel_path, "UserManagement", 1, 0),
				ExcelLibrary.getcellvalue(excel_path, "UserManagement", 1, 1),
				ExcelLibrary.getcellvalue(excel_path, "UserManagement", 1, 2),
				ExcelLibrary.getcellvalue(excel_path, "UserManagement", 1, 3),
				ExcelLibrary.getcellvalue(excel_path, "UserManagement", 1, 4),
				ExcelLibrary.getcellvalue(excel_path, "UserManagement", 1, 5));
		
	}

}
