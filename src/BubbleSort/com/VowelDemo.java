//How to count number of vowel in a string in java
package BubbleSort.com;

import java.util.Scanner;

public class VowelDemo {
	
	public static void main(String[] args) {
		 System.out.println("Enter the String");
		 Scanner sc= new Scanner(System.in);
		 
		 String str=sc.nextLine();
		 char []chars=str.toCharArray();
		 
		 int count=0;
		 for(char c : chars)
		 {
			 switch(c)
			 {
			 case 'a':
			 case 'e':
			 case 'i':
			 case 'o':
			 case 'u':
				  
				 
				 count++;
				 break;
				 
				 
			 }
		 }
		 
		 System.out.println("Number of vowels in String="+count);
	}

}
