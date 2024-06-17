package default1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium7_EcommerceValidation {
	// WAP TO ADD CUCUMBER 2 TIMES AND REMAINING ITEMS 1 TIME
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(1000);
		String[] Vegetables = { "Grapes", "Walnuts", "Strawberry" };
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		int j = 0;
		for (int i = 0; i < products.size(); i++) {
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
