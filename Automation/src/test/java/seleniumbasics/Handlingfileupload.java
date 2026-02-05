package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Handlingfileupload extends Base{
	public void fileuploadusingsendkeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement fileupload = driver.findElement(By.id("uploadfile_0"));
		fileupload.sendKeys("C:\\Users\\hp\\git\\SeleniumAutomation\\Automation\\src\\test\\resources\\Super.pdf");
		WebElement checkbox = driver.findElement(By.id("terms"));
		checkbox.click();
		WebElement submitbutton = driver.findElement(By.id("submitbutton"));
		submitbutton.click();
	}
	
	public void fileuploadusingrobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement uploadbutton = driver.findElement(By.id("pickfiles"));
		uploadbutton.click();
		
		StringSelection string = new StringSelection("C:\\Users\\hp\\git\\SeleniumAutomation\\Automation\\src\\test\\resources\\Super.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, null);
		
		Robot robot = new Robot();
		robot.delay(2500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

	public static void main(String[] args) {
		Handlingfileupload Files = new Handlingfileupload();
		Files.browserInitialization();
		//Files.fileuploadusingsendkeys();
		try {
			Files.fileuploadusingrobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
