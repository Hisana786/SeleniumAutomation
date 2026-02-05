package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlert extends Base{
	public void verifyallerts() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealert = driver.findElement(By.xpath("//button[@id='alertButton']"));
		simplealert.click();
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	
	public void verifyconfirm()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmalert = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmalert.click();
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	
	public void verifyprompt()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptalert = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptalert.click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("Hello");
		al.accept();
		
	}

	public static void main(String[] args) {
		HandlingAlert alert = new HandlingAlert();
		alert.browserInitialization();
        alert.verifyallerts();
        alert.verifyconfirm();
        alert.verifyprompt();
	}

}


