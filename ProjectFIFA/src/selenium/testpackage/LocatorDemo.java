package selenium.testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorDemo extends BaseClass {

	public static void main(String[] args) {

//		driver.get("https://www.facebook.com");
		
		driver.get("http://localhost:8080/login.do");
		
//		Enter the user name using the ID locator
//		WebElement unObj = driver.findElement(By.id("username"));
//		unObj.sendKeys("admin");
		
//		Using cssSelector locator
		WebElement unObj = driver.findElement(By.cssSelector("#username"));
		unObj.sendKeys("admin");
		
//		Using xpath locator
		driver.findElement(By.xpath("//*[@name='pwd']")).sendKeys("manager");
		
//		Click on the login button using xpath with text function 
//		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
//		Click on the login button using xpath with text function using contains() and GROUP INDEX concept
		driver.findElement(By.xpath("(//*[contains(text(),'Login')])[4]")).click();		
	}

}
