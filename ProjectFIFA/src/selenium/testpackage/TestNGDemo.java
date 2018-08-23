package selenium.testpackage;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {

	@Test

	public void helloTestNG() {
		Reporter.log("First TestNG Program");
	}

	@BeforeMethod
	public void second() {
		Reporter.log("Before Method Executed");
	}

}
