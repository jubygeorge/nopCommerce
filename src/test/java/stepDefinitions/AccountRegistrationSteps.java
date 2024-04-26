package stepDefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class AccountRegistrationSteps {

	WebDriver driver;
	HomePage hp;
	AccountRegistrationPage accRegisterpage;
	String password;

	@Given("User navigates to Register Account page")
	public void user_navigates_to_register_account_page() {

		hp = new HomePage(BaseClass.getDriver());
		hp.clickAccountRegisterLink();
		accRegisterpage = new AccountRegistrationPage(BaseClass.getDriver());
		String regMsg = accRegisterpage.RegisterMessage();
		System.out.println("Registration screen Tesxt : " + regMsg);
	}

	@When("User enters the details into below fields")
	public void user_enters_the_details_into_below_fields(DataTable dataTable) {//io.cucumber.datatable.DataTable dataTable
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		// For other transformations you can register a DataTableType.

		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);

		accRegisterpage.setFirstName(dataMap.get("firstname"));
		accRegisterpage.setLastName(dataMap.get("lastname"));

	}

	@When("User enters valid email")
	public void user_enters_valid_email() {
		accRegisterpage.setEmail(BaseClass.randomAlphaNumeric() + "@gmail.com");
	}

	@When("valid password")
	public void valid_password() {
		password = accRegisterpage.setPassword(BaseClass.randomAlphaNumeric());
	}

	@When("Confirm password")
	public void confirm_password() {
		accRegisterpage.setConfirmPassword(password);
	}

	@When("User clicks on Register button")
	public void user_clicks_on_register_button() {
		accRegisterpage.BtnRegisterClick();
	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() {

	}

	@Then("User account should get created successfully with {string} message")
	public void user_account_should_get_created_successfully_with_message(String string) {
		accRegisterpage.getConfirmationMsg();
	}
}
