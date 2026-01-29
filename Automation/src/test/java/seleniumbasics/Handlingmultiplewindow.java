package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Handlingmultiplewindow extends Base{
	public void multipleWindowHandling()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		WebElement click = driver.findElement(By.xpath("//a[text()='Click Here']"));
		click.click();
		
		Set<String> handleIds = driver.getWindowHandles();
		System.out.println(handleIds);
		
		Iterator<String> it = handleIds.iterator();
		while(it.hasNext())
		{
			String currentId = it.next();
			if(!currentId.equals(parentWindow))
			{
				driver.switchTo().window(currentId);
				WebElement mailId = driver.findElement(By.xpath("//input[@name='emailid']"));
				mailId.sendKeys("test@gmail.com");//emailid
				WebElement submit = driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submit.click();
			}
		}
	}

	public static void main(String[] args) {
		Handlingmultiplewindow multipleWindow = new Handlingmultiplewindow();
		multipleWindow.browserInitialization();
		multipleWindow.multipleWindowHandling();
	}


}
