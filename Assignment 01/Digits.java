//10.Write a Java Program to print the digits of a Given Number. 

import java.util.*;

public class Digits
{
	public static void main (String args[])
	{
		Scanner scobj = new Scanner(System.in);
		int count = 0;
		
		System.out.println("Enter your desired number::");
		
		int num = scobj.nextInt();
		
		while (num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Number of digits in the number are:" +count);
	}
}

		