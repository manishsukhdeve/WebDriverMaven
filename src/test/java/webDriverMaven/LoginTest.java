package webDriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() 
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mitansh\\eclipse-GitWebDriverMaven\\webDriverMaven\\drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		
	} 
	
	@Test
	public void doLogin() throws InterruptedException {
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium Testing");
		Thread.sleep(2000);
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
	
	
}
