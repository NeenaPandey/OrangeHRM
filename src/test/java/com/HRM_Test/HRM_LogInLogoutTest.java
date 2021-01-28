package com.HRM_Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.HRM_Genrics.AutoConstant;
import com.HRM_Genrics.BaseTest;
import com.HRM_Genrics.ExcelLibrary;
import com.POM_HRM.UserManagementPom;
import com.POM_HRM.HRM_LoginLogout;

public class HRM_LogInLogoutTest extends BaseTest implements AutoConstant
{
	@Test
	public void TC_001() throws IOException, InterruptedException 
	{
		
		HRM_LoginLogout login = new  HRM_LoginLogout(driver);
		login.HRM_login(ExcelLibrary.getcellvalue(excel_path, Login_sheet_Name, 1, 0),ExcelLibrary.getcellvalue(excel_path, Login_sheet_Name, 1, 1));
		Thread.sleep(2000);
		login.LogOut();
		driver.close();
	}
	
	@Test
	public void TC_002() throws IOException, InterruptedException 
	{			
		HRM_LoginLogout login = new  HRM_LoginLogout(driver);
		login.HRM_login(ExcelLibrary.getcellvalue(excel_path, Login_sheet_Name, 2, 0),ExcelLibrary.getcellvalue(excel_path, Login_sheet_Name, 2, 1));
		login.verification();
		driver.close();
	}
	
	@Test
	public void TC_003()
	{
		HRM_LoginLogout login = new  HRM_LoginLogout(driver);	
		login.LoginWithBlankUserID();
		driver.close();
	}
	
	@Test
	public void TC_004()
	{
		HRM_LoginLogout login = new  HRM_LoginLogout(driver);
		login.LoginWithBlankPassword();
		driver.close();
	}
	
}