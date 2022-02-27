//2.Write a Java Program to find the Factorial of given number. 

import java.util.*;

public class Factorial
{
	public static void main(String args[])
	{
		
	Scanner scobj = new Scanner (System.in);
	System.out.println("Enter the Number: ");
	
	int num = scobj.nextInt();
	int res=1;
	
	
	for(int x=1;x<=num;x++)
	{
		res=res*x;
	}
	System.out.println("The Factorial is : "+res);
}
}






