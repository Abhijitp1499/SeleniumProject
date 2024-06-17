
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P2_FlipkartElementsLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[contains(text(),'Grocery')]")).click();
		Actions a = new Actions(driver);
		WebElement Fashion = driver.findElement(By.xpath("//span[contains(text(),'Mobiles')]"));
		WebElement Fashion1 = driver.findElement(with(By.tagName("div")).toRightOf(Fashion));
		a.moveToElement(Fashion1).build().perform();
		
		driver.findElement(By.linkText("Men Footwear")).click();
		
		
	}

}