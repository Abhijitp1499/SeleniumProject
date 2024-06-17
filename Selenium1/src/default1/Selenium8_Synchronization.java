package default1;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
// Implicit wait - Globally appplicable to all elements
// Explicit wait - Applicable to the specific element ( will continous look for the element to be visible/found)
// Fluent Wait - Applicable to the specific element (will look for the element to be visible/found at regular intervals)

public class Selenium8_Synchronization {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] Vegetables = { "Cucumber", "Brocolli", "Carrot" };
		Thread.sleep(1000);
		addItems(driver, Vegetables);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button[1]")).click();
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By.xpath("//span[@class='promoInfo']"))));

		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());

	}

	public static void addItems(WebDriver driver, String[] Vegetables)

	{
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		int j = 0;

		for (int i = 0; i < products.size(); i++)

		{
			String[] name = products.get(i).getText().split(" ");

			String main = name[0];

			List<String> VegNames = Arrays.asList(Vegetables);

			if (VegNames.contains(main)) {

				j++;

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == Vegetables.length) {
					break;
				}

			}

		}
	}

}
