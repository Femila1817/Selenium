package com.TestNG;

import org.testng.annotations.Test;

public class SixExceptionTimeoutTest {
	
//	@Test(invocationTimeOut=2,expectedExceptions=NumberFormatException.class) //both option we dnt use much
//	public void infiniteLoopTest() {
//		int i = 1;
//		while(i==1) {
//			System.out.println(i);
//		}   //this will get executed infinite time : since i = 1 always
		
		@Test(expectedExceptions=NumberFormatException.class)
		public void test1() {
			String x = "100A";
			Integer.parseInt(x); //cannot convert this to integer, bcaus it has alphabets and number
			
		}
		
	}
