package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class LandingPageStepDefinition {
	public WebDriver driver;
	public String homePageproductName;
	public String offferPageProductName;
	TestContextSetup TestContextSetup;
	public LandingPageStepDefinition(TestContextSetup TestContextSetup)
	{
		this.TestContextSetup=TestContextSetup;
	}
	@Given("User is on GreenCart Landing Page")
	public void user_is_on_green_cart_landing_page() {
		TestContextSetup.driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

	}

	@When("user searched with ShortName {string} and extract actual name of product")
	public void user_searched_with_short_name_and_extract_actual_name_of_product(String shortName) throws InterruptedException {
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys(shortName);
		Thread.sleep(2000);
		homePageproductName = driver.findElement(By.cssSelector("h4[class='product-name']")).getText().split("-")[0]
				.trim();
		System.out.println(homePageproductName + "is extracted from Home Page");
	}

	@Then("user searched for  {string} ShortName in offers page")
	public void user_searched_for_short_name_in_offers_page(String shortName) throws InterruptedException {
		driver.findElement(By.linkText("Top Deals")).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String parentWindow = i1.next();
		String childWindow = i1.next();
		driver.switchTo().window(childWindow);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
		Thread.sleep(2000);
		offferPageProductName = driver.findElement(By.xpath("//tr/td[1]")).getText();

	}

	@Then("Validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
		Assert.assertEquals(homePageproductName, offferPageProductName);

	}

}
