//13.Write a Java Program to find the smallest of 3 numbers (a,b,c) without using < or > symbol? 

import java.util.*;

public class SmallestDigits
{
	public static void main(String args[])
	{
		Scanner scobj= new Scanner(System.in);
		int number1;
		int number2;
		int number3;
		
		System.out.print("Enter first number: ");  
		number1 = scobj.nextInt();
		
		System.out.print("Enter second number: ");  
		number2 = scobj.nextInt();
		
		System.out.print("Enter third number: ");  
		number3 = scobj.nextInt();
		
		if(number1<=number2 && number1<=number3)
		{
			System.out.println("The smallest number is: "+number1);  
		}
		else if (number2 < number1 && number2 < number3)
		{
			System.out.println("The smallest number is: "+number2); 
		}
		else if (number3 < number1 && number3 < number2)  		{
			System.out.println("The smallest number is: "+number3);  
		}
		else  
		System.out.println("The numbers are same.");  
	}



}


