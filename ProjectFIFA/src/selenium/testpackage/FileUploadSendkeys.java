package selenium.testpackage;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadSendkeys extends BaseClassFirfox{

	public static void main(String[] args) {
		
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		String filePath = "E:\\Personal\\Automation\\QSpider\\notepad.txt";
		
		WebElement chooseFile = driver.findElement(By.xpath("//input[@type = \"file\"][2]"));
		chooseFile.sendKeys(filePath);
	
//		uploadButton.click();
	}

}
