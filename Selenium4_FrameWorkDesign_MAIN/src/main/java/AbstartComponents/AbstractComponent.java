package AbstartComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Test.F_3_CartPage;

public class AbstractComponent {

	WebDriver driver;

	public AbstractComponent(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "button[routerlink='/dashboard/cart']")
	WebElement CartHeader;
	
	public void waitForElementToAppear(By findBy) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));

		// We should not hardcode By.cssSelector(".mb-3") so we are passing By findBy as
		// an argument
		// By-class and findBy-variable name
	}

	public void waitForElementToDisapper(WebElement ele)   {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	
	public F_3_CartPage goToCartPage()
	{
		CartHeader.click();
		F_3_CartPage cartPage = new F_3_CartPage(driver);
		return cartPage;
	}
	
}

/*
 * wait.until(Expected
 * Conditions.invisibilityof(driver.findElement(By.cssSelector(".ng-animating"))
 * ));
 * 
 * 
 * 
 * driver.findElement(By.cssSelector("button[routerlink='/dashboard/cart']")).click()
 */