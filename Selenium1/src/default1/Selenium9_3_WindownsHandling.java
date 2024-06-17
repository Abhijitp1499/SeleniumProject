package default1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium9_3_WindownsHandling {

	public static void main(String[] args) throws InterruptedException {
		// In selenium separate tab and separate window are treated the same

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String ChildId = it.next();
		driver.switchTo().window(ChildId);
		Thread.sleep(3000);
		String[] emailExtract1 = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at ");
		String[] emailExtract2 = emailExtract1[1].split(" ");
		String email = emailExtract2[0];
		// Above 3 lines can be also coded as
		// String emailId=
		// driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split("
		// ")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(email);

	}

}
