package TestngExamples;

import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;

//Excel+WebDriver+TestNG
public class WD_Excel_Testng {
	WebDriver driver;

	@BeforeClass
	public void startUp() {
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

	@Test
	public void tc001() throws Exception {
		// Excel
		FileInputStream file = new FileInputStream("D:\\Selenium Class\\TestData.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet("Sheet1");
		
		String username = st.getCell(0, 1).getContents();
		String password = st.getCell(1, 1).getContents();
		Reporter.log(username);
		Reporter.log(password);
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Reporter.log("Application Opened"); // htmlReport
		
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		
		Reporter.log("Login completed");
		Reporter.log(driver.getTitle());
		System.out.println("Login completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
	}
}
