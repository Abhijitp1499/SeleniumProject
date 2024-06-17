
public class Arrayspractice {

	public static void main(String[] args) {
		
		int count=0;
        int numbers[] = {10,2,3,4,5};
        System.out.println("This is the first element of the array "+numbers[0]);
        System.out.println("This is the last element of the array "+numbers[4]);
        
        
    for (int i = numbers.length-1;i>=0 ; i--)
    {
        System.out.println(numbers[i]);
    }
    

    
    for (int j=0;j<numbers.length;j++)
    {
    	count = count+1;
    }
    
    System.out.println("Total count of elements of the array is "+count);
}
}
	