package seleniumbasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWebElement extends Base{
	public void verifyWebElements()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messageBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messageBox.sendKeys("test message");
		WebElement showmsgbutton = driver.findElement(By.xpath("//button[@id='button-one']"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(showmsgbutton));
		
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(showmsgbutton));
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
