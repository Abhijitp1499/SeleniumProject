import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium9_1Locators1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/#");
		driver.findElement(By.id("inputUsername")).sendKeys("ViratKohli0511");
		driver.findElement(By.name("inputPassword")).sendKeys("EeSalaCupNamde");
		driver.findElement(By.cssSelector("input[value='rmbrUsername']")).click();
		driver.findElement(By.cssSelector("input#chkboxTwo")).click(); // id attribute
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); // class
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("ViratKohli0511");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("royalchallengersbangalore@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type=text]:nth-child(3)")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rcbipltrophy@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("123456789");
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("ViratKohli0511");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class='logout-btn']")).click();

		// Css selectors
		// tagname#id
		// tagnmane.classname -> tagnmane.classname -> tagname is optional

	}

}
