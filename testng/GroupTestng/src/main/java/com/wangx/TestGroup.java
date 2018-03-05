package com.wangx;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestGroup {

	@BeforeGroups("database")
	public void setupDB() {
		System.out.println("setupDB");
	}

	@AfterGroups("database")
	public void clearDB() {
		System.out.println("clearDB");
	}

	@Test(groups = "database")
	public void testConnectOracle() {
		System.out.println("testConnectOracle()");
	}

	@Test(groups = "database")
	public void testConnectMsSQL() {
		System.out.println("testConnectMsSQL");
	}

	@Test(groups = "selenium-test")
	public void runSelenium() {
		System.out.println("runSelenium()");
	}

	@Test(groups = "selenium-test")
	public void runSelenium1() {
		System.out.println("runSelenium()1");
	}

	@Test(dependsOnGroups = { "database", "selenium-test" })
	public void runFinal() {
		System.out.println("runFinal");
	}

}
