
import java.util.Scanner;

public class febonacci {

	
	
	private static void displaySequence(int fedoNum)
	{
		int n = 0;
		int n1 = 0;
		int n2 = 1;
		int x;
		
		
		if( fedoNum <= 0) 
		{
			System.out.println("input number greater than 0");
			requestNumber();
		}
			
			else 
			{
			
				while( n < fedoNum )
				{
					System.out.println(n1 + "");
					
					x = n1;
					n1 = n1 + n2;
					n2 = x;
					
			
					n++;
				}
			}
	}
	

	public static void requestNumber() {
		
		 try (Scanner myObj = new Scanner(System.in)) {
			System.out.println("Please input number...");

		    int fedonachiNum = myObj.nextInt();  // Read user input
	
		displaySequence( fedonachiNum);
		}
		 catch (Exception e) {
		      System.out.println("Something went wrong.");
		    }
	}
	
	

}
