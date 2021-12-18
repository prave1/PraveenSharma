// WAP TO CHECK THE INPUT NUMBER IS PRIME OR NOT IN JAVA

package BubbleSort.com;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
	
		boolean prime=true;
		System.out.println("Enter number to Check Prime or NOt=");
		Scanner sc= new Scanner(System.in);
		
		Integer num=sc.nextInt();
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				prime=false;
				
				
				
			}
		}
		
		if(prime==true)
		
		System.out.println("Given Number is a Prime Numbers");
		
		else
			System.out.println("Given not prime Number");
		
	}
	
	

}
