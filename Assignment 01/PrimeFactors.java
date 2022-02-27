//20.Write a Java Program to print all the Prime Factors of the Given Number.

import java.util.*;


public class PrimeFactors
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no ");
		int num=sc.nextInt();
		
    		for(int i=2; i<=num;i++)
	    	{
		        while(num%i==0)
		        {
		         System.out.println(i);   
                 num=num/i;
		        }
	    	}      
	
	}
}

		