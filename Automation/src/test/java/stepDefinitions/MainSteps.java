package stepDefinitions;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
		System.out.println("User landed on netbanking page");
	}

	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page()
	{
	System.out.println("User landed on netbanking page");


	}

	@When("User SingUp into application")
	public void user_sing_up_into_application(List<String> data) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}

//	@When("User login into application with {string} and password {string}")
//	public void user_login_into_application_with_and_password(String username, String password) {
//		System.out.println(username + " " + password);
//	}
//	
	@When("^User login into application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password(String username, String password) {
		System.out.println(username + " " + password);
	}

	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Home page is displayed");
	}

	@Then("Cards are displayed")
	public void cards_are_displayed() {
		System.out.println("Cards are displayed");
	}

	@Given("setup the entries in database")
	public void setup_the_entries_in_database() {

		System.out.println("############################");
		System.out.println("setup the entries in database");
	}

	@Given("launch the browser from config variables")
	public void launch_the_browser_from_config_variables() {
		System.out.println("launch the browser");
	}

	@Given("hit the home page url of the banking site")
	public void hit_the_home_page_url_of_the_banking_site() {
		System.out.println("hit the home page url");
	}

}
