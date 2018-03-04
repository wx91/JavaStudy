package com.wangx.testng;



import static org.junit.Assert.assertNotNull;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGExceptionTest {

	private User user;

	@BeforeClass
	public void init() {
		user = null;
	}

	@Test(enabled = true, expectedExceptions = NullPointerException.class)
	public void testUser() {
		assertNotNull(user.getUserName());
	}

}
