package seleniumbasics;

public class HandlingBrowserCommand extends Base{
	public void browserCommand()
	{
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();//for getting url
		System.out.println(url);
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
	}

	public static void main(String[] args) {
		HandlingBrowserCommand bs = new HandlingBrowserCommand();
		bs.browserInitialization();
		bs.browserCommand();
		// TODO Auto-generated method stub

	}
}
