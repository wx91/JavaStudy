package com.wangx.testng;

import org.testng.annotations.Test;

@Test(groups = { "class-group" })
public class TestNGGroupsTest {

	@Test(groups = { "group1", "group2" })
	public void testMethod1() {
		System.out.println("测试调用了testMethod1方法");
	}

	@Test(groups = { "group1", "group2" })
	public void testMethod2() {
		System.out.println("测试调用了testMethod2方法");
	}

	@Test(groups = { "group1" })
	public void testMethod3() {
		System.out.println("测试调用了testMethod3方法");
	}
}
