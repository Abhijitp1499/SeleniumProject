package default1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8_JioMartAllCategories {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.jiomart.com/");

		driver.findElement(By.xpath("//span[text()='All Categories']")).click();

		WebElement list = driver.findElement(By.cssSelector("div[id='tab_2'] div[class='accordion category-list']"));

		List<WebElement> Name = list
				.findElements(By.cssSelector("div[id='tab_2'] div[class='accordion category-list'] div"));

		for (int i = 0; i < Name.size(); i++) {
			System.out.println(Name.get(i).getText());
		}

	}

}
