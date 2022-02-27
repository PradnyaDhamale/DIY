//15.Write a java program to Reverse a given number.

import java.util.*;

public class Reverseinteger
{
	
		
		public static void main(String Args[])
		{		
			Scanner scobj= new Scanner(System.in);
			int num,res;
			System.out.print("Enter desired number: ");  
			num = scobj.nextInt();
			
			
			
			while(num!=0)
			{
					res=num%10;
					System.out.print(" "+res);  
					num=num/10;	
			}
			
		}
}