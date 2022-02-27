//7.Write a Java Program to find the Union of Two Arrays (UnSorted Array). 

import java.util.*;

public class UnionOf2UnsortedArrays
{
	public static void main(String args[])
	{
				Scanner scobj = new Scanner(System.in);
				System.out.println("Enter the size of I Array:");
				int size1= scobj.nextInt();
				
		
				System.out.println("Enter the size of II Array:");
				int size2= scobj.nextInt();
				
				System.out.println("Enter the elements of I Array:");
				int arr1[] = new int [size1];
				
				for(int i=0;i<size1;i++)
				{
					arr1[i]= scobj.nextInt();
				}

				System.out.println("Enter the elements of an II Array:");
				int arr2[] = new int [size2];
		
				
				for(int i=0;i<size2;i++)
				{
					arr2[i]= scobj.nextInt();
				}
				
					for(int i=0;i<size1;i++)
				{
					for(int j=0;j<size2;j++)
					{
						System.out.println("The union of two arrays is : "+arr1[i]+arr2[i]);
						break;
					}
				}						
					
				
				
	}

}