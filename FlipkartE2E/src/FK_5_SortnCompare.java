import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FK_5_SortnCompare {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/mobiles/mi~brand/pr?sid=tyy%2C4io&otracker=nmenu_sub_Electronics_0_Mi&sort=price_asc");
		driver.findElement(By.cssSelector("div[class='sHCOk2'] div[class='zg-M3Z']:nth-child(4)")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("(//div[@class='Nx9bqj _4b5DiR'])[1]")).getText());
		System.out.println(driver.findElement(By.xpath("(//div[@class='Nx9bqj _4b5DiR'])[24]")).getText());


	}

}
