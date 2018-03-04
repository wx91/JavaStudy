package com.wangx.testng;

import static org.junit.Assert.assertNotNull;

import org.testng.annotations.Test;

public class TestNGDependsTest {

	@Test
	public void testMethod1() {
		System.out.println("测试调用了testMethod1方法");
	}

	@Test
	public void testMethod2() {
		assertNotNull(new User());
		System.out.println("测试调用了testMethod2方法");
	}

	@Test(dependsOnMethods = { "testMethod1", "testMethod2" }, alwaysRun = true)
	public void testMethod3() {
		System.out.println("测试调用了testMethod3方法");
	}

}
