import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium9_4ParentToChildTraverse {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div")).getText());
		System.out.println("																			");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[1]")).getText());
		System.out.println("																			");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		System.out.println("																			");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[3]")).getText());
		System.out.println("																			");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header")).getText());
		System.out.println("																			");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a[2]")).getText());
		 
// Sibling Parent traversal only possible in Xpath , It is not possible in CSS
	}

}
