package BubbleSort.com;

import java.util.Scanner;

public class IterativeRevese {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter an array Values");
		
		
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp;
		int start=0;
		int end=n-1;
		
		while(start<end)              //1,2,3,4
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
			
			
		}
		
		System.out.println("Printing an array After Reverse");
		
		for(int j=0; j<n; j++)
		{
			System.out.println(arr[j]);
		}
		
		
	}

}
