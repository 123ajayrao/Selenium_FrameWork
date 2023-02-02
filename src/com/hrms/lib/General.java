package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import com.hrms.utility.Log;

public class General extends Global
{
//To Provide all re-usable fun:/methods related to whole application
	public void openApplication() 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");//Console
		Reporter.log("Application Opened");//Html Report
		Log.info("Application Opened");//log file
	}
	public void closeApplication() 
	{
	    driver.close();
	    System.out.println("Application closed");
	    Log.info("Application closed");
	}
	public void login() 
	{
	    driver.findElement(By.name(txt_loginname)).sendKeys(un);
	    driver.findElement(By.name(txt_password)).sendKeys(pw);
	    driver.findElement(By.name(btn_login)).click();
	    System.out.println("Login completed");
	    Log.info("Login completed");
	}
	public void logout() 
	{
	    driver.findElement(By.linkText(link_logout)).click();
	    System.out.println("Logout completed");
	    Log.info("Logout completed");
	}
	public void Enter_Frame()
	{
		driver.switchTo().frame(frame);
		System.out.println("Entered into Frame");
		Log.info("Entered into Frame");
	}
	public void Exit_Frame()
	{
		driver.switchTo().defaultContent();
		System.out.println("Exit from Frame");
		Log.info("Exit from Frame");
	}
	public void AddNewEmp() throws Exception
	{
		driver.findElement(By.xpath(btn_Add)).click();
		System.out.println("Click on Add Button");
		Thread.sleep(2000);
		driver.findElement(By.name(lastname)).sendKeys(txt_ELN);
		driver.findElement(By.name(firstname)).sendKeys(txt_EFN);
		driver.findElement(By.id(Save_btn)).click();
		System.out.println("New Employee Added");
		Log.info("New Employee Added");
	}
	public void DeleteEmp() throws Exception
	{
		Select sc = new Select(driver.findElement(By.name(DDMenu)));
		sc.selectByValue("0");
		Thread.sleep(2000);
		driver.findElement(By.name(DDMenu)).sendKeys("10001");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("chkLocID[]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		System.out.println("Employee Successfully Deleted");
		Log.info("Employee Info Deleted");
	}
}