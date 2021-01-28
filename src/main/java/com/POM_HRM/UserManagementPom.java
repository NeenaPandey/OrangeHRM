package com.POM_HRM;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.HRM_Genrics.AutoConstant;
import com.HRM_Genrics.BaseTest;
import com.HRM_Genrics.ExcelLibrary;

public class UserManagementPom  implements   AutoConstant
{
	WebDriver driver;
	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']")
	private WebElement Admin;

	@FindBy(xpath="//input[@value='Add']")
	private WebElement Add;

	@FindBy(id="systemUser_userType")
	private WebElement UserRole;

	@FindBy(xpath="//input[@id='systemUser_employeeName_empName']")
	private WebElement EmployeeName;

	@FindBy(id="systemUser_userName")
	private WebElement UserName;

	@FindBy(id="systemUser_status")
	private WebElement Status;

	@FindBy(id="systemUser_password")
	private WebElement Password;

	@FindBy(id="systemUser_confirmPassword")
	private WebElement ConfirmPassword;

	@FindBy(id="btnSave")
	private WebElement Save;



	public UserManagementPom (WebDriver driver)

	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void UserManagementAdd(String strUserRoleType, String strEmployeeName, String strUserName, String strUserStatus, String strPassword, String strConfirmPassword) throws IOException, InterruptedException
	{
		Admin.click();
		Add.click();
		
		Thread.sleep(2000);
		
		Select sel = new Select(UserRole);
		sel.selectByVisibleText("ESS");

		EmployeeName.sendKeys(strEmployeeName);
		
		UserName.sendKeys(strUserName);

		Select sel1 = new Select(Status);
		sel1.selectByVisibleText("Enabled");

		Password.sendKeys(strPassword);
		ConfirmPassword.sendKeys(strConfirmPassword);

		Save.click();
		
	}

}
