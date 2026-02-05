package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement info;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']")WebElement newsbutton;
	@FindBy(xpath="//textarea[@id='news']")WebElement news;
	@FindBy(xpath="//button[@type='submit']")WebElement save;
	@FindBy(xpath="//a[@href='javascript:void(0)']")WebElement searchbutton;
	@FindBy(xpath="//input[@type='text']")WebElement text;
	@FindBy(xpath="//button[@type='submit']")WebElement search;
	@FindBy(xpath="//i[@class='ace-icon fa fa-sync-alt']")WebElement reset;
	
	public void clickOnMoreInfo()
	{
		info.click();
	}
	
	public void clickOnNewsButton()
	{
		newsbutton.click();
	}
	
	public void enterNewsOnNewsField(String newsformat)
	{
		news.sendKeys(newsformat);
	}
	
	public void clickOnSaveButton()
	{
		save.click();
	}
	
	public void clickOnSearchButton()
	{
		searchbutton.click();
	}
	
	public void enterNewsonSearchField(String newsformat)
	{
		text.sendKeys(newsformat);
	}
	
	public void clickOnSubmitButton()
	{
		search.click();
	}
	
	public void cickOnResetButton()
	{
		reset.click();
	}
}
