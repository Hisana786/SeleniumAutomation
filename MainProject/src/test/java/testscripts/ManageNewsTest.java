package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import main.AutomationCore;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends AutomationCore{
	@Test
	public void verifyUserisAbletoAddNewNews() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(0, 0,"LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1,"LoginPage");
		String newsformat = ExcelUtility.getStringData(0, 0,"ManageNewsPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickOnSignInButton();
		
		ManageNewsPage manage = new ManageNewsPage(driver);
		manage.clickOnMoreInfo();
		manage.clickOnNewsButton();
		manage.enterNewsOnNewsField(newsformat);
		manage.clickOnSaveButton();
	}
	@Test
	public void verifyUserisAbletoSearchtheAddedNews() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(0, 0,"LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1,"LoginPage");
		String newsformat = ExcelUtility.getStringData(0, 0,"ManageNewsPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickOnSignInButton();
		
		ManageNewsPage manage = new ManageNewsPage(driver);
		manage.clickOnMoreInfo();
		manage.clickOnSearchButton();
		manage.enterNewsonSearchField(newsformat);
		manage.clickOnSubmitButton();
	}
	@Test
	public void verifyWhetherUserisAbletoResettheNews() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(0, 0,"LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1,"LoginPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickOnSignInButton();
		
		ManageNewsPage manage = new ManageNewsPage(driver);
		manage.clickOnMoreInfo();
		manage.cickOnResetButton();
	}

}
