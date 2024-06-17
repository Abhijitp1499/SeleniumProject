
public class OOPs3 extends OOPs4 {

	int a;

	public OOPs3(int a) {
		super(a);
		this.a = a;
	}


	public int increment() {
		a = a + 1;
		return a;
	}
	
	public int decrement() {
		a = a - 1;
		return a;
	}


}
