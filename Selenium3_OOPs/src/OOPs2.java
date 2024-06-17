import org.testng.annotations.Test;

public class OOPs2 extends OOPs1 {

	
@Test
public void testRun()
{
	int a=3;
	OOPs3 op3 = new OOPs3(a);
	doThis();
	System.out.println(op3.increment());
	System.out.println(op3.decrement());

	
	System.out.println(op3.multiplyByTwo());
	System.out.println(op3.multiplyByThree());
	

}

}
