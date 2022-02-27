//4.Find the missing Number in the given array of 1 to N. 

import java.util.*;

public class MissingNo
{
	public static void main(String args[])
	{
				Scanner scobj = new Scanner(System.in);
				System.out.println("Enter the size of an Array:");
				int size= scobj.nextInt();
				
				System.out.println("Enter the elements of an Array:");
				int arr[] = new int [size];
				int n = arr.length;
				
				for(int i=0;i<size;i++)
				{
					arr[i]= scobj.nextInt();
					
				}
				
				int sum=((n+1)*(n+2))/2;
				
				for(int i=0;i<n;i++)	
				{
					sum = sum-arr[i];	
				}
				System.out.println("The missing number is: "+sum);
	}
		
}

