// How to sort element in array in asceding and desceding order
package BubbleSort.com;

import java.util.Arrays;
import java.util.Collections;

public class SortedArray {
	public static void main(String[] args) {
		String str[]= {"a","d","c","b","e","f"};
		
		
		
		System.out.println("----Before Sorting------");
		for(String string : str)
			
		{
		
			System.out.println(string);
			
		}
		Arrays.sort(str);
		System.out.println("---------After Sorting---------");
		for(String string : str)
		{
			
			 System.out.println(string);
			
		}
		Arrays.sort(str,Collections.reverseOrder());
		
		System.out.println("-----Sorting is Desceding Order------");
		for(String string : str)
		{
			
			 System.out.println(string);
			
		}
		
	}

}
