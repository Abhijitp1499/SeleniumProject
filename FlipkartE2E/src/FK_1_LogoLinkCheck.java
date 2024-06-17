import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class FK_1_LogoLinkCheck {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String Website1 = driver.getCurrentUrl();
		String Tittle1 = driver.getTitle();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("img[title='Flipkart']")).click();
		String Website2 = driver.getCurrentUrl();
		String Tittle2 = driver.getTitle();
		
		Assert.assertEquals(Website1, Website2);
		Assert.assertEquals(Tittle1, Tittle2);
		driver.close();
		
		
	}

}
