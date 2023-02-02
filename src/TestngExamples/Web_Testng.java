package TestngExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Web_Testng 
{
	WebDriver driver;
@BeforeClass
public void startUp()
{
	System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
}
@AfterClass
public void tearDown()
{
	driver.close();
}
@Test
public void tc001() throws Exception
{
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Reporter.log("Application opened");
	driver.findElement(By.name("textUserName")).sendKeys("nareshit");
	driver.findElement(By.name("textPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	Reporter.log("Login Completed");
	Reporter.log(driver.getTitle());
	System.out.println("Login Completed");
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout Completed");
}
}
