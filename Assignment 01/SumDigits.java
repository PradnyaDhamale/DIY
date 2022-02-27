//12.Write a Java Program to find sum of the digits of a given number. 

import java.util.*;

public class SumDigits
{
	public static void Main(String args[])
	{
		Scanner scobj= new Scanner(System.in);
	
		long number;
		long sum;
		
		System.out.print("Enter desired number: ");  
		number = scobj.nextlong();
		
		for(sum=0;number!=0;number/10)
		{
			sum=sum+number % 10;
		}
		System.out.print("Sum of numbers is: "+sum);  
	}
}