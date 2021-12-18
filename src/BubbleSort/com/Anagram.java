// Write a java Program to  check two String are Anagrams are not Using arrays Comparison
/*
 * Ans:--Two String are anagram if they contain same character but in diffrent order
 * Exam: Java avaj
 * 1.Take tow String as input it
 * 2.Convert two string to character array
 * 3. Sort two String arrays using arrays.sort() method
 * 4.Compare two string if they are equal they are anagrams otherwise they are not
 * 
 */
package BubbleSort.com;

import java.util.Arrays;

public class Anagram { 
	public static void main(String args[])
	{
		String str1="java;";
		String str2="sharma";
		
		System.out.println("Both String are anagrams="+anagramCheck(str1,str2));
		
	}
	
	public static boolean anagramCheck(String str1, String str2)
	{
		char[]charArrayFromString1=str1.toCharArray();
		char[]charArrayFromString2=str2.toCharArray();
		
		Arrays.sort(charArrayFromString1);
		Arrays.sort(charArrayFromString2);
		return Arrays.equals(charArrayFromString1,charArrayFromString2);
		
	}

}
