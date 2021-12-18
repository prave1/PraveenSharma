package Collections.com;

public class LeftRoted {
	public static void main(String[] args) {
		
		int arr[]= {46,20,30,40,50};
		
		int temp=arr[0];  // Store the first in the temp variable temp=10
		
		for(int i=1; i<arr.length; i++)  // Shift one element to the left
		{
			arr[i-1]=arr[i];
			
		}
		arr[arr.length-1]=temp;  // Store the temp value in the last Postion
		
		 for(int i: arr)
		 {
			 System.out.println(i);
		 }
		
	}

}
