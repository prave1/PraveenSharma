package Interview.com;

public class SwapDemo {
	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		
		System.out.println("Before Swapping="+num1);
		System.out.println("Before Swapping="+num2);
	    swap(num1,num2);	
	}
	public  static void swap(int num1,int num2)
	{
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Before Swapping num1="+num1);
		
		System.out.println("After Swapping num2="+num2);
	}

}
