//Write a java Program to add Elements in an array in java
package Interview.com;

import java.util.Scanner;

public class AddElements {
	
	public static void main(String args[])
	{
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size of  Numbers:");
		
		int n=sc.nextInt();
		int array[]= new int[n];
	
		System.out.println("Enter the Elements Array:");
		
		for(int i=0; i<n; i++)
		{
			array[i]=sc.nextInt();
		}
		for(int i: array)
		{
		sum=sum+i;
		
		}
		System.out.println("Sum="+sum);
		
	}

}
