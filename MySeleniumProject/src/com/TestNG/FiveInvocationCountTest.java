package com.TestNG;

import org.testng.annotations.Test;

public class FiveInvocationCountTest {

	
	@Test(invocationCount=10)
	public void sum() {  //if i wanted to do ths function 10 times? no need to write same test diff name 10 times
		int a = 20; 			//will use > Invocation Count
		int b = 30;
		int c = a + b;
		System.out.println("The sum is : " +c);
	}
}
