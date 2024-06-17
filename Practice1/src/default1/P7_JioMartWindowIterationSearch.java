package default1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7_JioMartWindowIterationSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.jiomart.com/");

		WebElement electronics = driver.findElement(By.cssSelector("#nav_link_4"));

		String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

		electronics.sendKeys(clickonlinkTab);

		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String ChildId = it.next();
		driver.switchTo().window(ChildId);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[id='current_sort']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Price: Low to High')]")).click();

		Thread.sleep(2000);
		String Split[] = driver.findElement(By.cssSelector("div[class*='plp-card-details-name']")).getText().split(" ");
		String Split1 = Split[0];

		driver.switchTo().window(parentId);
		Thread.sleep(2000);
		WebElement Search = driver.findElement(By.cssSelector("input[placeholder='Search JioMart']"));

		Search.sendKeys(Split1);

		Keys EnterOnSearch = Keys.ENTER;

		Search.sendKeys(EnterOnSearch);

	}

}
