package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Page_GoogleHomepage;


public class GoogleHome {
Page_GoogleHomepage googleHomepage=new Page_GoogleHomepage();
	
	@Given("^I launch Chrome browser$")
	public void I_launch_Chrome_browser() throws Exception{
		googleHomepage.launchBrowserWithFirefox();
	}
	
	@When("^I open Google Homepage$")
	public void I_open_Google_Homepage() throws Exception{
		googleHomepage.openGoogleURL();
	}
	@Then("^I verify that the page displays search text box$")
	public void I_verify_that_the_page_displays_search_text_box() throws Exception{
		googleHomepage.checkSearchBoxIsDisplayed();;
	}
	@Then("^the page displays Google Search button$")
	public void the_page_displays_Google_Search_button() throws Exception{
		googleHomepage.checkGoogleSearchButtonIsDisplayed();
	}
	
	@Then("^the page displays Im Feeling Lucky button$")
	public void the_page_displays_Im_Feeling_Lucky_button() throws Exception{
		googleHomepage.checkImFeelingLuckyButtonIsDisplayed();
	}
}
