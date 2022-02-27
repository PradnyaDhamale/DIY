//19.Check whether the Given Number is a Palindrome or NOT. 

import java.util.*;

public class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter desired number:");
		int a=sc.nextInt();
		int temp=a;
		int rem,sum=0;
		
		while(a>0)
		{
			rem=a%10;
			sum=(sum*10)+rem;
			a=a/10;
		}
		
		if(sum==temp) 
		{
			System.out.println("It is a Palindrome Number");
		}
		
		else 
		{
			System.out.println("It is not Palindrome Number");
		}
		
	}
	
}