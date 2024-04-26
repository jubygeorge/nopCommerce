package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.LoginPage;
import pageObjects.SearchPage;

public class SearchSteps {
	WebDriver driver;
	SearchPage searchPage;
	
	@Given("User enter {string} in the search box")
	public void user_enter_in_the_search_box(String searchtext) {
		searchPage=new SearchPage(BaseClass.getDriver());
		searchPage.enterTextInSearchBox(searchtext);
	}

	@Given("User clicks search button")
	public void user_clicks_search_button() {
		searchPage.clickSearchButton();
	}
	@Then("User will see a search section with the search keyword")
	public void user_will_see_a_search_section_with_the_search_keyword() {
	   
	}

	@And("Search item will be displayed to the user")
	public void search_item_will_be_displayed_to_the_user() {
	    
	}
	@Given("User is browsing the nopCommerce menu items")
	public void user_is_browsing_the_nop_commerce_menu_items() {
	    
	}

	@Then("User will be able to view the top level menu items")
	public void user_will_be_able_to_view_the_top_level_menu_items() {
		searchPage=new SearchPage(BaseClass.getDriver());
		searchPage.viewTopMenuItems();
	}

}
