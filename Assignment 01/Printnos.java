//9.Write a Java Program to Print 1 To 10 Without Using Loop.

public class Printnos
{
	public static int Noloop(int num )
	{
		if(num <= 10)
		{
			System.out.println(num);
			Noloop(num+1);
		
		}
		return 0;
	
	}

	public static void main(String args[])
	{
		Noloop(1);
	}
}

