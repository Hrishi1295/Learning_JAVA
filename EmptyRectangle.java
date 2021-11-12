import java.util.Scanner;

public class EmptyRectangle {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Please, enter height of rectangle: ");
			int height = sc.nextInt();
			System.out.print("Please, enter width of rectangle: ");
			int width = sc.nextInt();
			
			drawRectangle(height, width);
		}
	}

	public static void drawRectangle(int height, int width) {
		for(int i=1;i<=height;i++)
		{
		    for(int j=1;j<=width;j++)
		    {
		        if(i==1 || i==height || j==1 || j==width)
		        {
		            System.out.print("+");
		        }
		        else
		        {
		        	System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
	}

}
