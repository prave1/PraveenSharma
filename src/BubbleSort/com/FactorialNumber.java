/*Write a java Program to find a factorial of a number in java
 * 2!=1*2
 * Example:---3!=1*2*3
 *            4!=1*2*3*4
 *  Step((1) Take an input Number
 *  Step(2)  Take on variable fact and initialize it to 1
 *  Step(3)  Iterate up to that number to find factorial and store it n fact variable
 *  step(4) Finally Print the Factorial
 */
package BubbleSort.com;

import java.util.Scanner;

public class FactorialNumber {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
	    System.out.println("Enter the Numbers:");
	    int n=sc.nextInt();
	    
		
		int fact=1;
		for(int i=1; i<=n; i++)
		{
			fact=fact*i;   
		}
		
		System.out.println("Factorial="+fact);
	}

}
