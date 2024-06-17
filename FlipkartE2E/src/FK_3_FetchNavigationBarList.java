import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FK_3_FetchNavigationBarList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> names = driver.findElements(By.cssSelector("[class*='_1ch8e_']"));
		
		for (int i =0; i<names.size();i++)
		{
			System.out.println(names.get(i).getText()); ;
		}

	}

}
