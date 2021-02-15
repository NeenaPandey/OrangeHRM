package com.POM_HRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.HRM_Genrics.AutoConstant;
import com.HRM_Genrics.BaseTest;

public class HRMContactDetails  implements AutoConstant

{
	WebDriver Driver;
	
	@FindBy(xpath="//a[.='Contact Details']")
	private WebElement  contactDelail;
	
	@FindBy(id="btnSave")
	private WebElement Edit;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement AddStreet1;
	
	@FindBy(xpath="//input[@name='contact[street2]']")
	private WebElement AddStreet2;
	
	@FindBy(xpath="//input[@name='contact[city]']")
	private WebElement City;
	
	@FindBy(xpath="//input[@name='contact[province]']")
	private WebElement State;
	
	@FindBy(xpath="//input[@name='contact[emp_zipcode]']")
	private WebElement PostalCode;
	
	@FindBy(xpath="//select[@name='contact[country]']")
	private WebElement Country;
	
	@FindBy(xpath="//input[@id='contact_emp_hm_telephone']")
	private WebElement Telephone;
	
	@FindBy(xpath="//input[@id='contact_emp_mobile']")
	private WebElement Mobile;
	
	@FindBy(xpath="//input[@id='contact_emp_work_telephone']")
	private WebElement WorkTelephone;
	
	@FindBy(id="contact_emp_work_email")
	private WebElement WorkEmail;
	
	@FindBy(id="contact_emp_oth_email")
	private WebElement OtherEmail;
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement Save;
	
	
	public HRMContactDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.Driver= driver;
	}
	
	public void contactDetails( String strStreet1, String strStreet2, String strCity, String strState, String strPostalCode,
			String strTelephone, String strMobile, String strWorkTelephone, String strWorkEmail, String strOtherEmail) throws InterruptedException
	{
		contactDelail.click();
		Thread.sleep(3000);
		Edit.click();
		Thread.sleep(3000);
		AddStreet1.sendKeys(strStreet1);
		AddStreet2.sendKeys(strStreet2);
		City.sendKeys(strCity);
		State.sendKeys(strState);
		PostalCode.sendKeys(strPostalCode);
		Thread.sleep(4000);
		
		Select sel = new Select(Country);
		sel.selectByVisibleText("India");
		
		Thread.sleep(3000);
		Telephone.sendKeys(strTelephone);
		Mobile.sendKeys(strMobile);
		WorkTelephone.sendKeys(strWorkTelephone);
		WorkEmail.sendKeys(strWorkEmail);
        OtherEmail.sendKeys(strOtherEmail);	
        Thread.sleep(3000);
        Save.click();
	}
	
	
	
	
	
	

}
