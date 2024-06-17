package Test;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstartComponents.AbstractComponent;

public class F_3_CartPage1 extends AbstractComponent{

	@FindBy(css = ".totalRow button")
	WebElement checkoutEle;

	@FindBy(css = ".cartSection h3")
	List<WebElement> cartProducts;


	WebDriver driver;
	public F_3_CartPage1(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}




public Boolean VerfifyProductDisplay(String productName)
{
	Boolean match = cartProducts.stream().anyMatch(product->product.getText().equalsIgnoreCase(productName));
	return match;

}

public F_4_CheckoutPage1 goToCheckout()
{
checkoutEle.click();
return  new F_4_CheckoutPage1(driver);

}

}
