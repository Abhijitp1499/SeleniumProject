import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium9_3SiblingsTraverse {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElement(By.xpath("//header/div/button[1]")).getText());
		System.out.println("\n");
		System.out
				.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		System.out.println("\n");
		System.out
				.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).getText());
		System.out.println("\n");
		System.out.println(driver.findElement(By.xpath("//header/div")).getText());
		System.out.println("\n");
		System.out.println(driver.findElement(By.cssSelector("header div a")).getText());

	}

}
