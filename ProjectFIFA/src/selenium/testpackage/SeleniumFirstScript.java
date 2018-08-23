package selenium.testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstScript {

	public static void main(String[] args) {

		// Set the path of the chrome driver chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver();

		// Enter the url
		driver.get("http://www.facebook.com");

		// Print the title of the page
		String title = driver.getTitle();
		System.out.println("The title of the book is : " + title);

		// Print the current url of the page
		System.out.println("The URL of facebook is : " + driver.getCurrentUrl());

		// To close the current browser
		driver.close();
		// driver.quit();// to quit all the pages opened by Selenium session.
	}

}
