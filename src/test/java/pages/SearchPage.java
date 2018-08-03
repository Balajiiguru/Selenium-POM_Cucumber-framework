
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
	
//Below xpath which will avoidd people search for section
	
	@FindBy(how=How.XPATH,using ="((//div[@class='g']//h3/a[not(ancestor::div[@class='xIleA'])])[3])")
	public WebElement thirdlink;
	
	
	

}
