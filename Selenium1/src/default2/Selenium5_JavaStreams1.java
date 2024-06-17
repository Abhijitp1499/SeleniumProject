package default2;

import java.util.ArrayList;

public class Selenium5_JavaStreams1 {

	public static void main(String[] args) {
		// count the number of names starting with A in a list

		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijit");
		names.add("Rohit");
		names.add("Virat");
		names.add("Bumrah");
		names.add("Arshdeep");
		names.add("Akash");
		int count = 0;

		for (int i = 0; i < names.size(); i++)

		{
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count = count + 1;
			}
		}
		System.out.println(count);
		Long CC = StreamFilter();
		System.out.println(CC);

	}

	public static Long StreamFilter() {

		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Abhijit");
		names1.add("Rohit");
		names1.add("Virat");
		names1.add("Bumrah");
		names1.add("Arshdeep");
		names1.add("Ruturaj");

		// There is no life for filter operation if there is no count operation
		// count operation will execute only if filter operation return true
		// We can creat stream with stream package -> Stream.of("A","AB","C","D","AE")
		// and then perform operations
		// Stream.of("A","AB","C","D","AE").filter(s->s.startsWith("A")).count();

		Long C = names1.stream().filter(s -> s.startsWith("R")).count();
		return C;

	}

}
