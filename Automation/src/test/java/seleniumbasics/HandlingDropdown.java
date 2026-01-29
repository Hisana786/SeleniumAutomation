package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base{
	public void verifyDropdown() {
   	 driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
   	 WebElement dropdown1 = driver.findElement(By.id("dropdown-menu-1"));
   	 //object creation for predefined class 'select'
   	 Select select = new Select(dropdown1);
   	 //select by index value
   	 select.selectByIndex(3);
   	 //select by value 
   	 select.selectByValue("python");
   	 select.selectByVisibleText("sql");
    }
    
    public void verifyCheckbox() {
   	 driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
   	 WebElement checkbox = driver.findElement(By.xpath("//input[@value=\"option-1\"]"));
   	 checkbox.click();
   	 checkbox.click();
    }
    
    public void verifyRadiobutton()
    {
   	 driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
   	 WebElement radiobutton = driver.findElement(By.xpath("//input[@value='orange']"));
   	 radiobutton.click();
   	 WebElement radio = driver.findElement(By.xpath("//input[@value='yellow']"));
   	 radio.click();
    }
	public static void main(String[] args) {
		HandlingDropdown drop = new HandlingDropdown();
		drop.browserInitialization();
		//drop.verifyDropdown();
		drop.verifyCheckbox();
		drop.verifyRadiobutton();
	}


}
