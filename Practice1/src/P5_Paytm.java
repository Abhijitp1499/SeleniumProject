import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P5_Paytm {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");

		Actions a = new Actions(driver);

		WebElement hover = driver.findElement(By.linkText("Paytm for Consumer"));
		a.moveToElement(hover).build().perform();

		WebElement hover1 = driver.findElement(By.xpath("(//div[@class='_2dve7']) [1]"));
		//div[class='_3y5vS DK57R'] div[class='_2dve7']
		a.moveToElement(hover1).build().perform();

		driver.findElement(By.linkText("Bill Payment & Recharges")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		
		driver.findElement(By.xpath("//*[contains(text(),'Electricity Bills')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Odisha");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_1exI'] /input)[2]")).sendKeys("TP Central Odisha Distribution Limited");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[1]")).sendKeys("12345678900");
		//(//div[@class='_3_cL '] /input[@autocomplete='new-password'])[1]
		////ul/li/div[@class='_3_cL ']/label[@class='_1l8W']
		////label[contains(.,'Consumer ID')]
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[2]")).sendKeys("9000000000");
		////label[contains(.,'Mobile Number')]
		////label[text()='Mobile Number']

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='_11kC  _15qf _2qE6']")).click();
	
		
				
				
	}

}
