//How to find largest and smallest numbers in an array in java

/*
 * 1.Create an integer array with some elements {}
 * 
 * 
 * 
 */
package BubbleSort.com;

public class FindLargestNumber {
	public static void main(String[] args) {
		
		int intArray[]= new int[]{1,100,20,30,50};
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		
		
		       
	 for(int number: intArray)
		{
			if(number>largest)
			{
				largest=number;
			}
			
			else if(number<smallest)
			{
				smallest=number;
				
			}
		}
		
		System.out.println("Largest Number in array="+largest);
		
		System.out.println("Smallest Number in array="+smallest);
		
	}
	

}
