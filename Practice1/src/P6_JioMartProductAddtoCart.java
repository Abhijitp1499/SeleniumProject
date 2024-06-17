import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_JioMartProductAddtoCart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.jiomart.com/");
		String[] Veggies = { "Bharat", "Sprite" };

		driver.findElement(By.xpath("//a[contains(text(),'Groceries')]")).click();

		List<WebElement> VeggiesIterator = driver.findElements(By.cssSelector("a[class*='plp_product_list']"));
		int j = 0;

		for (int i = 0; i < VeggiesIterator.size(); i++) {
			String[] V1 = VeggiesIterator.get(i).getText().split(" ");
			String VegName = V1[0].trim();

			List<String> VegNames = Arrays.asList(Veggies);

			if (VegNames.contains(VegName)) {
				j++;
				VeggiesIterator.get(i).findElement(By.cssSelector("button[class*='addtocartbtn']")).click();
				if (j == Veggies.length) {
					break;
				}

			}

		}
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("btn_minicart"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

	}

}