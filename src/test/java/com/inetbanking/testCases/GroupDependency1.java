package com.inetbanking.testCases;

import org.testng.annotations.Test;

public class GroupDependency1 {
	@Test(dependsOnMethods = {"method2"} )
	public void method1() {
		System.out.println("1st method");
	}
	@Test
	public void method2() {
		System.out.println("in method2");
	}
	

}
 