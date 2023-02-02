package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC003 
{
	//public static void main(String[] args) throws Exception {
	@Test
	public void tc003() throws Exception 
	{
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.Enter_Frame();
		obj.DeleteEmp();
		obj.Exit_Frame();
		Thread.sleep(2000);
		obj.logout();
		obj.closeApplication();
	}
}
