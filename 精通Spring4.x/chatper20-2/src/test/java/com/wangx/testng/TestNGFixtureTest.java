package com.wangx.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGFixtureTest {
	private User user;

	@BeforeClass
	private void beforeClass() throws Exception {
		System.out.println("在测试类执行第一个方法之前运行！");
	}

	@BeforeMethod
	private void setUp() throws Exception {
		System.out.println("在每个测试方法执行之前运行！");
		user = new User();
		user.setUserId(1);
		user.setUserName("admin");
	}

	@Test
	public void testUser() {
		assertEquals("admin", user.getUserName());
		assertEquals(1, user.getUserId());
	}

	@Test
	public void testUserId() {
		assertEquals(1, user.getUserId());
	}

	@AfterMethod
	private void tearDown() throws Exception {
		System.out.println("在每个测试方法执行之后运行！");
		user = null;
	}

	@AfterClass
	private void afterClass() throws Exception {
		System.out.println("在测试类执行最后一个方法之后运行！");
	}
}
