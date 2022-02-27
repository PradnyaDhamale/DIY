//14.How to add two numbers without using the arithmetic operators in Java? 

import java.util.*;
 
public class AddWovOperators
{	
	
	static int Addition(int x,int y)
	{
		while(y!=0)
		{
			int carry= x&y;
			x=x^y;
			y=carry<<1;
		}
	return x;
	}
	
	public static void main(String args[])
	{	
		int Add;
		int num1;
		int num2;
		Scanner scobj= new Scanner(System.in);
		System.out.println("Enter first number: ");  
		num1 = scobj.nextInt();
		System.out.println("Enter second number: ");  
		num2 = scobj.nextInt();
		
		Add=Addition(num1,num2);
	
		System.out.println("The sum of 2 nos. is: "+Add);  
		
	}
}