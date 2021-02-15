package com.POM_HRM;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.HRM_Genrics.AutoConstant;
import com.HRM_Genrics.ExcelLibrary;
import com.HRM_Genrics.TestPage;

public class AddCustomerPom extends TestPage implements AutoConstant
{
	WebDriver driver;

	@FindBy(id="menu_pim_viewPimModule")
	private WebElement PIM;

	@FindBy(id="btnAdd")
	private WebElement Add;

	@FindBy(id="firstName")
	private WebElement FirstName;

	@FindBy(id="middleName")
	private WebElement MiddleName;

	@FindBy(id="lastName")
	private WebElement LastName;

	@FindBy(id="employeeId")
	private WebElement EmployeeId;

	@FindBy(id="chkLogin")
	private WebElement CreateLogignDetails;

	@FindBy(id="user_name")
	private WebElement UserName;

	@FindBy(id="user_password")
	private WebElement Password;

	@FindBy(id="re_password")
	private WebElement ConfirmPassword;

	@FindBy(id="status")
	private WebElement Status;

	@FindBy(id="btnSave")
	private WebElement SaveButton;
	
	@FindBy(id="btnSave")
	private WebElement EditButton;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement OtherId;
	
	@FindBy(id="personal_txtLicenNo")
	private WebElement DriverLicenseNo;

	@FindBy(xpath="(//img[@class='ui-datepicker-trigger'])[1]")
	private WebElement LicenseExpiry;
	
	@FindBy(xpath="//a[.='28']")
	private WebElement LicenseExpiryDate;
	
	@FindBy(id="personal_txtNICNo")
	private WebElement SNNnumber;
	
	@FindBy(id="personal_txtSINNo")
	private WebElement SINnumber;
	
	@FindBy(id="personal_optGender_2")
	private WebElement Gender;
	
	@FindBy(id="personal_cmbMarital")
	private WebElement MaritalStatus;
	
	@FindBy(id="personal_cmbNation")
	private WebElement Nationality;
	
	@FindBy(xpath="(//img[@class='ui-datepicker-trigger'])[2]")
	private WebElement CalendarOfBirth;
	
	@FindBy(xpath="//select[@data-handler='selectYear']")
	private WebElement DateOfBirth;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement clickOnyear;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement clickOnMonth;
	
	@FindBy(xpath="//a[.=9]")
	private WebElement BirthDate;
		
	@FindBy(id="personal_txtEmpNickName")
	private WebElement NickName;
	
	@FindBy(id="personal_txtMilitarySer")
	private WebElement Militreyservice;
	
	@FindBy(id="btnSave")
	private WebElement SaveAllDetails;
	
	public AddCustomerPom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}


	public void addCustomer(String strFirstName, String strMiddleName, String strLastName, String strEmployeeId, String strUserName,
							String strPassword,String strConfirmPassword, String strOtherId,String strDriverLicenseNo, String strSNNnumber,
							String strSINnumber, String strNickName, String strNone, String strDriverLicenseExpdate,
							String strDOB) throws IOException, InterruptedException 
	{
		PIM.click();
		Thread.sleep(2000);
		Add.click();
		Thread.sleep(2000);
		FirstName.sendKeys(strFirstName);
		MiddleName.sendKeys(strMiddleName);
		LastName.sendKeys(strLastName);
		EmployeeId.sendKeys(strEmployeeId);
		
		CreateLogignDetails.click();
		Thread.sleep(2000);
		Reporter.log(ExcelLibrary.getcellvalue(excel_path,"createCustomer", 1, 4), true);
		UserName.sendKeys(strUserName);
		Password.sendKeys(strPassword);
		ConfirmPassword.sendKeys(strConfirmPassword);

		Select sel = new Select(Status);
		sel.selectByVisibleText("Enabled");
		Thread.sleep(2000);
		SaveButton.click();
		
		EditButton.click();
		
		OtherId.sendKeys(strOtherId);
		DriverLicenseNo.sendKeys(strDriverLicenseNo);
		
		LicenseExpiry.click();
		SelectDateInCalender( strDriverLicenseExpdate,  clickOnyear,  clickOnMonth ,  driver);

				
		SNNnumber.sendKeys(strSNNnumber);
		SINnumber.sendKeys(strSINnumber);
		
		Gender.click();
		
		Select sel1 = new Select(MaritalStatus);
		sel1.selectByVisibleText("Other");
		Select sel2 =new Select(Nationality);
		sel2.selectByVisibleText("Indian");
		
		CalendarOfBirth.click();
		SelectDateInCalender( strDOB,  clickOnyear,  clickOnMonth ,  driver);
		
		
		/*Select sel3 = new Select(DateOfBirth);
		sel3.deselectByIndex(1999);*/
		
		NickName.sendKeys(strNickName);
		Militreyservice.sendKeys(strNone);
		
		Thread.sleep(3000);
		SaveAllDetails.click();
		
	}
}
		
		
		
		
	







