package com.chijarira.fibonachi;

import java.util.Scanner;

public class febonacci {

	
	
	private static void displaySequence(int fedoNum)  //very inefficient space time 
	{
		int n = 0;
		int n1 = 0;
		int n2 = 1;
		int x;
		
		
		if( fedoNum <= 0) 
		{
			System.out.println("Please input number greater than 0");
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
	
	
	public static int fedonachiRecursive (int x) //returns the nth number in the fibonachi sequence
	{
		if (x <=0)
		{
			System.out.println("Incorect input: Please try again");
			requestNumber();
		}
		else
		if ( x<3)
		{
			return x -1;
		}
		
		return fedonachiRecursive (x-1) + fedonachiRecursive(x-2);
		
	}
	

	public static void requestNumber() {
		
		 try (Scanner myObj = new Scanner(System.in)) {
			System.out.println("Please input number...");

		    int fedonachiNum = myObj.nextInt();  // Read user input
	
		displaySequence( fedonachiNum); //prints out the displaySequence method using first method without recursion
		
		System.out.println(fedonachiRecursive(fedonachiNum)); // prints out the nth feb number
		}
		 catch (Exception e) {
		      System.out.println("Something went wrong.");
		    }
	}
	
	

}
