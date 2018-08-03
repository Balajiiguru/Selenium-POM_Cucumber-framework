
package pages;

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
	
	
	
	@FindBy(how=How.XPATH,using ="(//div[@class='rc'])[3]/h3/a")
	public WebElement thirdlink;
	
	
	

}
