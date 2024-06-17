
public class Selenium4_JavaExplorationAssignment {

	public static void main(String[] args) {

		int[] arr1 = { 3, 6, 9, 12, 15 };
		int count = 0;

		System.out.println("This is the first element of the array	" + arr1[0]);
		System.out.println("This is the last element of the array	" + arr1[4]);

		System.out.println("Size of Array "+arr1.length);
		System.out.println("Print Array in reverse order");

		for (int i = arr1.length - 1; i >= 0; i--)

		{
			System.out.println(arr1[i]);
		}

		System.out.println("Total number of elements in the array equals	" + arr1.length);

		for (int i = 0; i < arr1.length; i++) {
			count = count + 1;

		}

		for (int C : arr1)

		{
			System.out.println(C);
		}
		System.out.println("Total number of elements in the array equals too	" + count);
	}
}
