import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class OOPs1 {

	public void doThis() 
	{
		System.out.println("I am here");
	}
	
	@BeforeMethod
	public void beforeMethod()
	
	{
		System.out.println("This will run first");
	
	}

	@AfterTest
	public void AfterMethod ()
	{
		System.out.println("This will run last");
	}
	

}
