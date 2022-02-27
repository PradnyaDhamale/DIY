//18.Write a java program to LCM of TWO given number using Prime Factors method. 

 import java.util.*;

public class LCMPrimeFact 
{
	public static void main(String args[])
	{
		Scanner scobj = new Scanner(System.in);
		System.out.println("Enter the 1st nos: ");
		int num1=scobj.nextInt();
		System.out.println("Enter the 2nd nos: ");
		int num2=scobj.nextInt();
		int res=0,lcm;
		
		for(int i=1;i<=num1 && i<=num2 ; i++)
		{
			if(num1%i==0 && num2 %i == 0)
			{
				res = i;
			}
		}
		lcm = (num1*num2)/res;
		System.out.println("LCM - "+lcm);
	}
		
}