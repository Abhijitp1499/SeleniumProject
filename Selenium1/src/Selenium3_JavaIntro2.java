
public class Selenium3_JavaIntro2 {

	public static void main(String[] args) {

		int[] arr2 = { 1, 12, 3, 14, 5, 16, 7, 18, 9, 100 };

// If-else statement

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] % 4 == 0) {
				System.out.println(arr2[i] + "	is divisible by 4");
				// break;
			} else {
				System.out.println(arr2[i] + "	is not divisible by 4");
			}

// break keyword is used to terminate the loop if one of the condition is met
		}
	}

}
