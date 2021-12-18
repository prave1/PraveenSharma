package Collections.com;

public class EvenOddCount {
	
	public static void main(String[] args) {
		
	 int n=123456;
	 int evenCount=0, oddCount=0;
	 while(n>0)
	 {
		 int rem=n%10;
		 if(rem%2==0)
			evenCount++;
		 else
			 oddCount++;
		     n=n/10;
	 }
	 
	 System.out.println("Even Count="+evenCount);
	 
	 System.out.println("odd Count="+oddCount);
		
	}

}
