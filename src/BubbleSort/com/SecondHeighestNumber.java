// Write a java Program to find Second Largest Element in the array
package BubbleSort.com;

import java.util.Arrays;

public class SecondHeighestNumber {
	public static void main(String[] args) {
		
		int array[]= {20,5,6,16,10};
		Arrays.sort(array);
		
		System.out.println("First Highest Element in th Array="+array[array.length-1]);
		
		System.out.println("Third Highest Element in th Array="+array[array.length-3]);
	}

}
