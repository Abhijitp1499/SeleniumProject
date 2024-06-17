package SelenimFramework1.pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class StandAloneTest_DO_NOT_CHANGE {

	public static void main(String[] args) throws InterruptedException {
		String productName = "ZARA COAT 3";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		
		
		driver.findElement(By.id("userEmail")).sendKeys("nickjoker123@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Nickjoker123");
		driver.findElement(By.id("login")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		
		
	List<WebElement> products =	driver.findElements(By.cssSelector(".mb-3"));
	
	WebElement prod = products.stream().filter(product->
	product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
		
	prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	
	WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(5));
	wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.id("toast-container")));
	
	driver.findElement(By.cssSelector("button[routerlink='/dashboard/cart']")).click();
	
	List<WebElement> cartProducts =  driver.findElements(By.cssSelector(".cartSection h3"));
	
	Boolean Value = cartProducts.stream().anyMatch(cp->cp.getText().equalsIgnoreCase(productName));
	
	Assert.assertTrue(Value);
	
	driver.findElement(By.cssSelector("div[class*=ng-star] button")).click();
	
	Actions a = new Actions(driver);
	a.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Select Country']")),"india").build().perform();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class*='ta-results']")));
	driver.findElement(By.cssSelector(".ta-item:nth-child(3)")).click();
	driver.findElement(By.cssSelector(".action__submit")).click();
	Thread.sleep(2000);
	String Order = driver.findElement(By.cssSelector("td .em-spacer-1 .ng-star-inserted")).getText();
	String OrderSplit = Order.split(" ")[1];
	System.out.println(OrderSplit);
	
	
	
	
	
}

}