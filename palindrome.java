package com.chijarira.fibonachi;

public class palindrome {
	
	
	public static void isPalindrome(String word)
	{
	char[] x = word.toCharArray();
	
	
	char[] y = new char[x.length];
	
	for(int i=0;i<x.length;i++)
	{
		y[i] = x[x.length-1-i];
		

	}
	
	for(int i =0;i<x.length;)
	{
		if (y[i] != x[i])
		{
		System.out.println("NOT A PALINDROME!");
		break;
	}
	else	
			
		System.out.println("It IS A PALINDROME!");
		break;
	}
	

}
}

