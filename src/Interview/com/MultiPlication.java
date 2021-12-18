// Write a java Program to print multiplication table
/*
 * If we want to print multiplication table for 7
 */
package Interview.com;

import java.util.Scanner;

public class MultiPlication {
	public static void main(String[] args) {
		
		int n, i;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Number to Print Multiplication:");
		n=sc.nextInt();
		for( i=1; i<=10; i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
			
		}
		
		
	}

}
