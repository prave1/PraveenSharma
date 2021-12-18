package test.com;

public class DigitReverse {
	public static void main(String[] args) {
		
		int n=123;
		int n1=n;
		int rev=0;
		while(n>0)
		{
			int digit=n%10;
			
			rev=rev*10+digit;
			
			n=n/10;		
		}
		
		System.out.println(rev);
	}

}
