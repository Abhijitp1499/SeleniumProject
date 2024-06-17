public class Selenium2_JavaIntro {

	public static void main(String[] args) {

// Declaring variables of different data types
		int Num = 5;
		String Name1 = "Abhijit";
		char Value = 'Y';
		double dec = 6.9;
		boolean truefalse = true;

// Printing the values stored in the variables		
		System.out.println(Num + " Is the value in the variable");
		System.out.println(Name1 + " Is the value in the variable");
		System.out.println(Value + " Is the value in the variable");
		System.out.println(dec + " Is the value in the variable");
		System.out.println(truefalse + " Is the value in the variable");

// Array Declaring and Initialization method 1
		int[] arr1 = new int[5];
		arr1[0] = 2;
		arr1[1] = 5;
		arr1[2] = 6;
		arr1[3] = 9;
		arr1[4] = 10;

// Array Declaring and Initialization method 2

		int[] arr2 = { 1, 12, 3, 14, 5, 16, 7, 18, 9, 100 };

		System.out.println(arr2[2] + " This is the value stored in 2nd index ,index value starts from 0");

// For Loops

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

//Looping over String Array
		String[] name = { "Abhijjit", "Rohit", "Virat" };

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

// Enhanced For Loop

		for (String s : name) {
			System.out.println(s);
		}

	}

}
