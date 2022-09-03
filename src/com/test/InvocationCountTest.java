package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	//if you want to run 10 time: invocationCount = 10
	
	@Test(invocationCount = 10)
	public void sum() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("The sum is: "+c);
	
	}

}
