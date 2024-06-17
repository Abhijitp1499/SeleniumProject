import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FK_6_BannerValidation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.jiocinema.com/");

		for (int i = 0; i < 10; i++) {
			driver.findElement(By.cssSelector("img[class='rightNavButton']")).click();
			WebElement Label = driver.findElement(By.cssSelector("div[class*='carousel-card']"));
			System.out.println(Label.getAttribute("aria-label"));
		}

	}

}
