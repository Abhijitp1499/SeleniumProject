package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstartComponents.AbstractComponent;

public class F_2_ProductCatalogue1 extends AbstractComponent {

	WebDriver driver;

	public F_2_ProductCatalogue1(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// EveryChild Class needs to give driver to the parent class so we declare super
	// long with this

	@FindBy(css = ".mb-3")
	List<WebElement> products;

	@FindBy(css = ".ng-animating")
	WebElement spinner;


	By productsBy = By.cssSelector(".mb-3");
	By addToCart = By.cssSelector(".card-body button:last-of-type");
	By toastMessage = By.cssSelector("#toast-container");

	public List<WebElement> getProductList() {
		waitForElementToAppear(productsBy);
		return products;
	}

	public WebElement getProductByName(String productName) {
		WebElement prod = getProductList().stream()
				.filter(product -> product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst()
				.orElse(null);

		return prod;

	}

	public void addProductToCart(String productName)   {
		WebElement prod = getProductByName(productName);
		prod.findElement(addToCart).click();
		waitForElementToAppear(toastMessage);
		waitForElementToDisapper(spinner);
	}

}

/*
 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
 * ".mb-3")));
 *
 * List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
 *
 * WebElement prod = products.stream() .filter(product ->
 * product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).
 * findFirst() .orElse(null);
 * prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
 *
 * WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
 * wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.id(
 * "toast-container")));
 * ;
 */
