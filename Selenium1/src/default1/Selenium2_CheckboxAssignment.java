package default1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2_CheckboxAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
		Thread.sleep(3000);
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());

		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

	}

}
