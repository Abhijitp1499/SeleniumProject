package default1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4_Enabeld_Disabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		// driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		if (driver.findElement(By.id("Div1")).getAttribute("Style").contains("1")) {
			System.out.println("Its Enabled");
		} else {
			System.out.println("Its Disabled");
		}

	}

}
