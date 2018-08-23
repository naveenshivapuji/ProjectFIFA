package selenium.testpackage;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertPopup extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		driver.findElement(By.cssSelector("[value = 'Confirmation Alert']")).click();;
		
		Alert alert = driver.switchTo().alert();
		
		String actualtext = alert.getText();
		System.out.println(actualtext);
		
		if(actualtext.equals("Are you sure you want to give us the deed to your house?"))
		{
			System.out.println("Valid Alert message ");
		}else {
			System.out.println("Invalid Alert message");
		}
		
		Thread.sleep(3000);
		alert.accept();
		
		Thread.sleep(1000);
		driver.close();
		
	}

}
