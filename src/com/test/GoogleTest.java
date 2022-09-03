package com.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
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

	@Test(priority=1,groups="title")
	public void googleTitletTest() {
		String title = driver.getTitle();
		System.out.println("title");
		
	}
	
	@Test(priority=3,groups="logo")
	public void googleLogoTest() {
		boolean b = driver.findElements(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();	//isDisplay or not is boolean valuse
		
	}
	
	@Test(priority=3,groups="links")
	public void mailLinkTest() {
		boolean c = driver.findElement(By.name("q")).isDisplayed();
		
	}
	
	@Test(priority=4,groups="logo")
	public void test1() {
		System.out.println("test1");
	}
	@Test(priority=5,groups="links")
	public void test2() {
		System.out.println("test2");
	}
	@Test(priority=6,groups="title")
	public void test3() {
		System.out.println("test3");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		
	}
}
