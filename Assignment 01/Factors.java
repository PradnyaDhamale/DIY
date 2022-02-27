//11.Write a Java Program to print all the Factors of the Given number. 

import java.util.*;

public class Factors
{
	public static void Findfactor(int n)
	{
	for(i=0;i<n;i++)
	{
	if(n%i==0)
	System.out.println(i+"\t");
	}
	}
	
public static void main(String args[])
{
int number = 0;

Scanner scobj= new Scanner(System.in);

System.out.println("Enter a number:");
 number = scobj.nextInt();
 
System.out.println("The factors are:");
 findfactor(number);
 
 }
}
