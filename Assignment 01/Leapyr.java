//8.Write a Java Program to find whether given number is Leap year or NOT? 

import java.util.*;

public class Leapyr
{
	public static void main(String args[])
	{
	
	Scanner scobj = new Scanner (System.in);
	System.out.println("Enter any Number: ");
	
	int num = scobj.nextInt();
	if(num%4 == 0 || num%100==0 || num%400 == 0)
	{
		System.out.println("The Number you have entered is leap year! ");
	}
	
	else
	{
		System.out.println("The Number you have entered is not leap year! ");
	}
	
	}
}
		
