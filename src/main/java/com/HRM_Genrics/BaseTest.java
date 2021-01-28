package com.HRM_Genrics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements AutoConstant

{
	public WebDriver driver;
	
	@BeforeMethod
	public void baseTest()
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeDriver()
	{
		//driver.quit();
	}
	
		
		
		
		
	

}
