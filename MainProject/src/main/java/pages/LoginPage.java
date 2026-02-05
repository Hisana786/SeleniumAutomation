package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@name=\"username\"]")WebElement user;
	@FindBy(xpath = "//input[@name=\"password\"]")WebElement pass;
	@FindBy(xpath = "//button[@type=\"submit\"]")WebElement signinbutton;
	
	public void enterUsernameOnUsernameField(String usernamevalue)
	{
		user.sendKeys(usernamevalue);
	}
	
	public void enterPasswordOnPasswordField(String passwordvalue)
	{
		pass.sendKeys(passwordvalue);
	}
	
	public void clickOnSignInButton()
	{
		signinbutton.click();
	}
}
