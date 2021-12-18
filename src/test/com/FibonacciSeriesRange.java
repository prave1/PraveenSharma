package test.com;

import java.util.Scanner;

public class FibonacciSeriesRange {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Range:-----");
		int range=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		
		System.out.println(a);
		System.out.println(b);
		for(int i=2; i<=range; i++)
		{
			//c=a+b;
			if(c<=range)
			{
				 c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
		}
	}

}
