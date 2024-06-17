import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demoSite/practice/autocomplete/combobox.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@class,'custom-combobox-input')]")).sendKeys("script");
	
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] div[id*='ui']"));
		
		for (WebElement option: options)
		{
			if(option.getText().equalsIgnoreCase("JavaScript"))
			{	
				Thread.sleep(5000);
				option.click();
				break;
			
		
		
		}
	}

}
	
}



