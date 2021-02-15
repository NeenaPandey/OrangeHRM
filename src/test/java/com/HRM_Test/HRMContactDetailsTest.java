package com.HRM_Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.HRM_Genrics.AutoConstant;
import com.HRM_Genrics.BaseTest;
import com.HRM_Genrics.ExcelLibrary;
import com.POM_HRM.AddCustomerPom;
import com.POM_HRM.HRMContactDetails;
import com.POM_HRM.HRM_LoginLogout;

public class HRMContactDetailsTest extends BaseTest implements AutoConstant
{

@Test
public void contactDetailsTest() throws IOException, InterruptedException  
{
	HRM_LoginLogout login = new HRM_LoginLogout(driver);
	login.HRM_login(ExcelLibrary.getcellvalue(excel_path, "Login", 1, 0),
			ExcelLibrary.getcellvalue(excel_path, "Login", 1, 1));
	
	AddCustomerPom addCustomer = new AddCustomerPom(driver);
	addCustomer.addCustomer(ExcelLibrary.getcellvalue(excel_path,"createCustomer", 1, 0),
			ExcelLibrary.getcellvalue(excel_path,"createCustomer", 1, 1),
			ExcelLibrary.getcellvalue(excel_path,"createCustomer", 1, 2),
			ExcelLibrary.getcellvalue(excel_path,"createCustomer", 1, 3),
			ExcelLibrary.getcellvalue(excel_path,"createCustomer", 1, 4), 
			ExcelLibrary.getcellvalue(excel_path,"createCustomer", 1, 5),
			ExcelLibrary.getcellvalue(excel_path,"createCustomer", 1, 6),
			ExcelLibrary.getcellvalue(excel_path,"createCustomer", 1, 7),
			ExcelLibrary.getcellvalue(excel_path,"createCustomer", 1, 8),
			ExcelLibrary.getcellvalue(excel_path,"createCustomer", 1, 9),
			ExcelLibrary.getcellvalue(excel_path,"createCustomer", 1, 10),
			ExcelLibrary.getcellvalue(excel_path,"createCustomer", 1, 11),
			ExcelLibrary.getcellvalue(excel_path,"createCustomer", 1, 12),
			ExcelLibrary.getcellvalue(excel_path,"createCustomer", 1, 13),
			ExcelLibrary.getcellvalue(excel_path,"createCustomer", 1, 14)
			);
	
	HRMContactDetails contact = new HRMContactDetails(driver);
	contact.contactDetails(ExcelLibrary.getcellvalue(excel_path, "contactDetails", 1, 0),
			ExcelLibrary.getcellvalue(excel_path, "contactDetails", 1, 1),
			ExcelLibrary.getcellvalue(excel_path, "contactDetails", 1, 2),
			ExcelLibrary.getcellvalue(excel_path, "contactDetails", 1, 3),
			ExcelLibrary.getcellvalue(excel_path, "contactDetails", 1, 4),
			ExcelLibrary.getcellvalue(excel_path, "contactDetails", 1, 5),
			ExcelLibrary.getcellvalue(excel_path, "contactDetails", 1, 6),
			ExcelLibrary.getcellvalue(excel_path, "contactDetails", 1, 7),
			ExcelLibrary.getcellvalue(excel_path, "contactDetails", 1, 8),
			ExcelLibrary.getcellvalue(excel_path, "contactDetails", 1, 9));
	

}

}
