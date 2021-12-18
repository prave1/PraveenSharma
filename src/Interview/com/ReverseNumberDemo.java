//Write a java Program to find reverse of a number in java-------
package Interview.com;

public class ReverseNumberDemo {
	public static void main(String[] args) {
		Integer number=123456;
		String numberString=String.valueOf(number);
		
		String reverse="";
		for(int i=numberString.length()-1; i>=0; i--)
		{
		 reverse=reverse+numberString.charAt(i);
		 
		}
		
		System.out.println(Integer.valueOf(reverse));
		
	}

}
