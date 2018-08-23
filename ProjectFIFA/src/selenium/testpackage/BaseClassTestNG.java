package selenium.testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseClassTestNG {
	@Test
	public void f() {
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("beforeMethod");

	}

	@BeforeClass
	public void beforeClass() {
		Reporter.log("beforeMethod");

	}

	@AfterClass
	public void afterClass() {
		Reporter.log("beforeMethod");
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("beforeMethod");
	}

	@AfterTest
	public void afterTest() {
		Reporter.log("beforeMethod");
	}

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("beforeSuite");

	}

	@AfterSuite
	public void afterSuite() {
		Reporter.log("afterSuite");

	}

}
