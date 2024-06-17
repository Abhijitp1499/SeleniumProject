package default1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium5_UIAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Anushka");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Anushka@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password");
		driver.findElement(By.cssSelector("#exampleCheck1")).click();
		WebElement staticDropwdon = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropwdon);
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.cssSelector("label[for='inlineRadio2']")).click();
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("11111111");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-dismissible")).getText());

	}

}
