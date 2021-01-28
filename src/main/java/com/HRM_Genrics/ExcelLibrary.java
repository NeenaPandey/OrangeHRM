package com.HRM_Genrics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant
{
	public static String getcellvalue(String path, String sheet, int row, int cell) throws IOException
	{
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String getcellvalue1 =wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		wb.close();
		return getcellvalue1;
	}
}
