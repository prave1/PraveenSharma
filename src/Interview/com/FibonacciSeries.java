// Write a java Program to print fibonacci Series Using Loop
/*
 * A Series of number in which each number (fibonacci Number) is the sum of the two Preceding numbers. the Simplest in the series 1,1
 * 2,3,5,8 etc
 * 
 * 
 */
package Interview.com;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int max=10;
		int n1=0;
		int n2=1;
		
		for(int i=1; i<=max; i++)
		{
        System.out.println(n1+" ");
		int sum=n1+n2;      //0+1;
		 n1=n2;
		 n2=sum;
		 
		
		}
	}

}
