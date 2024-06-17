
public class Selenium7_JavaMethods {

	public static void main(String[] args) {

		Selenium7_JavaMethods d = new Selenium7_JavaMethods();
		String name = d.methodDemo1();
		System.out.println(name);
		
		Selenium8_JavaMethods_DifferentClassFile d1 = new Selenium8_JavaMethods_DifferentClassFile();
		String data = d1.getdata();
		System.out.println(data);
		
		String demo2 = methodDemo2();
		System.out.println(demo2);

	}

	public String methodDemo1() {
		System.out.println("Current class method ICC T20 WORLD CUP");
		return "Abhijit Panigrahi";

	}

	public static String methodDemo2() {
		System.out.println("Method Demo2");
		return "Text from Method Demo2";

	}

}
