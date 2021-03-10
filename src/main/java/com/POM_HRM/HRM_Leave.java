package com.POM_HRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.HRM_Genrics.AutoConstant;
import com.HRM_Genrics.BaseTest;

public class HRM_Leave extends BaseTest implements AutoConstant

{
	WebDriver driver;
	@FindBy(xpath="//b[.='Leave']")
	private WebElement leaveButton;
	
	@FindBy(xpath="(//img[@class='ui-datepicker-trigger'])[1]")
	private WebElement calander1;
	
	@FindBy(xpath="//select[@data-handler='selectMonth']")
	private WebElement Month;
	
	@FindBy(xpath="//select[@data-handler='selectYear']")
	private WebElement Year;
	
	@FindBy(xpath="//a[.='8']")
	private WebElement StartDate;
	
	@FindBy(xpath="(//img[@class='ui-datepicker-trigger'])[2]")
	private  WebElement calander2;
	
	@FindBy(xpath="//select[@data-handler='selectMonth']")
	private WebElement month;
	
	@FindBy(xpath="//select[@data-handler='selectYear']")
	private WebElement year;
	
	@FindBy(xpath="//a[.='7']")
	private WebElement Date;
	
	
	public HRM_Leave(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void leaveMethod() throws InterruptedException
	{
		leaveButton.click();
		calander1.click();
		Thread.sleep(2000);
		
		Select sel = new Select(Month);
		sel.selectByVisibleText("Mar");
		
		Select sel1 = new Select(Year);
		sel1.selectByIndex(2021);
		
		StartDate.click();
		Thread.sleep(2000);
		
		calander2.click();
		
		Select sel2 = new Select(month);
		sel2.selectByVisibleText("Apr");
		
		Select sel3 = new Select(year);
		sel3.selectByIndex(2021);
		
					
		Date.click();
	
		
	}
	
}

	
	

