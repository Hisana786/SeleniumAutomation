package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingWebElement extends Base{
	public void verifyWebElements()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messageBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messageBox.sendKeys("test message");
		WebElement showmsgbutton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showmsgbutton.click();
		WebElement textMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(textMessage.getText());//to see the test
	}

	public static void main(String[] args) {
		HandlingWebElement webelement = new HandlingWebElement();
		webelement.browserInitialization();
		webelement.verifyWebElements();
	}
}
