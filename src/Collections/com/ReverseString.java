//How to reverse a String in java Using Recursion--------
package Collections.com;

public class ReverseString {
	
	public static void main(String[] args) {
		
		//String s="Sandy";
		
		String s="Praveen";
		
	System.out.println(recursiveString(s));
		
	}
	private static String recursiveString(String s)
	{
		if(s==null||s.length()<=1)
		{
			return s;
		}
		
		return recursiveString(s.substring(1))+s.charAt(0);
	}


}
