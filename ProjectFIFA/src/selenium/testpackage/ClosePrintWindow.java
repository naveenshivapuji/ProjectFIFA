package selenium.testpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class ClosePrintWindow extends BaseClassFirfox {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {

		driver.get("http://localhost:8080/login.do");
		
		//Use Ctrl+P to launch the Print window
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
//		r.keyRelease(0); write the code to release  the key
		
		Thread.sleep(3000);
		Runtime.getRuntime().exec(".\\autoIT\\printpopup.exe");
	}
}
