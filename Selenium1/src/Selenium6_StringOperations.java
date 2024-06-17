
public class Selenium6_StringOperations {

	public static void main(String[] args) {

		String s = "Abhijit Panigrahi Selenium";
		System.out.println(s.charAt(0));

		String[] split = s.split(" ");
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);

		String[] split1 = s.split("Panigrahi");
		System.out.println(split1[0]);
		System.out.println(split1[1]);

		String[] split2 = s.split("Panigrahi");
		System.out.println(split2[0].trim());
		System.out.println(split2[1].trim());

		String[] split3 = s.split("Panigrahi")[0].trim().split("i");
		System.out.println(split3[0]);
		System.out.println(split3[1]);
		System.out.println(split3[2]);

// Printing the string letter by letter		
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

// Printing the string in reverse order

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}

// For printing alternate characters use increment as i+2

	}

}
