package Test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstartComponents.AbstractComponent;


public class F_1_LandingPage extends AbstractComponent{

		WebDriver driver;
		

		public F_1_LandingPage(WebDriver driver) {
			super(driver);
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		//WebElement userEmail = driver.findElement(By.id("userEmail"));
		
		//PageFactory DesignPattern
		
		@FindBy(id="userEmail")
		WebElement userEmail;
		
		@FindBy(id="userPassword")
		WebElement passwordElement;
		
		@FindBy(id="login")
		WebElement submit;

		public F_2_ProductCatalogue loginApplication(String email,String password)
		{
			userEmail.sendKeys(email);
			passwordElement.sendKeys(password);
			submit.click();
			F_2_ProductCatalogue productCatalogue = new F_2_ProductCatalogue(driver);
			return productCatalogue;
		}
		
		public void goTo()
		{
			driver.get("https://rahulshettyacademy.com/client");
		}
		
		
		
		
			
	}





/*PageFactory.initElements(driver, this); is a method from the Selenium WebDriver library used in Java (and other JVM languages) for initializing web elements in a Page Object Model (POM) design pattern. Here's a breakdown of what it does and how it fits into the POM approach:

Page Object Model (POM)
POM is a design pattern in Selenium for creating an object repository for web UI elements. It helps in enhancing test maintenance and reducing code duplication. In POM, each web page in the application is represented by a class, and the various elements on the page are defined as member variables of that class.

PageFactory.initElements(driver, this);
The PageFactory class in Selenium provides support for the POM pattern by simplifying the initialization of the web elements defined in the page classes. Here's what happens when you use this method:

Driver Parameter (driver): This is the WebDriver instance that you are using to drive your browser.
Page Class Instance (this): This refers to the current instance of the page class that you want to initialize.
When PageFactory.initElements(driver, this); is called, it does the following:

It locates the web elements defined in the page class (usually annotated with @FindBy, @FindAll, @FindBys, etc.).
It initializes these elements using the specified WebDriver instance.
It creates proxy objects for the web elements, which are then instantiated when they are accessed.
 */
