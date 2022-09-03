package com.test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Validation {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "Driver97\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximise();
		driver.manage().delectAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
		
	@Test
	public void googleTitleTest() {
		
		String title = driver.getTitle();
		System.out.println("title");
		
		//validation use Assert
		Assert.assertEquals(title, 	"Google", "title is not matched");
		
	}
	
	@Test
	public void googleLogoTest() {
		boolean b = driver.findElements(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();	//isDisplay or not is boolean valuse
		Assert.assertTrue(b);	//if true passes
		Assert.assertTrue(b, "true");
	}
	
	@AfterMethod
	public void tearDown() {
		
	driver.close();
	}
}
