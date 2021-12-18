// Write a java Program to find largest of three number in java
package Interview.com;

import java.util.Scanner;

public class FindThreeLargest {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the three Disticit Integer");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		if(x>y && x>z)
		{
			System.out.println(x+" is Largest");
			
		}
		else if(x>y && x>z)
		{
			System.out.println(y+" is Largest");
		}
		else if(z>x && z>y)
		{
			System.out.println(z+" is Largest");
		}
	}

}
