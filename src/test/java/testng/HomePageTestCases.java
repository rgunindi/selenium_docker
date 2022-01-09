package testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Page_GoogleHomepage;

public class HomePageTestCases  {
	Page_GoogleHomepage googleHomepage=new Page_GoogleHomepage();

	@BeforeMethod
	public void beforeMethod()
	{
		googleHomepage.launchBrowserWithFirefox();
	}
	
	@Test
	public void searchGoogle()
	{
		googleHomepage.openGoogleURL();
		googleHomepage.checkSearchBoxIsDisplayed();;
		googleHomepage.checkGoogleSearchButtonIsDisplayed();
		googleHomepage.checkImFeelingLuckyButtonIsDisplayed();

	}
}
