package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base{
	public void verifyrightclick()
	{
		WebElement right = driver.findElement(By.xpath("//a[@id='others']"));
		Actions actions =  new Actions(driver);
		actions.contextClick(right).build().perform();
	}
	
	public void verifymousehover()
	{
		//webelement
		WebElement right = driver.findElement(By.xpath("//a[@id='others']"));
		Actions actions =  new Actions(driver);actions.moveToElement(right).build().perform();
	}
	
	public void verifydraganddrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("draggable"));
		Actions action =  new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
	}

	public static void main(String[] args) {
		HandlingActions action = new HandlingActions();
		action.browserInitialization();
		//action.verifyrightclick();
		//action.verifymousehover();
		action.verifydraganddrop();
	}

}


