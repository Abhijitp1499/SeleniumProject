package SelenimFramework1.pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import Test.F_1_LandingPage;
import Test.F_2_ProductCatalogue;
import Test.F_3_CartPage;

public class StandAloneTest_Editable {

	public static void main(String[] args) throws InterruptedException {
		String productName = "ZARA COAT 3";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		F_1_LandingPage landingpage = new F_1_LandingPage(driver);
		landingpage.goTo();
		F_2_ProductCatalogue productCatalogue = landingpage.loginApplication("nickjoker123@gmail.com", "Nickjoker123");

		
		List<WebElement> products = productCatalogue.getProductList();

		productCatalogue.addProductToCart(productName);
		F_3_CartPage cartPage = productCatalogue.goToCartPage();
		
		
		Boolean match = cartPage.VerfifyProductDisplay(productName);
		Assert.assertTrue(match);
		cartPage.goToCheckout();


	

		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Select Country']")), "india").build()
				.perform();

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class*='ta-results']")));
		driver.findElement(By.cssSelector(".ta-item:nth-child(3)")).click();
		driver.findElement(By.cssSelector(".action__submit")).click();

		String Order = driver.findElement(By.cssSelector("td .em-spacer-1 .ng-star-inserted")).getText();
		String OrderSplit = Order.split(" ")[1];
		System.out.println(OrderSplit);

	}

}