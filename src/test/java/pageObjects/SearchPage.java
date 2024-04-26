package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {
	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	private By txtSearchBox  = By.xpath("//input[@id=\"small-searchterms\"]");
	private By btnSearch     = By.xpath("//button[@class=\"button-1 search-box-button\"]");
	//private By menuTopItems  = By.xpath("//ul[@class=\"top-menu notmobile\"]//li[1]//a");
	private By menuTopItems  = By.xpath("//ul[@class=\"top-menu notmobile\"]");
	//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']
	//ul[@class='top-menu notmobile']//a[@ href='/desktops']
	
	public void enterTextInSearchBox(String searchtext)
	{
		driver.findElement(txtSearchBox).sendKeys(searchtext);
	}
	
	public void clickSearchButton()
	{
		driver.findElement(btnSearch).click();
	}
	public void viewTopMenuItems()
	{
		//List<WebElement> options=driver.findElements(menuTopItems);
		WebElement items=driver.findElement(menuTopItems);
		//find total number of options
				//System.out.println("Total number of options:"+options.size());
				System.out.println(items.getText());
				
	}
}
