package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base{
	public void verifytable() {
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement fulltable = driver.findElement(By.xpath("//table[@id='dataTable']"));
		//System.out.println(fulltable.getText());
		WebElement tablerow = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]"));
		System.out.println(tablerow.getText());//get the details
				}

	public static void main(String[] args) {
		TableHandling table = new TableHandling();
		table.browserInitialization();
        table.verifytable();
	}

}
