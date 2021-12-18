// WAP to find a factors of a number from 1 to 100
package Interview.com;

public class FactorsNumberHundred {
	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++)
		{
			System.out.println("Factors of a Number :"+i+" are");
			
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
				{
				System.out.println(""+j);
				}
			}
		}
	}

}
