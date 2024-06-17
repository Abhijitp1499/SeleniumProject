package default1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium9_2_ActionsClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("div[id='teamDropDown']"));
		a.moveToElement(move).build().perform();
		Thread.sleep(3000);
		// a.moveToElement(driver.findElement(By.cssSelector("input[type='text']"))).click().keyDown(Keys.SHIFT).sendKeys("ipl").build().perform();
		a.moveToElement(driver.findElement(By.cssSelector("input[type='text']"))).click().keyDown(Keys.SHIFT)
				.sendKeys("ipl").doubleClick().build().perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("//a[@title='Cricket Schedule']"))).contextClick().build()
				.perform();

	}

}
