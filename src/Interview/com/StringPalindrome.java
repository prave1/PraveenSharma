package Interview.com;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
		String s="mom";
		String x="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			x=x+s.charAt(i);
		}
		
		if(x.equals(s))
		{
			System.out.println("Palindrome");
		}
		
		
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}

}
