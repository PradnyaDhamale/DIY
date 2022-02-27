//7.How to check the given number is Positive or Negative in Java? //1.Check the given number is EVEN or ODD. 




import java.util.*;


public class PosNeg
{
	public static void main(String args[])
	{
	
	Scanner scobj = new Scanner (System.in);
	System.out.println("Enter any Number: ");
	
	int num = scobj.nextInt();
	if(num ==0)
	{
		System.out.println("The Number you have entered is neither positive nor negative number! ");
	}
	
	else if (num>0)
	{
		System.out.println("The Number you have entered is positive number! ");
	}
	else
	{
		System.out.println("The Number you have entered is negative number! ");
	}
	
	}
}
		

