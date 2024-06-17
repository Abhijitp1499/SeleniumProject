package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstartComponents.AbstractComponent;

public class F_4_CheckoutPage1 extends AbstractComponent {

	WebDriver driver;

	public F_4_CheckoutPage1(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[placeholder='Select Country']")
	WebElement country;

	@FindBy(css = ".action__submit")
	WebElement submit;

	@FindBy(css = ".ta-item:nth-child(3)")
	WebElement selectCountry;

	By resutls = By.cssSelector("[class*='ta-results']");

	public void SelectCountry(String countryName) {

		Actions a = new Actions(driver);
		a.sendKeys(country, countryName).build().perform();

		waitForElementToAppear(resutls);

		selectCountry.click();
	}

	public F_5_ConfirmationPage1 submitOrder()
	{
		submit.click();
		return new F_5_ConfirmationPage1(driver);
	}

}
