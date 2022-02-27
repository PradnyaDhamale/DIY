//1.Check the given number is EVEN or ODD. 




import java.util.*;


public class EvenOdd
{
	public static void main(String args[])
	{
	
	Scanner scobj = new Scanner (System.in);
	System.out.println("Enter any Number: ");
	
	int num = scobj.nextInt();
	
	
	if(num %2==0)
	{
		System.out.println("The Number you have entered is even number! ");
	}
	else
	{
		System.out.println("The Number you have entered is odd number! ");
	}
	
	}
}
		

