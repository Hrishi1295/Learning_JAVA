import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
	    String s= sc.nextLine();
	    String[] strar= s.split("\\s+");
	    int t=strar.length ;
	    int[] intArray= new int[t];
	    
	    for(int i=0 ; i<t ; i++)
	    {
	        intArray[i]=Integer.valueOf(strar[i]);
	    }
	
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
		int maxInt =  findMaxIntInArray(intArray);
		System.out.println(maxInt);
	}

	
	public static int findMaxIntInArray(int[] intArray) {
		int max=intArray[0];
		for(int i=1;i<intArray.length;i++)
		{
		    if(max<intArray[i])
		    {
		        max=intArray[i];
		    }
		}
		return max;
	}
}
