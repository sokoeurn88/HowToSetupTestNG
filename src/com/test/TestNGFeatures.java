package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {

	@Test
	public void loginTest0() {
		System.out.println("login test");
		//int i = 9/0;
	}

	@Test(dependsOnMethods="loginTest0")
	public void HomePageTest() {
		System.out.println("home page test");
	}

	@Test(dependsOnMethods="loginTest0")
	public void searchPageTest1() {
		System.out.println("search Page test1");
	}

	@Test(dependsOnMethods="loginTest0")
	public void registerPageTest1() {
		System.out.println("registration Page test1");
	}

}
