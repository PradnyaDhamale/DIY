//1.Calculate the average of given array. 

import java.util.*;

public class Arrayavg
{
	public static void main(String args[])
	{
		Scanner scobj = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int add=0;
		int size= scobj.nextInt();
		
		int arr[] = new int [size];
		
		System.out.println("Enter the elements of array: ");
		
		for(int i=0;i < size;i++)
		{
            arr[i]= scobj.nextInt();
            add=add+arr[i];
	    	
		}
		
		double result = add/size;
		System.out.println("Average is : "+result);
	}
}

		
		

		
		