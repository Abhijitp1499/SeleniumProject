import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selenium9_7_LoopingOnDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.className("paxinfo")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("paxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.className("paxinfo")).getText(), "1 Adult");

		for (int i = 0; i < 4; i++)

		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		System.out.println(driver.findElement(By.className("paxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.className("paxinfo")).getText(), "5 Adult");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Done']")).click();

	}

}
