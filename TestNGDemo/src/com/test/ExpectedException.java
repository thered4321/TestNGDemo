package com.test;

import org.testng.annotations.Test;

public class ExpectedException {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void Division(){
		int a=20;
		int div = a/0;
		System.out.println(div);
	}
	
}
