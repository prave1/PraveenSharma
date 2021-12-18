// Wap to check String is Palindrome or not
package BubbleSort.com;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		
		String reverse="";
         
		System.out.println("Enter the Input String");
		Scanner sc= new Scanner(System.in);
		String orginal=sc.nextLine();
		
		for(int i=orginal.length()-1; i>=0; i--)
		{
			reverse=reverse+orginal.charAt(i);
		}
		
		if(orginal.equals(reverse))
		{
			 System.out.println("Given String is Palindrome");
		}
		
		else
		{
			System.out.println("Given is not string");
		}
		
		
	}

}
