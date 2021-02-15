package com.POM_HRM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.HRM_Genrics.AutoConstant;




public class HRM_LoginLogout implements AutoConstant 
{
	WebDriver driver;
	@FindBy(xpath="//input[@name='txtUsername']")
	private WebElement username;

	@FindBy(xpath="//input[@name='txtPassword']")
	private WebElement password;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[@id='welcome']")
	private WebElement welcome;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement Logout;

	@FindBy(xpath="//span[@id='spanMessage']")
	private WebElement SpanMessage;

	/*	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement ForgotPassword;

	@FindBy(id="securityAuthentication_userName")
	private WebElement NewUsername;

	@FindBy(xpath="(//input[@name='button'])[1]")
	private WebElement ResetButton; */

	@FindBy(xpath="//span[.='Username cannot be empty']")
	private WebElement span1;
	
	@FindBy(xpath="//span[.='Password cannot be empty']")
	private WebElement span2;
	



	public HRM_LoginLogout(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}


	public void HRM_login(String strUserName, String strPassword )
	{
		username.sendKeys(strUserName);
		password.sendKeys(strPassword);
		loginButton.click();
		
	}


	public void LogOut() throws InterruptedException
	{
		welcome.click();
		Thread.sleep(2000);
		Logout.click();
		//ForgotPassword.click();
		//NewUsername.sendKey(ExcelLibrary.getcellvalue(excel_path, sheet_Name, 0,2));
		//ResetButton.click();
	}


		public void verification()
	{
		String ExpectedErrorMessage="Invalid credentials";
		String ActualErrorMessage =SpanMessage.getText();
		Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);

	}
	 
		public void LoginWithBlankUserID()
		{
			loginButton.click();
			String ExpectedTitle = "Username cannot be empty";
			String ActualTitle= span1.getText();
			Assert.assertEquals(ExpectedTitle, ActualTitle);
		}
	
		
		public void LoginWithBlankPassword()
		{
			loginButton.click();
			String ExpectedTitle="Password cannot be empty";
			String ActualTitle=span2.getText();
			Assert.assertEquals(ExpectedTitle, ActualTitle);
		}
	
	


}
