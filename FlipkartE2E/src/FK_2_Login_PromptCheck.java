

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FK_2_Login_PromptCheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("a[class='_1TOQfO']")).click();
		
		
		driver.findElement(By.cssSelector("input[class='r4vIwl BV+Dqf']")).sendKeys("9827290709");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='QqFHMw twnTnD _7Pd1Fp']")).click();
		Thread.sleep(2000);

		


	}

}
