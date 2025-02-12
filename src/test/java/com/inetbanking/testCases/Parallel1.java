package com.inetbanking.testCases;

import org.testng.annotations.Test;

public class Parallel1 {
	@Test()  
	public void test1() {
		System.out.println("in test 1");
	}
	@Test()
	public void test2() {
		System.out.println("in test 2");
	}
	@Test()
	public void test3() {
		System.out.println("in test 3");
	}
	@Test()
	public void test4() {
		System.out.println("in test 4");
	}
	@Test() 
	public void test5() {
		System.out.println("in test 5");

}
}