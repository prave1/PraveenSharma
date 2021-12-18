package Collections.com;

public class StockBuySell {
	
	public static void main(String[] args) {
		
		int arr[]= {10,20,40,80,90};
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
				
			}
			if(arr[i]-min>max)
			{
				max=arr[i]-min;
				
			}
			
		}
		System.out.println("Max Value="+max);
		
		System.out.println("Min Value="+min);
		
	}

}
