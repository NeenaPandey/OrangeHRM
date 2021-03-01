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
	
	@FindBy(xpath="//a[.='8']")
	private WebElement StartDate;
	
	@FindBy(xpath="(//img[@class='ui-datepicker-trigger'])[2]")
	private  WebElement calander2;
	
	@FindBy(xpath="//select[@data-handler='selectMonth']")
	private WebElement month;
	
	@FindBy(xpath="//a[.='7']")
	private WebElement Date;
	
	
	public HRM_Leave(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void leaveMethod()
	{
		leaveButton.click();
		calander1.click();
		StartDate.click();
		calander2.click();

		/*driver.findElement(By.xpath=("//select[@data-handler='selectMonth']"));
		 List <WebElement> month;
		for(int i =0; i<=month.size(); i++);
		
		if(month.get(i).getText().equalIgnoreCase("Apr"))
			{
			  month.get(i).click();	
			  
			  break;*/
	//}
		
		Select sel = new Select(month);
		sel.selectByVisibleText("Apr");
		
						
		Date.click();
	
		
	}
	
}

	
	

