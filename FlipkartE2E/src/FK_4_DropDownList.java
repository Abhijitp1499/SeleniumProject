import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FK_4_DropDownList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement Fashion1 = driver.findElement(By.xpath("//span[contains(text(),'Mobiles')]"));
		WebElement hover = driver.findElement(with(By.tagName("div")).toRightOf(Fashion1));
		
		Actions a = new Actions(driver);
		a.moveToElement(hover).build().perform();
				
		WebElement Navigation1 = driver.findElement(By.cssSelector("div[class='_1UgUYI _2eN8ye']"));
		List<WebElement> Fashion = Navigation1.findElements(By.tagName("a"));
		for (int i =0; i<Fashion.size();i++)
		{
			System.out.println(Fashion.get(i).getText());
			
		}

		System.out.println(Fashion.size());
		
		
	}

}
