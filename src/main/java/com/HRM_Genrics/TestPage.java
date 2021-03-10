package com.HRM_Genrics;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class TestPage {

	public void SelectDateInCalender(String Date, WebElement clickOnyear, WebElement clickOnMonth , WebDriver driver) throws InterruptedException
	{
		// Date
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate  CalendarDate = LocalDate.parse(Date, df);

		Select CalendarYear = new Select(clickOnyear);
		CalendarYear.selectByVisibleText(String.valueOf(CalendarDate.getYear()));

		Select CalendarMonth = new Select(clickOnMonth);
		CalendarMonth.selectByIndex(CalendarDate.getMonthValue()-1);
		Thread.sleep(1000);
		WebElement dayOfMonth = driver.findElement(By.xpath("//a[.='"+CalendarDate.getDayOfMonth()+"']"));
		dayOfMonth.click();
	}



}
