package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
//To provide testdata & Objects to whole application
//**********Test_Data
	public WebDriver driver;
//            DT  Var	VV
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un  = "nareshit";
	public String pw  = "nareshit";
	public String txt_ELN = "Tendulkar";
	public String txt_EFN = "Sachin";
//***************** Objects / Elements
	public String txt_loginname = "txtUserName";
	public String txt_password  = "txtPassword";
	public String btn_login     = "Submit";
	public String link_logout   = "Logout";
//Add New Employee
	public String lastname = "txtEmpLastName";
	public String firstname = "txtEmpFirstName";
	public String Save_btn = "btnEdit";
	public String btn_Add = "//input[@value='Add'][@type='button']";
//Delete Employee 
	public String frame = "rightMenu";
	public String DDMenu = "loc_code";
	
}
