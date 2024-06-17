import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selenium9_2Locators2 {

	public static void main(String[] args) throws InterruptedException {

		String name = "ViratKohli0511";
		String Password;
		WebDriver driver = new ChromeDriver();
		Selenium9_2Locators2 d = new Selenium9_2Locators2();
		Password = d.getPassword(driver);
		// String Password = getPassword(driver); ---> use static keyword in getPassword
		// class
		driver.get("https://rahulshettyacademy.com/locatorspractice/#");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
				"Hello " + name + ",");

		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	}

	public String getPassword(WebDriver driver) throws InterruptedException

	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/#");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String passText = driver.findElement(By.cssSelector("form p")).getText();
		String[] Splitted1 = passText.split("'");
		// Please use temporary password 'rahulshettyacademy' to Login.
		String ActualPassword = (Splitted1[1]);
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		return ActualPassword;

	}
}
