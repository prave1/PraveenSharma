package BubbleSort.com;

public class PalindromeInString {
	public static void main(String[] args) {
		
		String s="Praveen";
		String s1="";
	    int len=s.length();
		
		for(int i=len-1; i>=0; i--)
		{
			 s1=s1+s.charAt(i);
			
		}
		
		if(s.equals(s1))
		{
			System.out.println("Palindrome");
		}
		
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
