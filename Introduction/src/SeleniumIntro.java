import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class SeleniumIntro {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/#");
		driver.findElement(By.id("inputUsername")).sendKeys("Abhijit");
		driver.findElement(By.name("inputPassword")).sendKeys("@Abcd123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Abhijit123");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("testing@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("testing123@gmail.com");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).clear();
		driver.findElement(By.xpath("//form/h2")).getText();
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("987654321");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		//driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("NewText");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		driver.close();
				
	}

}
