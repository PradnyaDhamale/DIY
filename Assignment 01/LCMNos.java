//17.Write a java program to LCM of TWO given number. 

 
//17.Write a java program to LCM of TWO given number. 
 
 import java.util.*;

public class LCMNos
{
	public static void main(String args[])
	{
		Scanner scobj = new Scanner(System.in);
		System.out.println("Enter the 1st nos: ");
		int num1=scobj.nextInt();
		System.out.println("Enter the 2nd nos: ");
		int num2=scobj.nextInt();
		int res=0,i;
		int a = (num1>num2)? num1:num2;
		for(i=a;i<=num1*num2 ; i=i+a)
		{
			if(i%num1==0 && i%num2 == 0)
			{
				break;
			}
			
		}
		System.out.println("LCM - "+i);
	}
}

