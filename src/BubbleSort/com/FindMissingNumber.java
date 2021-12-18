 /* How to Find Missing Number in an array in java
 * {1,2,3,4,6}; Find Misssing Number=5
 * Expected Total Result=6*7/2=21
 * Actual Total=16
 * Expected Total Acual Total=21-16=5
 * 
 * 1)Initalize one Integer array
 * 2)Need to know actual array Size
 * 3)Calcultate Excepted total with n(n+1)/2 Format
 * 4)Calculate actual total by adding each element in the array
 * 5)DeductExpected and actual which will give you missing number in array
 */
package BubbleSort.com;

import java.util.Arrays;

public class FindMissingNumber {
	public static void main(String[] args) {
		
		int []array= {1,2,3,5};
		int missingNumber=getMissingNumber(array,5);
		
		System.out.printf("Missing Number in array %s is %d %n ",Arrays.toString(array),missingNumber);
		
	}

	public static int getMissingNumber(int[] array, int n) {
		int actualSum=0;
		int expectedsum=n*(n+1)/2;
		for(int i : array)
		{
			actualSum=actualSum+i;
		}
		
		return expectedsum-actualSum;
	}

}
