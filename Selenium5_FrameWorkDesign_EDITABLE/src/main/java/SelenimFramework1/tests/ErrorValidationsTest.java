package SelenimFramework1.tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Test.F_2_ProductCatalogue1;
import Test.F_3_CartPage1;
import TestComponents.BaseTest;

public class ErrorValidationsTest extends BaseTest {

	@Test(groups= {"ErrorHandling"},retryAnalyzer=TestComponents.Retry.class)


	public void LoginErrorValidations() throws IOException, InterruptedException {

		landingpage.loginApplication("rahul70@gmail.com", "wrongpassword");
		landingpage.getErrorMessage();
		Assert.assertEquals("Incorrect email password.", landingpage.getErrorMessage());
	}

	@Test
	public void ProductErrorValidation() throws IOException, InterruptedException {
		String productName = "ZARA COAT 33";

		F_2_ProductCatalogue1 productCatalogue = landingpage.loginApplication("nickjoker123@gmail.com","Nickjoker123");
		// rahul69@gmail.com // @Rahull111 //rahul70@gmail.com // @Rahul2222
		List<WebElement> products = productCatalogue.getProductList();

		productCatalogue.addProductToCart(productName);
		Thread.sleep(2000);
		F_3_CartPage1 cartPage = productCatalogue.goToCartPage();

		Boolean match = cartPage.VerfifyProductDisplay("ZARA COAT 33");
		Assert.assertFalse(match);

	}

}