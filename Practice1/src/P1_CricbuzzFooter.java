import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_CricbuzzFooter {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,7000)");
		Thread.sleep(3000);

		WebElement footer = driver.findElement(By.cssSelector("div[class='cb-footer cb-col-100 cb-col']"));

		List<WebElement> LinkName = footer.findElements(By.tagName("a"));
		System.out.println(LinkName.size());
		
		for(int i =0;i<LinkName.size();i++)
		{
			System.out.println(LinkName.get(i).getText());
		}
	

		}

	
}
