import java.util.*;

public class SwapWoVApproach2
{
	public static void main(String[] args)
	{
		Scanner scobj = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int p = scobj.nextInt;
		System.out.println("Enter second number: ");
		int q = scobj.nextInt();
		
		
		System.out.println("Numbers before Swapping are: " + "p = " + p + "q= " + q );

		p=p*q;
		q=p/q;
		q=p/q;
		
		System.out.println(p+" "+q);
		System.out.println("Numbers after Swapping are: " + "p = " + p + "q= " + q );
	}

}