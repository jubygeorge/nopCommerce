package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountRegistrationPage extends BasePage {
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	private By msgRegister = By.xpath("//h1[text()=\"Register\"]");
	private By txtFirstName = By.name("FirstName");
	private By txtLastName = By.name("LastName");
	private By txtEmail = By.name("Email");
	private By txtPassword = By.name("Password");
	private By txtConfirmPassword = By.name("ConfirmPassword");
	private By btnRegister = By.xpath("//button[@name='register-button']");

	private By msgRegistrationComplete = By.xpath("//div[text()=\"Your registration completed\"]");

	public String RegisterMessage() {
		try {
			return (driver.findElement(msgRegister).getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
	}

	public void setFirstName(String fname) {
		driver.findElement(txtFirstName).sendKeys(fname);
	}

	public void setLastName(String lname) {
		driver.findElement(txtLastName).sendKeys(lname);
	}

	public void setEmail(String email) {
		driver.findElement(txtEmail).sendKeys(email);
	}

	public String setPassword(String pwd) {
		driver.findElement(txtPassword).sendKeys(pwd);
		return pwd;
	}

	public void setConfirmPassword(String confirmpwd) {
		driver.findElement(txtConfirmPassword).sendKeys(confirmpwd);
	}

	public void BtnRegisterClick() {
		driver.findElement(btnRegister).click();
	}

	public String getConfirmationMsg() {
		try {
			return (driver.findElement(msgRegistrationComplete).getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}

}
