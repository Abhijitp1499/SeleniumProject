package default2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Selenium5_JavaStreams2 {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijit");
		names.add("Rohit");
		names.add("Virat");
		names.add("Bumrah");
		names.add("Harshit");
		names.add("Rakshit");

		Long Count = names.stream().filter(s -> s.contains("it")).count();
		System.out.println(Count);

		System.out.println("*****************1**********");

		Long C = Stream.of("Abhi", "Virat", "Rohit", "Ave", "Mohit").filter(s -> {
			return s.startsWith("A");
		}).count();
		System.out.println(C);

		System.out.println("****************2***********");

		names.stream().filter(s -> s.length() > 5).forEach(s -> System.out.println(s));

		System.out.println("***************************");

		names.stream().filter(s -> s.length() > 5).limit(1).forEach(s -> System.out.println(s));

		System.out.println("******************3*********");

		Stream.of("Cable", "Maple", "Apple", "Bottle", "Table").filter(s -> s.length() > 5).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		System.out.println("*****************4**********");
			
	System.out.println("*****************4.1**********");
		List<String> Cart = Arrays.asList("Cable", "Maple", "Apple", "Bottle", "Table");

		Cart.stream().filter(s -> s.contains("ble")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		System.out.println("*****************5**********");

		Stream<String> Concat = Stream.concat(names.stream(), Cart.stream());

		Concat.sorted().map(s -> s.toLowerCase()).forEach(s -> System.out.println(s));

		System.out.println("***************************");

		// Boolean flag = Concat.anyMatch(s->s.equalsIgnoreCase("APPLE"));
		// System.out.println(flag);

		List<String> ls = Stream.of("Cable", "Maple", "Apple", "Bottle", "Table").filter(s -> s.length() > 4)
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls);
		System.out.println(ls.get(0));

		List<Integer> values = Arrays.asList(3, 5, 7, 8, 5, 6, 1, 9, 2, 3);
		values.stream().distinct().forEach(s -> System.out.println(s));

		System.out.println("***************************");

		values.stream().sorted().forEach(s -> System.out.println(s));

		System.out.println("***************************");

		values.stream().distinct().sorted().forEach(s -> System.out.println(s));

		System.out.println("***************************");

		List<Integer> LIST = values.stream().distinct().sorted().collect(Collectors.toList());

		System.out.println(LIST);

		System.out.println("***************************");

		System.out.println(LIST.get(3));

	}

}
