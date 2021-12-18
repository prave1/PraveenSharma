//Wap to find reverse of a string in java
package Interview.com;

import java.util.Scanner;

public class ReverseString {
	public static void main(String args[])
	{
		String input,reverse="";
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the String:");
		input=sc.nextLine();
		for(int i=input.length()-1; i>=0; i--)
		{
			reverse=reverse+input.charAt(i);
		}
		if(input.equals(reverse))
		{
			//System.out.println("Reverse String="+reverse);
			
			System.out.println("Palindrome");
			
			
		}		
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}

}
