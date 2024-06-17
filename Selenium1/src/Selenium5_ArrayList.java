import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Selenium5_ArrayList {

	public static void main(String[] args) {
//Arrays - Static memory allocation
//Arraylist - Dynamic memory allocation
//int[] arr2 = { 1, 12, 3, 14, 5, 16, 7, 18, 9, 100 };
//String[] name = { "Abhijjit", "Rohit", "Virat" };
		ArrayList<String> a = new ArrayList<String>();
		a.add("Virat Kohli");
		a.add("Rohit Sharma");
		a.add("Surya Kumar Yadav");
		a.add("Jusprit Bumrah");

		System.out.println(a.get(1));

		System.out.println("*************");

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println(a.contains("Jusprit Bumrah"));

//Converting array to Arraylist
		String[] name = { "Abhijjit", "Rohit", "Virat" };
		List<String> nameArrayList = Arrays.asList(name);

		for (int j = 0; j < nameArrayList.size(); j++) {
			System.out.println("Value stored in list "+ j + nameArrayList.get(j));
		}
	}

}
