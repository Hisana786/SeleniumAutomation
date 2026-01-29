package seleniumbasics;

import org.openqa.selenium.By;

public class HandlingLocators extends Base{
	public void verifyLocators()
	{
		driver.findElement(By.id("button-one"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.name("description"));
		driver.findElement(By.className("form-control"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.partialLinkText("Simple"));
		driver.findElement(By.cssSelector("button[id= 'button-one']"));
		//8locators
		//html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button
	}
	public static void main(String[] args) {
		
	}
}
