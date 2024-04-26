package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

import org.junit.Assert;

public class LoginSteps {
	WebDriver driver;
	//HomePage hp;
    LoginPage lp;
  	@Given("the user is on the nopCommerce login page")
	public void the_user_is_on_the_nop_commerce_login_page() {
  		lp=new LoginPage(BaseClass.getDriver());
		lp.clickLoginLink();
	}

	@When("the user enters valid credentials \\(username: {string}, password: {string})")
	public void the_user_enters_valid_credentials_username_password(String email, String pwd) {
		 lp.enterUsername(email);
		 lp.enterPassword(pwd);
	}
	@When("the user clicks on the Login button")
	public void the_user_clicks_on_the_login_button() {
		 lp.clickLoginBtn();
	}

    @Then("the user should be redirected to the My Account page")
	public void the_user_should_be_redirected_to_the_my_account_page() {
//		boolean status = lp.verifyAccountmsg();
//		Assert.assertEquals(status, true);
	}
	@And("the user should see a welcome message")
	public void the_user_should_see_a_welcome_message() {
//	    boolean welcomemessage = driver.findElement(By.xpath("//h2[text()=\"Welcome to our store\"]")).isDisplayed();
//	    Assert.assertEquals(welcomemessage, true);
	}

}
