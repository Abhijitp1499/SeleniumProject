
public class printNreverseString {

	public static void main(String[] args) {
	
		String Name = "Abhijit";
		
		System.out.println("Print String");
		for (int i=0;i<Name.length();i++)
		{

			System.out.println(Name.charAt(i));
		}
		
		System.out.println("Print String in reverse order");
		for (int j=Name.length()-1;j>=0;j--)
		{
		
			System.out.println(Name.charAt(j));
		}
		
		System.out.println("Print alternate values in a String ");
		
		for (int i=0;i<Name.length();i=i+2)
		{

			System.out.println(Name.charAt(i));
		}

	}

}
