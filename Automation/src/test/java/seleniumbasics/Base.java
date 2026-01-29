package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
public static WebDriver driver;
	
	public void browserInitialization()
	{
		driver= new ChromeDriver();
		//driver= new FirefoxDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
		
//		driver= new EdgeDriver();
		//firefox
		//driver= new FirefoxDriver();
	}
	public void closeAndQuit() {
		driver.close();
		driver.quit();
	}

	public static void main(String[] args) 
	{
		Base base= new Base();
		base.browserInitialization();
		base.closeAndQuit();
		// TODO Auto-generated method stub

	}


}

