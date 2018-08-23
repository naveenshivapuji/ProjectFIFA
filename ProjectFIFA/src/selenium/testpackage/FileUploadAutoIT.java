package selenium.testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadAutoIT extends BaseClass{

	public static void main(String[] args) {

		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		String filePath = "E:\\Personal\\Automation\\QSpider\\notepad.txt";
		
//		driver.findElement(By.xpath("//input[@type = \"file\"][2]")).click();
		driver.findElement(By.xpath("//input[@type = 'file'][2]")).click();



	}

}
