package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstartComponents.AbstractComponent;

public class F_5_ConfirmationPage1 extends AbstractComponent{
	WebDriver driver;
	public F_5_ConfirmationPage1(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(css=".hero-primary")
WebElement confirmationMessage;

public String GetConfirmationMessage()
{
	return confirmationMessage.getText();
}


}

