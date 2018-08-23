package selenium.testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class CheckAlignment extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		driver.get("http://localhost:8080/login.do");

		//To verify the 'x' coordinate of the username field
		WebElement unObj = driver.findElement(By.id("username"));
		Point p = unObj.getLocation();
		int unxcar = p.getX();
		System.out.println("The X co-ordinate of username text field : " + unxcar);

		//To identify the 'x' coordinate of the password field
		WebElement pwdObj = driver.findElement(By.name("pwd"));
		int pwdxcar = pwdObj.getLocation().getX();
		System.out.println("The X co-ordinate of username text field : " + pwdxcar);
		
		//To verify without entering the username and password
//		driver.findElement(By.xpath("(//*[contains(text(),'Login')])[4]")).click();
//		
//		WebElement invalidUNPWD = driver.findElement(By.xpath("//span[.='Username or Password is invalid. Please try again.']"));
//		String invalid = invalidUNPWD.getText();
//		System.out.println("Invalid username and password message : " +invalid);
		
		//To verify the username field is enabled and displayed and fill the field with username
		boolean disp = unObj.isDisplayed();
		System.out.println(disp);
		boolean enabled = unObj.isEnabled();
		System.out.println(enabled);
		if (enabled == true && disp == true)
			System.out.println("Username field is Enabled and displayed also.");
		else 
			System.out.println("Username field is Enabled and displayed also.");
		boolean selected = unObj.isSelected();
		System.out.println(selected);
		unObj.clear();
		unObj.sendKeys("admin");

		//To verify the password field is enabled and displayed and fill the field with password
		boolean disp1 = pwdObj.isDisplayed();
		System.out.println(disp);
		boolean enabled1 = pwdObj.isEnabled();
		System.out.println(enabled);
		if (enabled1 == true && disp1 == true)
			System.out.println("Password field is Enabled and displayed also.");
		boolean selected1 = pwdObj.isSelected();
		System.out.println(selected);
		pwdObj.clear();
		pwdObj.sendKeys("manager");
		
		//To verify whether the check box is selected or not
		WebElement checkboxobj = driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println("to check if checkbox is selected");checkboxobj.isSelected();
		checkboxobj.click();
		String tooltip = checkboxobj.getAttribute("title");
		System.out.println("The tooltip of 'Keep me logged in check box' : "+tooltip);
		
		//To verify the actiTIME version and 'View License' link
		String xpath= "//nobr[contains(text(),'actiTIME')]";
		WebElement actiVersion = driver.findElement(By.xpath(xpath));
		String version = actiVersion.getText();
		System.out.println("The version of actiTIME : " +version);
		
		WebElement liceselink = driver.findElement(By.id("licenseLink"));
		String liceseTagName = liceselink.getTagName();
		if (liceseTagName.equals("a")) {
			System.out.println("'View Licence' is a link ");
			liceselink.click();
		}else {
			System.out.println("'View Licence' is not a link ");
		}
		
		//To verify alignment of the username and password fields
		int unheight = unObj.getSize().getHeight();
		System.out.println("The Height of the Username field : " + unheight);
		int unwidth = unObj.getSize().getWidth();
		System.out.println("The Width of the Username field : " + unwidth);

		int pwdheight = pwdObj.getSize().getHeight();
		System.out.println("The Height of the Password field : " + pwdheight);
		int pwdwidth = pwdObj.getSize().getWidth();
		System.out.println("The Width of the Passward field : " + pwdwidth);

		if (unxcar == pwdxcar && unheight == pwdheight && unwidth == pwdwidth)
		{
			System.out.println("Both the fields Username and Passward are perfectly aligned.");
		}else
			System.out.println("Username and Passward fields are not aligned");
		
		driver.findElement(By.xpath("(//*[contains(text(),'Login')])[4]")).click();
		System.out.println("Login Successful");
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
