package default1;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium9_1_SyncAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		String UsrPass = driver.findElement(By.cssSelector("p.text-center.text-white")).getText();
		String[] SplitUsrPass = UsrPass.split(" ");
		String ActualUserName = SplitUsrPass[2];
		String AcualPassword = SplitUsrPass[6];
		AcualPassword = AcualPassword.replaceAll("[)]", "");
		driver.findElement(By.id("username")).sendKeys(ActualUserName);
		driver.findElement(By.name("password")).sendKeys(AcualPassword);
		driver.findElement(By.cssSelector("label[class='customradio']:nth-child(2)")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class*='content-center'] button:last-child")).click();

		WebElement staticDropwdon = driver.findElement(By.cssSelector("select.form-control"));
		Select dropdown = new Select(staticDropwdon);
		dropdown.selectByIndex(2);
		driver.findElement(By.name("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		String[] ItemsList = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" };

		List<WebElement> products = driver.findElements(By.cssSelector("h4.card-title"));
		for (int i = 0; i < products.size(); i++) {
			String items = products.get(i).getText();

			List<String> ItemNames = Arrays.asList(ItemsList);

			if (ItemNames.contains(items)) {
				driver.findElements(By.cssSelector(".btn.btn-info")).get(i).click();
			}
		}
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();

		driver.findElement(By.cssSelector(".btn.btn-success")).click();

		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.xpath("//div/ul/li/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("label[for='checkbox2']")).click();
		driver.findElement(By.cssSelector("input[value='Purchase']")).click();
		System.out.println(driver.findElement(By.cssSelector("a[data-dismiss='alert']")).getText());

	}

}
