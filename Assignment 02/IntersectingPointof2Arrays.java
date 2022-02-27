//5.Write a Java Program to find the Intersection of two arrays. 

import java.util.*;

public class IntersectingPointofArray
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
				
				//*****************************
				
				for (int i = 0; i < size1; i++)   
				{  
				for (int j = i + 1; j < size1; j++)   
					{  
						int tmp = 0;  
						if (arr1[i] < arr1[j])   
							{  
								tmp = arr1[i];  
								arr1[i] = arr1[j];  
								arr1[j] = tmp;  
							}  
					}
				}
				
				//******************************
				
				for (int i = 0; i < size2; i++)   
				{  
				for (int j = i + 1; j < size2; j++)   
					{  
						int tmp = 0;  
						if (arr2[i] < arr2[j])   
							{  
								tmp = arr2[i];  
								arr2[i] = arr2[j];  
								arr2[j] = tmp;  
							}  
					}
				}
				
				//*******************************************
				
				for(int i=0;i<size1;i++)
				{
					for(int j=0;j<size2;j++)
					{
						if(arr1[i]==arr2[j])
						{
							System.out.println("The two arrays Intersect at : "+arr1[i]);
							break;
						}
					}						
					
				}
				
				
	}
}