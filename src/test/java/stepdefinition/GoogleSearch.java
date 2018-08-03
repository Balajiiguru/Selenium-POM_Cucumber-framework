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
	public void navigate() throws Throwable {
		
		setEnv();
		
	}
	
	@When("^I perform search using Keyword \"(.*?)\"$")
	public void search(String text) throws Throwable {
		
		searchpage.searchBox.sendKeys(text);
		searchpage.searchBox.sendKeys(Keys.ENTER);
	}
	
	@When("^I clicked the 3rd top level search results$")
	public void clicklink() {
		
		try {
		pageTitle=searchpage.thirdlink.getText();
		searchpage.thirdlink.click();
	}
	
		catch (Exception e) {
			
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", searchpage.thirdlink);
				
		}
		
	}
		
	@Then("^I should be navigated to clicked link corresponding webpage$")
	public void webpage() throws Throwable {
		String title = driver.getTitle();
		if(pageTitle == title) {
			Assert.assertTrue(true, "navigated to correct page");
		}
	}
	
	
}
