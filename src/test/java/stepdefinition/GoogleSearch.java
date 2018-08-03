package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.CucumberRunner;
import pages.SearchPage;

public class GoogleSearch extends CucumberRunner {
	
	SearchPage searchpage=new SearchPage(driver);

	public String pageTitle;
	
	@Given("^I navigate to Google page$")
	public void i_navigate_to_google_page() throws Throwable {
		
		setEnv();
		
	}
	
	@When("^I perform search using Keyword \"(.*?)\"$")
	public void i_perform_search_using_keyword_something(String text) throws Throwable {
		
		searchpage.searchBox.sendKeys(text);
		searchpage.searchBox.sendKeys(Keys.ENTER);
	}
	
	@When("^I clicked the 3rd top level search results$")
	public void i_clicked_the_3rd_top_level_search_results()throws Throwable {
		
		
		pageTitle=searchpage.resultslink.get(2).getText();
		searchpage.resultslink.get(2).click();
	}
	
		
		
	
		
	@Then("^I should be navigated to clicked link corresponding webpage$")
	public void _should_be_navigated_to_clicked_link_corresponding_webpage() throws Throwable {
		String title = driver.getTitle();
		if(pageTitle == title) {
			Assert.assertTrue(true, "navigated to correct page");
		}
	}
	
	
}
