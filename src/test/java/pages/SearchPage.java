
package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class SearchPage{
	
	private WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using = "lst-ib")
	public WebElement searchBox;
	
	
	@FindBy(how=How.NAME,using = "btnK")
	public WebElement searchButton;
	
	
	
//xpath to click 3rd link
	
	@FindBy(how=How.XPATH,using ="((//div[@class='g']//h3/a[not(ancestor::div[@class='xIleA'])]))")
	public List<WebElement> resultslink;
	
	
	

}
