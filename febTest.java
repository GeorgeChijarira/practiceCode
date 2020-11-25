package febonacciTest;

import java.util.Scanner;

public class febTest {
	
		public static void requestNumber() {
			
			febonacci febObject = new febonacci();
			
			 try (Scanner myObj = new Scanner(System.in)) {
				System.out.println("Please input number...");

			    int fedonachiNum = myObj.nextInt();  // Read user input
		
			febObject.displaySequence( fedonachiNum);
			}
			 catch (Exception e) {
			      System.out.println("Something went wrong.");
			    }
		}
		
		public static void displayArray(int[] nums) {
			for (int i : nums) {
				  System.out.println(i);

}
}
}
