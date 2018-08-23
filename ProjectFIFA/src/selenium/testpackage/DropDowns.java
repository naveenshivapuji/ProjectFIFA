package selenium.testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDowns extends BaseClassFirfox {

	public static void main(String[] args) {

		driver.get("https://www.facebook.com/");
		
		WebElement dayOptions = driver.findElement(By.id("day"));
		Select dayObj = new Select(dayOptions);
		List<WebElement> allOptions = dayObj.getOptions();
		int allSize = allOptions.size();
		WebElement firstSelectedOption = dayObj.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
		System.out.println(allSize);
		List<WebElement> daySelectedOptions = dayObj.getAllSelectedOptions();
		int size = daySelectedOptions.size();
		System.out.println(size);
		dayObj.selectByValue("7");
		
		
		WebElement monthOption = driver.findElement(By.id("month"));
		Select monthObj = new Select(monthOption);
		monthObj.selectByValue("6");
		
		WebElement yearOptions = driver.findElement(By.id("year"));
		Select yearObj = new Select(yearOptions);
		yearObj.selectByValue("2012");
	}

}
