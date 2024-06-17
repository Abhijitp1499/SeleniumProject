package default2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;

public class Selenium3_HTTPS_Certifications {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeOptions s = new ChromeOptions();
		s.setAcceptInsecureCerts(true);
		// s.addExtensions(null);
		WebDriver driver = new ChromeDriver(s);
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		// driver.manage().deleteCookieNamed("sessionKey");
		// driver.manage().addCookie("CookieName");

		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);

		// proxy //block pop-up windows // set download directory
		driver.navigate().to("https://chromedriver.chromium.org/capabilities");

		// Screenshot
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://screenshot.png"));

	}

}
