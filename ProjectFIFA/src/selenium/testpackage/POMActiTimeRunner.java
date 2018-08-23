package selenium.testpackage;

import java.sql.Driver;

public class POMActiTimeRunner extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		driver.get("http://localhost:8080/login.do");

		POMActiTime POMactiTime = new POMActiTime(driver);
		
		POMactiTime.setUsername("admin");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		POMactiTime.setUsername("admin");
		POMactiTime.setPassword("manager");
		POMactiTime.clickLoginBtn();
		
	}
}
