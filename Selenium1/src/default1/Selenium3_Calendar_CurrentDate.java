package default1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium3_Calendar_CurrentDate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='VTZ'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		driver.findElement(By.className("paxinfo")).click();
		Thread.sleep(2000);
		for (int i = 0; i < 2; i++)

		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		WebElement staticDropwdon = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropwdon);
		dropdown.selectByValue("USD");

		driver.findElement(By.xpath("(//input[@value='Search'])[1]")).click();
	}

}
