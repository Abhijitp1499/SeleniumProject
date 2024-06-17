import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_FlpKrtTrvlStreams {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Travel')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='v2VFa- rLGgLC g9KxuM smJZop ZjUTQC z2D4XG']")).click();
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='_98hP1j']"));
		Thread.sleep(2000);
		options.stream().filter(s->s.getText().contains("Kuala Lumpur")).forEach(s->s.click());
		
		options.stream().filter(s->s.getText().contains("Mumbai")).forEach(s->s.click());
		
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
