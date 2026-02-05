package testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import demo.TestNGBase;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends TestNGBase{
	@Test
	public void verifyUserLoginWithValidCredentials() throws IOException
	{
		//WebElement user = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
//		user.sendKeys("standard_user");
		//WebElement pass = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		//pass.sendKeys("secret_sauce");
		//WebElement loginbutton = driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		//loginbutton.click();
		String usernamevalue = ExcelUtility.getStringData(0, 0,"LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1,"LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickOnLoginButton();
	}
	@Test
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(1, 0,"LoginPage");
		String passwordvalue = ExcelUtility.getStringData(1, 1,"LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickOnLoginButton();
	}
	@Test
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(2, 0,"LoginPage");
		String passwordvalue = ExcelUtility.getStringData(2, 1,"LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickOnLoginButton();
	}
	@Test
	public void verifyUserLoginWithInvalidCredentials() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(3, 0,"LoginPage");
		String passwordvalue = ExcelUtility.getStringData(3, 1,"LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickOnLoginButton();
	}
}
