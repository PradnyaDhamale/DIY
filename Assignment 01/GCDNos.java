//16.Write a Java Program to find GCD of two given numbers. 
 
 import java.util.*;

public class GCDNos 
{
	public static void main(String args[])
	{	
		Scanner scobj = new Scanner(System.in);
		System.out.println("Enter the 1st nos: ");
		int num1=scobj.nextInt();
		System.out.println("Enter the 2nd nos: ");
		int num2=scobj.nextInt();
		int gcd=0;
		for(int i=1;i<=num1 && i<=num2 ; i++)
		{
			if(num1%i==0 && num2 %i == 0)
			{
				gcd = i;
			}
		}
		
		System.out.print("GCD is for 2 numbers is : "+gcd);
	}
		
}
		
