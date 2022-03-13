package Collections.com;

public class ReverseNumber {
	public static void main(String[] args) {
		int num=789;
		int lastdigit;
		int rev=0;
		while(num!=0)
		{
			lastdigit=num%10;
			rev=rev*10+lastdigit;
			
			num=num/10;
			
		}
		System.out.println(rev);
		
	}

}
