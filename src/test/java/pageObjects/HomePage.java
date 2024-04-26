package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	private By lnkRegister  = By.linkText("Register");
	
	public void clickAccountRegisterLink()
	{
		driver.findElement(lnkRegister).click();;
	}

}
