//3.Find the second minimum number in the given array. 
			
import java.util.*;

public class Array2ndMinno			
{
	public static void main(String args[])
	{
		Scanner scobj = new Scanner(System.in);
				
				System.out.println("Enter the size of array: ");
				int size= scobj.nextInt();
				
				int arr[] = new int [size];
				System.out.println("Enter the elements of array: ");
		
				for(int i=0;i<size;i++)
				{
					arr[i]= scobj.nextInt();
					
				}
				for (int i = 0; i < size; i++)   
				{  
				for (int j = i + 1; j < size; j++)   
					{  
						int tmp = 0;  
						if (arr[i] < arr[j])   
							{  
								tmp = arr[i];  
								arr[i] = arr[j];  
								arr[j] = tmp;  
							}  
					}
				}							
				System.out.println("The Second smallest element is :"+ arr[size-2]);
		
	}
}
