// Write a java Program to check given input character is alphabet???
package Interview.com;

import java.util.Scanner;

public class AlphabetCheck {
	
	public static void main(String[] args) {
		System.out.println("Enter a character");
		
		Scanner sc= new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='z'))
		{
			System.out.println("The given character is alphabet");
		}
		
		else
		{
			System.out.println("The given character is not alphabet");
		}
		
	}

}
