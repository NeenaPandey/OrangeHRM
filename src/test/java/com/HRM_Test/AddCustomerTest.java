package com.HRM_Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.HRM_Genrics.AutoConstant;
import com.HRM_Genrics.BaseTest;
import com.HRM_Genrics.ExcelLibrary;
import com.POM_HRM.AddCustomerPom;
import com.POM_HRM.HRM_LoginLogout;

public class AddCustomerTest extends BaseTest implements AutoConstant
{

	@Test
	public void addCutomerTest() throws IOException, InterruptedException
	{
		HRM_LoginLogout log = new HRM_LoginLogout(driver);
		log.HRM_login(ExcelLibrary.getcellvalue(excel_path, Login_sheet_Name, 1, 0),
				ExcelLibrary.getcellvalue(excel_path, Login_sheet_Name, 1, 1));
		Thread.sleep(3000);
		
		
		AddCustomerPom add = new AddCustomerPom(driver);
		add.addCustomer(ExcelLibrary.getcellvalue(excel_path,"createCustomer", 1, 0),
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
						ExcelLibrary.getcellvalue(excel_path,"createCustomer", 1, 12));
		
	}
	

}
