//3.Find the Factorial of a number using Recursion. 
 import java.util.*;
 
 public class FactorialR
 {
				public static int RecFact(int n)
				{
					
				if (n==0)
					{
						return 1;
					}
					
					else
					{
						return (n*RecFact(n-1));
					}
				
				}
					
		
			   
	 public static void main(String args[])
	 {
				Scanner scobj = new Scanner(System.in);
			    System.out.println("Enter the number:");
			   
			    int f = scobj.nextInt();
				
		       System.out.println("Factorial of entered number is: "+RecFact(f));
	 }
 }