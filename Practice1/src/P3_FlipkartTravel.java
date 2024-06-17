import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class P3_FlipkartTravel {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Travel')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='YZYCxK U1LCmH'] /input[@name='0-departcity']")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Hyderabad')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Bengaluru')]")).click();
		driver.findElement(By.cssSelector("button[class='pl8ttv paxEPa ZFO-pc']")).click();
		for (int i = 0; i < 4; i++)

		{
			driver.findElement(By.xpath("(//button)[3]")).click();
		}
		
		for (int i = 0; i <=2 ; i++)

		{
			driver.findElement(By.xpath("(//button)[5]")).click();
		}
		
		driver.findElement(By.xpath("(//div[@data-checked='false'])[3]")).click();
		driver.findElement(By.cssSelector("button[type='button']")).click();
	}
}
