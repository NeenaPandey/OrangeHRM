package com.HRM_Test;

import java.io.IOException;
import org.testng.annotations.Test;
import com.HRM_Genrics.AutoConstant;
import com.HRM_Genrics.BaseTest;
import com.HRM_Genrics.ExcelLibrary;
import com.POM_HRM.HRM_Leave;
import com.POM_HRM.HRM_LoginLogout;

public class HRM_LeaveTest extends BaseTest implements AutoConstant

{
	
	
	@Test
	public void hrmLeave() throws IOException
	{
		HRM_LoginLogout login = new HRM_LoginLogout (driver);
		login.HRM_login(ExcelLibrary.getcellvalue(excel_path, Login_sheet_Name, 1, 0),ExcelLibrary.getcellvalue(excel_path, Login_sheet_Name, 1, 1));
		
		HRM_Leave leave = new HRM_Leave(driver);
		leave.leaveMethod();
		
		
	}
	

}
