package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import main.AutomationCore;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends AutomationCore{
	@Test
	public void verifyWhetherUserisAbletoLogoutSuccessfully() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(0, 0,"LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1,"LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickOnSignInButton();
		
		HomePage home = new HomePage(driver);
		home.clickOnAdminLogoutButton();
		home.clicOnLogoutButton();
	}

}
