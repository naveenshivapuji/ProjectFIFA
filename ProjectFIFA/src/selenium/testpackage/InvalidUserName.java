package selenium.testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class InvalidUserName extends BaseClass {

	public static void main(String[] args) {

//		Verify the invalid username and password along with the RED text
		
		driver.get("http://localhost:8080/login.do");
		driver.findElement(By.xpath("(//*[contains(text(),'Login')])[4]")).click();
		WebElement invalidUNPWD = driver.findElement(By.xpath("//span[.='Username or Password is invalid. Please try again.']"));

		String invalid = invalidUNPWD.getText();
		boolean errdisplayed = invalidUNPWD.isDisplayed();

		if (invalid.equals("Username or Password is invalid. Please try again."))
			System.out.println("Error message is displayed and correct ");
		else
			System.out.println("Error message is not displyaed");
		System.out.println("Invalid username and password message : " + invalid);

		// Verify the color of the error message is in RED color

		String colorvalue = invalidUNPWD.getCssValue("color");
		System.out.println("Initial color value" + colorvalue);
		String colorasHex = Color.fromString(colorvalue).asHex();
		
		if (colorasHex.equals("#ce0100"))
			System.out.println("Valid color RED");
		else
			System.out.println("Invalid color");
	}
}
