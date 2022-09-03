package com.test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasic {
	//pre-condition annotation starting with @Before
	@BeforeSuite
	public void setUp() {
		System.out.println("setup system property for Chrome 1");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch Chrome Browser 2");
	}
	
	@BeforeClass
	public void enterURL() {
		System.out.println("login to app 3");
	}
	
	@BeforeMethod
	public void loin() {
		System.out.println("enter url 4");
	}
	
	//test case starting with @Test
	@Test
	public void googleTitleTest() {
		System.out.println("google title test 5");
	}
	
	@Test
	public void searchTest() {
		System.out.println("search test");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("google Logo test");
	}
	
	//post condition starting with @After
	@AfterMethod
	public void logOut() {
		System.out.println("logout from app 6");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("close Browser 8");
	}
	
	@AfterTest
	public void delectAllCookies() {
		System.out.println("delectAllCookies 7");
	}
	
	@AfterSuite
	public void generateTestReport(){
		System.out.println("generateTestReport 9");
	}

}
