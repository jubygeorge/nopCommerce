package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
private By  lnkLogin = By.linkText("Log in");
By usernameField = By.name("Email");
By passwordField = By.name("Password");
By loginButton   = By.xpath("//button[@type=\"submit\"]");
By loginmessage  = By.linkText("My account");

public void clickLoginLink()
{
	driver.findElement(lnkLogin).click();
}

public void clickLoginBtn()
{
	driver.findElement(loginButton).click();
}
public void enterUsername(String username) {
    driver.findElement(usernameField).sendKeys(username);
}

public void enterPassword(String password) {
    driver.findElement(passwordField).sendKeys(password);
}

public boolean verifyAccountmsg() {
    return driver.findElement(loginmessage).isDisplayed();
}
}
